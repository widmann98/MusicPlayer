<?php

class DbOperation
{
    //datenbankverbindungslink
    private $con;
 
    function __construct()
    {
        require_once '/DbConnect.php';
 
        $db = new DbConnect();

        $this->con = $db->connect();
    }
    
 //Playlist eintrog in die Datenbank..
 function createPlaylist($name){
 $stmt = $this->con->prepare("INSERT INTO playlist (playlist_id, playlist_name) VALUES ($name)");
 $stmt->bind_param($name);
 if ($stmt->execute()) {
            return true;
        }
        return false; 
 }
 
 //Zoag wosmor in dor Datenbank fir Playlists hom
 function getPlaylist(){
 $stmt = $this->con->prepare("SELECT name, playlist_id from playlist");
 $stmt->execute();
 $stmt->bind_result($id, $name);
 
 $playlists = array(); 
 
 //mocht ausn statement meine id & nome
 while($stmt->fetch()){
 $playlist  = array();
 $playlist['playlist_id'] = $id; 
 $playlist['playlist_name'] = $name; 
 
 array_push($playlists, $playlist);
 }
 
 return $playlist; 
 }
 
 function updatePlaylist($id, $name){
 $stmt = $this->con->prepare("UPDATE playlist SET playlist_name = ? WHERE playlist_id = ?");
 $stmt->bind_param("si", $name, $id);
 if($stmt->execute())
 return true; 
 return false; 
 }

 function deletePlaylist($id){
 $stmt = $this->con->prepare("DELETE FROM playlist WHERE playlist_id = ? ");
 $stmt->bind_param("i", $id);
 if($stmt->execute()){
    return true;
 }
 else{
    return false;
 }
 }
 function getSong($name){ //ws tua i mt dor url
 $stmt = $this->con->prepare("INSERT INTO song (id, name, url, dauer, interpreter) VALUES ()"); //Values.. where are you?
 $stmt->bind_param($name);
 if ($stmt->execute()) {
            return true;
        }
        return false; 
 }
 function 
    
    
 }
}