<%-- 
    Document   : tambah_perjalanan
    Created on : Oct 30, 2017, 10:37:24 PM
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
        <h1>Input Perjalanan</h1>
        <form action="perjalanan?data=perjalanan&proses=input-perjalanan" method="post">
            <table style="margin:20px auto;">
              
                <tr>
                    <td>Kode Transportasi Publik</td>
                    <td><input type="text" name="Kd_Transportasi_Publik"></td>
		</tr>
		<tr>
                    <td>Kode Jarak</td>
                    <td><input type="text" name="Kd_Jarak"></td>
		</tr>
                <tr>
                    <td>Kode Transportasi Pribadi</td>
                    <td><input type="text" name="Kd_Transportasi_Pribadi"></td>
		</tr>
                <tr>
                    <td>Waktu Tempuh</td>
                    <td><input type="text" name="Waktu_tempuh"></td>
		</tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Tambah"></td>
		</tr>
            </table>
	</form>
    </body>
</html>
