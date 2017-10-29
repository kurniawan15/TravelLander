<%-- 
    Document   : edit_kota
    Created on : Oct 29, 2017, 3:52:29 PM
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
        <title>JSP Page</title>
    </head>
    <body>
        <center><h1>Edit User </h1></center>
        <form action="city?data=kota&proses=update-kota" method="post">
            <table style="margin:20px auto;">
            <%
                String idKota = request.getParameter("id_kota");
                DAOKota kota = new DAOKota();
                kota.setIdKota(idKota);
                List<Kota> data = new ArrayList<Kota>();
                data = kota.cariID(); 
                if (data.size() > 0) {

            %>
		
		<tr>
                    <td>Nama Kota</td>
                    <td><input type="text" name="nama_kota" value="<%=data.get(0).getNamaKota()%>"></td>
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
