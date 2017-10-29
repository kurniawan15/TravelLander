<%-- 
    Document   : tambah_traveller
    Created on : Oct 29, 2017, 10:01:58 PM
    Author     : Fadhil-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center><h1>Input Traveller</h1></center>
        <form action="traveller?data=traveller&proses=input-traveller" method="post">
            <table style="margin:20px auto;">
                <tr>
                    <td>KdTraveller</td>
                    <td><input type="text" name="Kd_Traveller"></td>
		</tr>
		<tr>
                    <td>Nama Traveller</td>
                    <td><input type="text" name="Nama_Traveller"></td>
		</tr>
		<tr>
                    <td>Username</td>
                    <td><input type="text" name="Username"></td>
		</tr>
                <tr>
                    <td>Password</td>
                    <td><input type="text" name="Password"></td>
		</tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="Email"></td>
		</tr>
		<tr>
                    <td></td>
                    <td><input type="submit" value="Tambah"></td>
		</tr>
            </table>
	</form>
    </body>
</html>
