<%-- 
    Document   : edit_lokasi
    Created on : Oct 30, 2017, 6:14:44 PM
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
    <div class="title">Edit Lokasi </div>  
        <div class="imput">
            <form action="../../provinsi?data=provinsi&proses=input-provinsi" method="post">
                Kode Lokasi
                <input type="text" placeholder="Masukan kode Lokasi" name="#i" required>
                Nama Lokasi
                <input type="text" placeholder="Masukan Nama Lokasi" name="#" required>
                Alamat
                <input type="text" placeholder="Masukan Alamat" name="#" required>
                Kota
                <select class="pilih_kota">
                    <option value="volvo">Volv33o</option>
                    <option value="saab">Saab</option>
                    <option value="opel">Opel</option>
                    <option value="audi">Audi</option>
                </select>
                Provinsi
                <select class="pilih_kota">
                    <option value="volvo">Volv33o</option>
                    <option value="saab">Saab</option>
                    <option value="opel">Opel</option>
                    <option value="audi">Audi</option>
                </select>
                <button type="submit" name="Tambah">Update Data</button>
                
            </form>
        </div>
</div>
</html>

