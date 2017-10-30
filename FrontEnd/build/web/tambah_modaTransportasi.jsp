<%-- 
    Document   : tambah_modaTransportasi
    Created on : Oct 30, 2017, 10:47:24 AM
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
        <h1>Input Moda Transportasi!</h1></center>
        <form action="moda_transportasi?data=moda_transportasi&proses=input-moda" method="post">
            <table style="margin:20px auto;">
                <tr>
                    <td>Kode Moda</td>
                    <td><input type="text" name="Kd_Moda"></td>
		</tr>
		<tr>
                    <td>Tipe Moda</td>
                    <td><input type="text" name="Tipe_Moda"></td>
		</tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Tambah"></td>
		</tr>
            </table>
	</form>
    </body>
</html>
