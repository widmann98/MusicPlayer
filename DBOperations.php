<?php

class DbOperation
{
    //Database connection link
    private $con;
 
    //Class constructor
    function __construct()
    {
        //Getting the DbConnect.php file
        require_once '/DbConnect.php';
 
        //Creating a DbConnect object to connect to the database
        $db = new DbConnect();
 
        //Initializing our connection link of this class
        //by calling the method connect of DbConnect class
        $this->con = $db->connect();
    }
 
 /*
 * The create operation
 * When this method is called a new record is created in the database
 */
 function createPlaylist($name){
 $stmt = $this->con->prepare("INSERT INTO playlist (id, name) VALUES ($name)");
 $stmt->bind_param($name);
 if ($stmt->execute()) {
            return true;
        }
        return false; 
 }
 
 /*
 * The read operation
 * When this method is called it is returning all the existing record of the database
 */
 function getPlaylist(){
 $stmt = $this->con->prepare("SELECT name, id from playlist");
 $stmt->execute();
 $stmt->bind_result($id, $name);
 
 $playlists = array(); 
 
 while($stmt->fetch()){
 $playlist  = array();
 $playlist['id'] = $id; 
 $playlist['name'] = $name; 
 
 array_push($playlists, $playlist); 
 }
 
 return $playlist; 
 }
 
 /*
 * The update operation
 * When this method is called the record with the given id is updated with the new given values
 */
 function updatePlaylist($id, $name){
 $stmt = $this->con->prepare("UPDATE playlist SET name = ? WHERE id = ?");
 $stmt->bind_param("si", $name, $id);
 if($stmt->execute())
 return true; 
 return false; 
 }
 
 
 /*
 * The delete operation
 * When this method is called record is deleted for the given id 
 */
 function deletePlaylist($id){
 $stmt = $this->con->prepare("DELETE FROM playlist WHERE id = ? ");
 $stmt->bind_param("i", $id);
 if($stmt->execute()){
    return true;
 }
 else{
    return false;
 }
 
 
  
 }
}