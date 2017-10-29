

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Provinsi"%>
<%@page import="DAO.DAOProvinsi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <center><h1>Edit User </h1></center>
        <form action="provinsi?data=provinsi&proses=update-provinsi" method="post">
            <table style="margin:20px auto;">
            <%
                String id_provinsi = request.getParameter("id_provinsi");
                DAOProvinsi prov = new DAOProvinsi();
                prov.setIdProvinsi(id_provinsi);
                List<Provinsi> data = new ArrayList<Provinsi>();
                data = prov.cariID(); 
                if (data.size() > 0) {

            %>
		<tr>
                    <td>ID PROV</td>
                    <td><input type="text" name="id_provinsi" value="<%=data.get(0).getIdProvinsi()%>"></td>
		</tr>
                <tr>
                    <td>Nama PROV</td>
                    <td><input type="text" name="nama_provinsi" value="<%=data.get(0).getNamaProvinsi()%>"></td>
		</tr>
		<tr>
                    <td>Ibu Kota</td>
                    <td><input type="text" name="ibu_kota" value="<%=data.get(0).getIdProvinsi()%>"></td>
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
