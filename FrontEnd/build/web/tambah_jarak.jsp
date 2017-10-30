<%-- 
    Document   : tambah_jarak
    Created on : Oct 30, 2017, 8:19:30 PM
    Author     : Dewi Roaza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>input</title>
    </head>
    <body>
        <h1>Input Jarak</h1>
        <form action="jarak?data=jarak&proses=input-jarak" method="post">
            <table style="margin:20px auto;">
                
                <tr>
                    <td>Kode Lokasi Awal</td>
                    <td><input type="text" name="Kd_Lokasi_Awal"></td>
		</tr>
                <tr>
                    <td>Kode Lokasi Akhir</td>
                    <td><input type="text" name="Kd_Lokasi_Akhir"></td>
		</tr>
		<tr>
                    <td>Jarak</td>
                    <td><input type="text" name="Jarak"></td>
		</tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Tambah"></td>
		</tr>
            </table>
	</form>
    </body>
</html>
