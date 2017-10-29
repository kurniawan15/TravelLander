<%@page import="model.Lokasi"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Database.KoneksiDB"%>
<%@page import="DAO.DAOLokasi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Travellender</title>
    </head>
    <body>
    <center><h1>DAFTAR LOKASI</h1></center>
    <center>
        <a class="tambah" href="location?proses=input-lokasi">Tambah</a>
    </center>
        <table style="margin:20px auto;" border="1">
              <tr>
                  <th>No</th>
                  <th>Kode Kota</th>
                  <th>Nama</th>
                  <th>Alamat</th>
                  <th>Kota</th>
                  <th>provinsi</th>
                  <th>Action</th>
              </tr>
              <%
                  DAOLokasi km = new DAOLokasi();
                  List<Lokasi> data = new ArrayList<Lokasi>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = km.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              %>
               <tr>
                  <td><%=x + 1%></td>
                  <td><%=data.get(x).getKdLokasi()%></td>
                  <td><%=data.get(x).getNamaLokasi()%></td>
                  <td><%=data.get(x).getAlamat()%></td>
                  <td><%=data.get(x).getId_kota()%></td>
                  <td><%=data.get(x).getId_provinsi()%></td>
                  <td>
                      <a href="location?proses=edit-lokasi&kd_lokasi=<%=data.get(x).getKdLokasi()%>">Edit</a>
                      <a href="location?proses=hapus-lokasi&kd_lokasi=<%=data.get(x).getKdLokasi()%>">Hapus</a>
                  </td>
              </tr>
              <% 
                    }
              %>
          </table>
              
</body>
</html>