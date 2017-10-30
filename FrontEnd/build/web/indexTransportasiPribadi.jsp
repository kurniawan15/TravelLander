<%-- 
    Document   : indexTransportasiPribadi
    Created on : Oct 30, 2017, 3:01:18 PM
    Author     : Dewi Roaza
--%>

<%@page import="model.TransportasiPribadi"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="DAO.DAOTransportasiPribadi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Travellender</title>
    </head>
    <body>
        <h1>DAFTAR TRANSPORTASI PRIBADI</h1>
        <center>
        <a class="tambah" href="transportasi_pribadi?proses=input-moda-pribadi">Tambah</a>
    </center>
    <table style="margin:20px auto;" border="1">
              <tr>
                  <th>No</th>
                  <th>Kode Transportasi Pribadi</th>
                  <th>Kode Moda</th>
                  <th>Nama Transportasi Pribadi</th>
              </tr>
              <%
                  DAOTransportasiPribadi kt = new DAOTransportasiPribadi();
                  List<TransportasiPribadi> data = new ArrayList<TransportasiPribadi>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = kt.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              %>
               <tr>
                  <td><%=x + 1%></td>
                  <td><%=data.get(x).getKdTansportasiPribadi()%></td>
                  <td><%=data.get(x).getKdModa()%></td>
                  <td><%=data.get(x).getNamaTransportasiPribadi()%></td>
                  <td>
                      <a href="transportasi_pribadi?proses=edit-moda-pribadi&Kd_Transportasi_pribadi=<%=data.get(x).getKdTansportasiPribadi()%>">Edit</a>
                      <a href="transportasi_pribadi?proses=hapus-moda-pribadi&Kd_Transportasi_Pribadi=<%=data.get(x).getKdTansportasiPribadi()%>">Hapus</a>
                  </td>
              </tr>
              <% 
                    }
              %>
          </table>
    </body>
</html>
