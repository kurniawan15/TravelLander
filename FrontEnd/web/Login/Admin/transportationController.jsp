<%-- 
    Document   : transportationController
    Created on : Oct 16, 2017, 9:47:30 AM
    Author     : Lenovo
--%>

<%@page import="repository.ModaTransportasiDAO"%>
<%@page import="model.ModaTransportasi"%>
<%@page import = "java.io.*,java.util.*,java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
   String driverName = "com.mysql.jdbc.Driver"; // Driver Untuk Koneksi Ke MySQL  
   String jdbc = "jdbc:mysql://";  
   String host = "localhost:"; // Bisa Menggunakan IP Anda, Cnth : 192.168.100.100  
   String port = "3306/"; // Port ini port MySQL  
   String database = "travelender"; // Ini Database yang akan digunakan  
   String url = jdbc + host + port + database;  
   String username = "root"; // username default mysql  
   String password = "";  

    ModaTransportasiDAO modaDAO = new ModaTransportasiDAO(url,username,password);

    String kdModa = "KMT09";
    String tipeModa = request.getParameter("nama_moda");
    
    
    ModaTransportasi moda = new ModaTransportasi(kdModa, tipeModa);
    boolean row = modaDAO.insert(moda);
    
    if(row == true  ){
        response.sendRedirect("transportation.jsp");
    }
    else{

    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            out.println("GAGAL");
        }
        %>
        <h1>Hello World!</h1>
    </body>
</html>
