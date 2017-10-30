<%-- 
    Document   : tambah_kota
    Created on : Oct 29, 2017, 9:16:39 PM
    Author     : Fadhil-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Input</title>
    </head>
    <body>
        <center><h1>Input Kota</h1></center>
        <form action="kota?data=kota&proses=input-kota" method="post">
            <table style="margin:20px auto;">
		<tr>
                    <td>Nama Kota</td>
                    <td><input type="text" name="nama_kota"></td>
		</tr>
		<tr>
                    <td>KdProvinsi</td>
                    <td><input type="text" name="id_provinsi"></td>
		</tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Tambah"></td>
		</tr>
            </table>
	</form>
    </body>
</html>
