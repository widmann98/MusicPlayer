<?php

 class DbConnect
 {
 //datenbankverbindungslink
 private $con;
 
 function __construct()
 {
 
 }
 
 //Datenbankverbindung
 function connect()
 {
 include_once '/Constants.php';
 
 $this->con = new mysqli(DB_HOST, DB_USER, DB_PASS, DB_NAME);
 
 //Wenn nicht erfolgreich..
 if (mysqli_connect_errno()) {
 echo "Keine Connection: " . mysqli_connect_error();
 }
 
 return $this->con;
 }
 }

