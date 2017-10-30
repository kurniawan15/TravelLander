<%-- 
    Document   : edit_perjalanan
    Created on : Oct 30, 2017, 10:53:44 PM
    Author     : Dewi Roaza
--%>

<%@page import="model.Perjalanan"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="DAO.DAOPerjalanan"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1>Edit Perjalanan</h1>
        <form action="perjalanan?data=perjalanan&proses=update-perjalanan" method="post">
            <table style="margin:20px auto;">
            <%
                String idPerjalanan = request.getParameter("id_perjalanan");
                DAOPerjalanan kt = new DAOPerjalanan();
                kt.setKdJarak(idPerjalanan);
                List<Perjalanan> data = new ArrayList<Perjalanan>();
                data = kt.cariID(); 
                if (data.size() > 0) {

            %>
		<tr>
                    <td>Id Perjalanan</td>
                    <td><input type="text" name="id_perjalanan" value="<%=data.get(0).getIdPerjalanan()%>"></td>
		</tr>
		<tr>
                    <td>Kode Transpotasi Publik</td>
                    <td><input type="text" name="Kd_Transport_Publik" value="<%=data.get(0).getKdTransportasiPublik()%>"></td>
                </tr>
                <tr>
                    <td>Kode jarak</td>
                    <td><input type="text" name="Kd_Jarak" value="<%=data.get(0).getKdJarak()%>"></td>
                </tr>
                <tr>
                    <td>Kode Transpotasi Pribadi</td>
                    <td><input type="text" name="Kd_Transportasi_Pribadi" value="<%=data.get(0).getKdTransportasiPribadi()%>"></td>
                </tr>
                <tr>
                    <td>Waktu Tempuh=</td>
                    <td><input type="text" name="Waktu_tempuh" value="<%=data.get(0).getWaktuTempuh()%>"></td>
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
