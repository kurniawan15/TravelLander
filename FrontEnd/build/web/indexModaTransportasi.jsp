<%-- 
    Document   : indexModaTransportasi
    Created on : Oct 30, 2017, 10:03:54 AM
    Author     : Dewi Roaza
--%>

<%@page import="model.ModaTransportasi"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="DAO.DAOModaTransportasi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Travellender</title>
    </head>
    <body>
        <h1>DAFTAR MODA TRANSPORTASI</h1>
    <center>
        <a class="tambah" href="moda_transportasi?proses=input-moda">Tambah</a>
    </center>
    <table style="margin:20px auto;" border="1">
              <tr>
                  <th>No</th>
                  <th>Kode Moda</th>
                  <th>Tipe Moda</th>
              </tr>
              <%
                  DAOModaTransportasi kt = new DAOModaTransportasi();
                  List<ModaTransportasi> data = new ArrayList<ModaTransportasi>();
                  //String ket = request.getParameter("ket");
                  //if (ket == null) {
                      data = kt.tampil();
                  //} 
                  for (int x = 0; x < data.size(); x++) {
              %>
               <tr>
                  <td><%=x + 1%></td>
                  <td><%=data.get(x).getKdModa()%></td>
                  <td><%=data.get(x).getTipeModa()%></td>
                  <td>
                      <a href="moda_transportasi?proses=edit-moda&Kd_Moda=<%=data.get(x).getKdModa()%>">Edit</a>
                      <a href="moda_transportasi?proses=hapus-moda&Kd_Moda=<%=data.get(x).getKdModa()%>">Hapus</a>
                  </td>
              </tr>
              <% 
                    }
              %>
          </table>
    </body>
</html>
