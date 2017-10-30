<%-- 
    Document   : tambah_provinsi
    Created on : Oct 29, 2017, 8:06:14 PM
    Author     : Cyber Pegasus
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Input</title>
    </head>
    <body>
        <center><h1>Input Provinsi</h1></center>
        <form action="provinsi?data=provinsi&proses=input-provinsi" method="post">
            <table style="margin:20px auto;">
                <tr>
                    <td>Id Provinsi</td>
                    <td><input type="text" name="id_provinsi"></td>
		</tr>
		<tr>
                    <td>Nama Provinsi</td>
                    <td><input type="text" name="nama_provinsi"></td>
		</tr>
		<tr>
                    <td>Ibu Kota</td>
                    <td><input type="text" name="ibu_kota"></td>
		</tr>
		<tr>
                    <td></td>
                    <td><input type="submit" value="Tambah"></td>
		</tr>
            </table>
	</form>	
    
    </body>
</html>
