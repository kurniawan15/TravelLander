/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package test;  
 import java.sql.SQLException;  
 import traveller.controller.koneksi;
 
 /**
 *
 * @author Cyber Pegasus
 */
 
 public class percobaan {  
   public static void main(String[] args) throws SQLException {  
     koneksi connection = new koneksi();  
     connection.getKoneksi();  
   }  
 }  


