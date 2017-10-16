<%-- 
    Document   : lokasiController
    Created on : Oct 16, 2017, 7:29:09 PM
    Author     : Dewi Roaza
--%>

<%@page import="model.Lokasi"%>
<%@page import="repository.LokasiDAO"%>
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

    LokasiDAO lokasiDAO = new LokasiDAO(url,username,password);

    String kdLokasi = lokasiDAO.getNewKodeLokasi();
    String namaLokasi = request.getParameter("nama_lokasi");
    String alamat = request.getParameter("alamat");
    Lokasi lokasi = new Lokasi(kdLokasi, namaLokasi, alamat);
    boolean row = lokasiDAO.insert(lokasi);
    
    if(row == true  ){
        response.sendRedirect("DataPlace.jsp");
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
