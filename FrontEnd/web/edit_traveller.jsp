<%-- 
    Document   : edit_traveller
    Created on : Oct 29, 2017, 9:53:07 PM
    Author     : Fadhil-PC
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Traveller"%>
<%@page import="DAO.DAOTraveller"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <center><h1>Edit Traveller </h1></center>
        <form action="traveller?data=traveller&proses=update-traveller" method="post">
            <table style="margin:20px auto;">
            <%
                String kd_traveller = request.getParameter("Kd_Traveller");
                DAOTraveller tr = new DAOTraveller();
                tr.setKd_Traveller(kd_traveller);
                List<Traveller> data = new ArrayList<Traveller>();
                data = tr.cariID(); 
                if (data.size() > 0) {

            %>
		<tr>
                    <td>Nama</td>
                    <td><input type="text" name="Nama_Traveller" value="<%=data.get(0).getNama_Traveller()%>"></td>
		</tr>
		<tr>
                    <td>Username</td>
                    <td><input type="text" name="Username" value="<%=data.get(0).getUsername()%>"></td>
		</tr>
                <tr>
                    <td>Password</td>
                    <td><input type="text" name="Password" value="<%=data.get(0).getPassword()%>"></td>
                    
		</tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="Email" value="<%=data.get(0).getEmail()%>"></td>
                    <td><input type="hidden" name="Kd_Traveller" value="<%=data.get(0).getKd_Traveller()%>"></td>
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
