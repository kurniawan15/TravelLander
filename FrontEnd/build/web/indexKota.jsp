<%-- 
    Document   : indexKota
    Created on : Oct 29, 2017, 9:07:45 PM
    Author     : Fadhil-PC
--%>

<%@page import="model.Kota"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Database.KoneksiDB"%>
<%@page import="DAO.DAOKota"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Travellender</title>
    </head>
    <body>
        <center><h1>DAFTAR KOTA</h1></center>
    <center>
        <a class="tambah" href="kota?proses=input-kota">Tambah</a>
    </center>
        <table style="margin:20px auto;" border="1">
              <tr>
                  <th>No</th>
                  <th>Kode Kota</th>
                  <th>Nama</th>
                  <th>IdProvinsi</th>
              </tr>
              <%
                  DAOKota kt = new DAOKota();
                  List<Kota> data = new ArrayList<Kota>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = kt.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              %>
               <tr>
                  <td><%=x + 1%></td>
                  <td><%=data.get(x).getIdKota()%></td>
                  <td><%=data.get(x).getNamaKota()%></td>
                  <td><%=data.get(x).getIdProvinsi()%></td>
                  <td>
                      <a href="kota?proses=edit-kota&id_kota=<%=data.get(x).getIdKota()%>">Edit</a>
                      <a href="kota?proses=hapus-kota&id_kota=<%=data.get(x).getIdKota()%>">Hapus</a>
                  </td>
              </tr>
              <% 
                    }
              %>
          </table>
    </body>
</html>
