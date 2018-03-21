<?php

//Class DbConnect
 class DbConnect
 {
 //Variable to store database link
 private $con;
 
 //Class constructor
 function __construct()
 {
 
 }
 
 //This method will connect to the database
 function connect()
 {
 include_once '/Constants.php';
 
 //connecting to mysql database
 $this->con = new mysqli(DB_HOST, DB_USER, DB_PASS, DB_NAME);
 
 //Checking if any error occured while connecting
 if (mysqli_connect_errno()) {
 echo "Keine Connection: " . mysqli_connect_error();
 }
 
 //finally returning the connection link 
 return $this->con;
 }
 
 }

