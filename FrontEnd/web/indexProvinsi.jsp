<%@page import="DAO.DAOProvinsi"%>
<%@page import="model.Provinsi"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Database.KoneksiDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>provinsi</title>
    </head>
    <body>
    <center><h1>DAFTAR LOKASI</h1></center>
    <center>
        <a class="tambah" href="provinsi?proses=input-provinsi">Tambah</a>
    </center>
        <table style="margin:20px auto;" border="1">
              <tr>
                  <th>No</th>
                  <th>Id Provinsi</th>
                  <th>Nama Provinsi</th>
                  <th>Ibu kota</th>
 
              </tr>
              <%
                  DAOProvinsi dp = new DAOProvinsi();
                  List<Provinsi> data = new ArrayList<Provinsi>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = dp.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              %>
               <tr>
                  <td><%=x + 1%></td>
                  <td><%=data.get(x).getIdProvinsi()%></td>
                  <td><%=data.get(x).getNamaProvinsi()%></td>
                  <td><%=data.get(x).getIbuKota()%></td>
 
                  <td>
                      <a href="provinsi?proses=edit-provinsi&id_provinsi=<%=data.get(x).getIdProvinsi()%>">Edit</a>
                      <a href="provinsi?proses=hapus-provinsi&id_provinsi=<%=data.get(x).getIdProvinsi()%>">Hapus</a>
                  </td>
              </tr>
              <% 
                    }
              %>
          </table>
              
</body>
</html>