<%-- 
    Document   : tambah-kota
    Created on : Oct 30, 2017, 12:58:51 AM
    Author     : Hari
--%>
<%@page import="model.Kota"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Database.KoneksiDB"%>
<%@page import="DAO.DAOKota"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Super Admin</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<div class="widget">
    <div class="title">Edit Kota </div>  
        <div class="imput">
            <form action="../../provinsi?data=provinsi&proses=update-provinsi" method="post">

                Kode Kota
                <input type="text" placeholder="<%//=data.get(0).getIdProvinsi()%>" name="id_provinsi" required>
                Id Provinsi Provinsi
                <input type="text" placeholder="<%//=data.get(0).getNamaProvinsi()%>" name="nama_provinsi" required>
                Nama Kota
                <input type="text" placeholder="<%//=data.get(0).getIbuKota()%>" name="ibu_kota" required>
               
               <button type="submit" name="Tambah">Update Data</button>
                <%//}%>
            </form>
        </div>
</div>
</html>
