<%-- 
    Document   : indexTraveller
    Created on : Oct 29, 2017, 9:43:42 PM
    Author     : Fadhil-PC
--%>

<%@page import="model.Traveller"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Database.KoneksiDB"%>
<%@page import="DAO.DAOTraveller"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Travellender</title>
    </head>
    <body>
        <center><h1>DAFTAR TRAVELLER</h1></center>
    <center>
        <a class="tambah" href="traveller?proses=input-traveller">Tambah</a>
    </center>
        <table style="margin:20px auto;" border="1">
              <tr>
                  <th>No</th>
                  <th>Kode Traveller</th>
                  <th>Nama</th>
                  <th>Username</th>
                  <th>Password</th>
                  <th>Email</th>
              </tr>
              <%
                  DAOTraveller tr = new DAOTraveller();
                  List<Traveller> data = new ArrayList<Traveller>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = tr.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              %>
               <tr>
                  <td><%=x + 1%></td>
                  <td><%=data.get(x).getKd_Traveller()%></td>
                  <td><%=data.get(x).getNama_Traveller()%></td>
                  <td><%=data.get(x).getUsername()%></td>
                  <td><%=data.get(x).getPassword()%></td>
                  <td><%=data.get(x).getEmail()%></td>
                  <td>
                      <a href="traveller?proses=edit-traveller&Kd_Traveller=<%=data.get(x).getKd_Traveller()%>">Edit</a>
                      <a href="traveller?proses=hapus-traveller&Kd_Traveller=<%=data.get(x).getKd_Traveller()%>">Hapus</a>
                  </td>
              </tr>
              <% 
                    }
              %>
          </table>
    </body>
</html>
