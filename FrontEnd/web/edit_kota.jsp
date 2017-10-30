<%-- 
    Document   : edit_kota
    Created on : Oct 29, 2017, 9:19:50 PM
    Author     : Fadhil-PC
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Kota"%>
<%@page import="DAO.DAOKota"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <center><h1>Edit Kota </h1></center>
        <form action="kota?data=kota&proses=update-kota" method="post">
            <table style="margin:20px auto;">
            <%
                String id_kota = request.getParameter("id_kota");
                DAOKota kt = new DAOKota();
                kt.setIdKota(id_kota);
                List<Kota> data = new ArrayList<Kota>();
                data = kt.cariID(); 
                if (data.size() > 0) {

            %>
		<tr>
                    <td>Nama</td>
                    <td><input type="text" name="nama_kota" value="<%=data.get(0).getNamaKota()%>"></td>
		</tr>
		<tr>
                    <td>IdProvinsi</td>
                    <td><input type="text" name="id_provinsi" value="<%=data.get(0).getIdProvinsi()%>"></td>
                    <td><input type="hidden" name="id_kota" value="<%=data.get(0).getIdKota()%>"></td>
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
