<%-- 
    Document   : indexPerjalanan
    Created on : Oct 30, 2017, 10:04:11 PM
    Author     : Dewi Roaza
--%>

<%@page import="model.Perjalanan"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="DAO.DAOPerjalanan"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Travellender</title>
    </head>
    <body>
    <center><h1>DAFTAR Perjalanan</h1></center>
     <center>
        <a class="tambah" href="perjalanan?proses=input-perjalanan">Tambah</a>
    </center>
        <table style="margin:20px auto;" border="1">
              <tr>
                  <th>No</th>
                  <th>Id Perjalanan</th>
                  <th>Kode Transportasi Publik</th>
                  <th>Kode Jarak</th>
                  <th>Kode Transportasi Pribadi</th>
                  <th>Waktu Tempuh</th>
              </tr>
              <%
                  DAOPerjalanan km = new DAOPerjalanan();
                  List<Perjalanan> data = new ArrayList<Perjalanan>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = km.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              %>
               <tr>
                  <td><%=x + 1%></td>
                  <td><%=data.get(x).getIdPerjalanan()%></td>
                  <td><%=data.get(x).getKdTransportasiPublik()%></td>
                  <td><%=data.get(x).getKdJarak()%></td>
                  <td><%=data.get(x).getKdTransportasiPribadi()%></td>
                  <td><%=data.get(x).getWaktuTempuh()%></td>
                  
                  <td>
                      <a href="perjalanan?proses=edit-perjalanan&Kd_Perjalanan=<%=data.get(x).getIdPerjalanan()%>">Edit</a>
                      <a href="perjalanan?proses=hapus-perjalanan&Kd_Perjalanan=<%=data.get(x).getIdPerjalanan()%>">Hapus</a>
                  </td>
              </tr>
              <% 
                    }
              %>
          </table>
    </body>
</html>
