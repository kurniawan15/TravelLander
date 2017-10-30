<%-- 
    Document   : edit_modaTransportasi
    Created on : Oct 30, 2017, 11:06:55 AM
    Author     : Dewi Roaza
--%>

<%@page import="model.ModaTransportasi"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="DAO.DAOModaTransportasi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1>Edit Moda Transportasi</h1>
        <form action="moda_transportasi?data=moda_transportasi&proses=update-moda_transportasi" method="post">
            <table style="margin:20px auto;">
            <%
                String kdModa = request.getParameter("Kd_Moda");
                DAOModaTransportasi kt = new DAOModaTransportasi();
                kt.setKdModa(kdModa);
                List<ModaTransportasi> data = new ArrayList<ModaTransportasi>();
                data = kt.cariID(); 
                if (data.size() > 0) {

            %>
		<tr>
                    <td>Tipe</td>
                    <td><input type="text" name="Tipe_Moda" value="<%=data.get(0).getTipeModa()%>"></td>
		</tr>
		<tr>
                    <td>Kd Moda</td>
                    <td><input type="text" name="Kd_Moda" value="<%=data.get(0).getKdModa()%>"></td>
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
