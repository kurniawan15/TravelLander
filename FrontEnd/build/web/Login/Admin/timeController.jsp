<%-- 
    Document   : timeController
    Created on : Oct 16, 2017, 6:52:35 PM
    Author     : Lenovo
--%>

<%@page import="model.Perjalanan"%>
<%@page import="repository.PerjalananDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    String driverName = "com.mysql.jdbc.Driver"; // Driver Untuk Koneksi Ke MySQL  
    String jdbc = "jdbc:mysql://";  
    String host = "localhost:"; // Bisa Menggunakan IP Anda, Cnth : 192.168.100.100  
    String port = "3306/"; // Port ini port MySQL  
    String database = "travelender"; // Ini Database yang akan digunakan  
    String jdbcURL = jdbc + host + port + database;  
    String jdbcUsername = "root"; // username default mysql  
    String jdbcPassword = "";

    
    PerjalananDAO perDAO = new PerjalananDAO(jdbcURL, jdbcUsername, jdbcPassword);
    String idPerjalan;
    int waktuTempuh;
    int jarakTempuh;
    String kdLokasiAwal;
    String kdLokasiAkhir;
    String kdModaTransportasi;
    
    Perjalanan per = new Perjalanan(idPerjalanan, jarakTempuh, waktuTempuh, lokasiAwal, lokasiAkhir, transportasi);
    perDAO.insert(per);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
