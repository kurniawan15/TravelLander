<%-- 
    Document   : edit_jarak
    Created on : Oct 30, 2017, 8:25:21 PM
    Author     : Dewi Roaza
--%>

<%@page import="model.Jarak"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="DAO.DAOJarak"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1>Edit Jarak</h1>
        <form action="jarak?data=jarak&proses=update-jarak" method="post">
            <table style="margin:20px auto;">
            <%
                String kdJarak = request.getParameter("Kd_Jarak");
                DAOJarak kt = new DAOJarak();
                kt.setKdJarak(kdJarak);
                List<Jarak> data = new ArrayList<Jarak>();
                data = kt.cariID(); 
                if (data.size() > 0) {

            %>
		<tr>
                    <td>Kode Jarak</td>
                    <td><input type="text" name="Kd_Jarak" value="<%=data.get(0).getKdJarak()%>"></td>
		</tr>
		<tr>
                    <td>Kode Lokasi Awal</td>
                    <td><input type="text" name="Kd_Lokasi_Awal" value="<%=data.get(0).getKdLokasiAwal()%>"></td>
                </tr>
                <tr>
                    <td>Kode Lokasi Akhir</td>
                    <td><input type="text" name="Kd_Lokasi_Akhir" value="<%=data.get(0).getKdLokasiAkhir()%>"></td>
                </tr>
                <tr>
                    <td>Jarak</td>
                    <td><input type="text" name="Jarak" value="<%=data.get(0).getJarak()%>"></td>
                </tr>
		<tr>
                    <td></td>
                    <td><input type="submit" value="Update"></td>
		</tr>
                  <%}%>
            </table>
          
	</form>
    </body>
</html>
