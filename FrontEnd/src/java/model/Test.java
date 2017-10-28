/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Cyber Pegasus
 */
 import java.sql.SQLException;  
import Database.KoneksiDB;
 /**  
  *  
  * @author Wahidin-Alambiyah  
  */  
 public class Test {  
   public static void main(String[] args) throws SQLException {  
       KoneksiDB connection = new KoneksiDB();  
     connection.koneksi();
   }  
 }  
