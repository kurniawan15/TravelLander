

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Lokasi"%>
<%@page import="DAO.DAOLokasi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <center><h1>Edit User </h1></center>
        <form action="location?data=lokasi&proses=update-lokasi" method="post">
            <table style="margin:20px auto;">
            <%
                String idLokasi = request.getParameter("idLokasi");
                DAOLokasi km = new DAOLokasi();
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
