

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Input</title>
    </head>
    <body>
        <center><h1>Input lokasi</h1></center>
        <form action="location?data=lokasi&proses=input-lokasi" method="post">
            <table style="margin:20px auto;">
                <tr>
                    <td>IdLokasi</td>
                    <td><input type="text" name="idLokasi"></td>
		</tr>
		<tr>
                    <td>Nama</td>
                    <td><input type="text" name="nama_lokasi"></td>
		</tr>
		<tr>
                    <td>Alamat</td>
                    <td><input type="text" name="alamat"></td>
		</tr>
		<tr>
                    <td></td>
                    <td><input type="submit" value="Tambah"></td>
		</tr>
            </table>
	</form>	
    
    </body>
</html>
