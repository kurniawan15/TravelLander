

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Input</title>
    </head>
    <body>
        <center><h1>Input Event</h1></center>
        <form action="addEvent?data=event&proses=input-event" method="post">
            <table style="margin:20px auto;">
                
                <input type="hidden" name="kd_traveller" value="TR0001" />
                
		<tr>
                    <td>Nama Event</td>
                    <td><input type="text" name="nama_event"></td>
		</tr>
		<tr>
                    <td>Id pejalanan</td>
                    <td><input type="text" name="id_perjalanan"></td>
		</tr>
               
                <tr>
                    <td>Waktu Mulai </td>
                    <td><input type="text" name="waktu_mulai"></td>
		</tr>
                <tr>
                    <td>Waktu Selesai</td>
                    <td><input type="text" name="waktu_selesai"></td>
		</tr>
                <tr>
                    <td>Keterangan</td>
                    <td><input type="text" name="keterangan"></td>
		</tr>
		<tr>
                    <td></td>
                    <td><input type="submit" value="Tambah"></td>
		</tr>
            </table>
	</form>	
    
    </body>
</html>