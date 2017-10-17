<%-- 
    Document   : edit_user
    Created on : Nov 22, 2016, 9:42:03 PM
    Author     : TutorialPedia.NET
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Lokasi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Latihan Java Web | TutorialPedia.NET</title>
    </head>
    <body>
        <center><h1>Edit User | TutorialPedia.NET</h1></center>
        <form action="NewControllerLokasi?data=lokasi&proses=update-lokasi" method="post">
            <table style="margin:20px auto;">
            <%
                String idLokasi = request.getParameter("idLokasi");
                Lokasi km = new Lokasi();
                km.setIdLokasi(idLokasi);
                List<Lokasi> data = new ArrayList<Lokasi>();
                data = km.cariID(); 
                if (data.size() > 0) {

            %>
		<tr>
                    <td>Nama</td>
                    <td><input type="text" name="nama_lokasi" value="<%=data.get(0).getNamaLokasi()%>"></td>
		</tr>
		<tr>
                    <td>Alamat</td>
                    <td><input type="text" name="alamat" value="<%=data.get(0).getAlamat()%>"></td>
                    <td><input type="hidden" name="idLokasi" value="<%=data.get(0).getIdLokasi()%>"></td>
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
