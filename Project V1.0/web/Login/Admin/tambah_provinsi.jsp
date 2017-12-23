<%-- 
    Document   : tambah_provinsi
    Created on : Oct 30, 2017, 3:34:40 PM
    Author     : Hari
--%>

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
    <div class="title">Tambah Provinsi </div>  
        <div class="imput">
            <form action="../../provinsi?data=provinsi&proses=input-provinsi" method="post">
                Id Provinsi
                <input type="text" placeholder="Masukan id Provinsi" name="id_provinsi" required>
                Nama Provinsi
                <input type="text" placeholder="Masukan Nama Provinsi" name="nama_provinsi" required>
                Ibukota
                <input type="text" placeholder="Masukan Ibu Kota" name="ibu_kota" required>
               
                <button type="submit" name="Tambah">Update Data</button>
                
            </form>
        </div>
</div>
</html>