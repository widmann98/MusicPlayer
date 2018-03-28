<?php 
	require_once '../includes/DbOperation.php';

	//Parameter.. mir gian drfun aus das olle parametr stimmen
	function isTheseParametersAvailable($params){
		$available = true; 
		$missingparams = ""; 
		
		foreach($params as $param){
			if(!isset($_POST[$param]) || strlen($_POST[$param])<=0){
				$available = false; 
				$missingparams = $missingparams . ", " . $param; 
			}
		}
		
		//Wenn Parameter fahln
		if(!$available){
			$response = array(); 
			$response['error'] = true; 
			$response['message'] = 'Parameters ' . substr($missingparams, 1, strlen($missingparams)) . ' missing';
			
			//zoag in fahler
			echo json_encode($response);
			
			//Stopts
			die();
		}
	}
	
	//an array to display response
	$response = array();
	
    //In Android beim aufriafn far API.php mit ?apicall mitgebn
	if(isset($_GET['apicall'])){ // Mit apicall konni dornoch die gonzen cases aufriafn..
		
		switch($_GET['apicall']){
			
			case 'createPlaylist':
				isTheseParametersAvailable(array('playlist_id','playlist_name'));
				
				$db = new DbOperation();
				
                //Datenbankeintrag..
				$result = $db->createPlaylist(
					$_POST['playlist_id'],
					$_POST['playlist_name']
				);
				
				if($result){
					$response['error'] = false; 

					$response['message'] = 'Playlist was added';

					$response['playlists'] = $db->getPlaylists();
				}else{

					$response['error'] = true; 

					$response['message'] = 'Some error occurred please try again';
				}
				
			break; 
			
			case 'getPlaylists':
				$db = new DbOperation();
				$response['error'] = false; 
				$response['message'] = 'Request successfully completed';
				$response['playlists'] = $db->getPlaylists();
			break; 
			
			case 'updatePlaylist':
				isTheseParametersAvailable(array('id','name'));
				$db = new DbOperation();
				$result = $db->updatePlaylist(
					$_POST['playlist_id'],
					$_POST['playlist_name'],
				);
				
				if($result){
					$response['error'] = false; 
					$response['message'] = 'Playlist updated successfully';
					$response['playlists'] = $db->getPlaylist();
				}else{
					$response['error'] = true; 
					$response['message'] = 'Error';
				}
			break; 
			
			case 'deletePlaylist':

				//ID far playlist ws za löschen isch
				if(isset($_GET['playlist_id'])){
					$db = new DbOperation();
					if($db->deletePlaylist($_GET['playlist_id'])){
						$response['error'] = false; 
						$response['message'] = 'Playlist deleted successfully';
						$response['playlists'] = $db->getPlaylist();
					}else{
						$response['error'] = true; 
						$response['message'] = 'Some error occurred please try again';
					}
				}else{
					$response['error'] = true; 
					$response['message'] = 'Nothing to delete, provide an id please';
				}
			break; 
		}
		
	}else{
		//if it is not api call 
		//pushing appropriate values to response array 
		$response['error'] = true; 
		$response['message'] = 'Invalid API Call';
	}
	
	//displaying the response in json structure 
	echo json_encode($response);