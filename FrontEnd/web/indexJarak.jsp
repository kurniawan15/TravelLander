<%-- 
    Document   : indexJarak
    Created on : Oct 30, 2017, 6:35:09 PM
    Author     : Dewi Roaza
--%>

<%@page import="model.Jarak"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="DAO.DAOJarak"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Travellender</title>
    </head>
    <body>
    <center><h1>DAFTAR JARAK</h1></center>
    <center>
        <a class="tambah" href="jarak?proses=input-jarak">Tambah</a>
    </center>
        <table style="margin:20px auto;" border="1">
              <tr>
                  <th>No</th>
                  <th>Kode Jarak</th>
                  <th>Kode Lokasi Awal</th>
                  <th>Kode Lokasi Akhir</th>
                  <th>Jarak</th>
              </tr>
              <%
                  DAOJarak km = new DAOJarak();
                  List<Jarak> data = new ArrayList<Jarak>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = km.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              %>
               <tr>
                  <td><%=x + 1%></td>
                  <td><%=data.get(x).getKdJarak()%></td>
                  <td><%=data.get(x).getKdLokasiAwal()%></td>
                  <td><%=data.get(x).getKdLokasiAkhir()%></td>
                  <td><%=data.get(x).getJarak()%></td>
                  <td>
                      <a href="jarak?proses=edit-jarak&Kd_Jarak=<%=data.get(x).getKdJarak()%>">Edit</a>
                      <a href="jarak?proses=hapus-jarak&Kd_Jarak=<%=data.get(x).getKdJarak()%>">Hapus</a>
                  </td>
              </tr>
              <% 
                    }
              %>
          </table>
    </body>
</html>
