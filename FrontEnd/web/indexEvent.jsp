<%@page import="model.Event"%>
<%@page import="DAO.DAOEvent"%>
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
        <a class="tambah" href="addEvent?proses=input-event">Tambah</a>
    </center>
    
    <input type=hidden id=blah1 value=true name=blah1 />
        <table style="margin:20px auto;" border="1">
              <tr>
                  <th>No</th>
                  <th>Kode Event</th>
                  <th>Nama Event</th>
                  <th>Waktu Mulai</th>
                  <th>Waktu Selesai</th>
                  <th>Keterangan</th>
                  <th>Action</th>
                  
              </tr>
              <%
                  DAOEvent ev = new DAOEvent();
                  List<Event> data = new ArrayList<Event>();
                  String ket = request.getParameter("ket");
//                  if (ket == null) {
                      data = ev.tampil();
//                  } 
                  for (int x = 0; x < data.size(); x++) {
              %>
               <tr>
                  <td><%=x + 1%></td>
                  <td><%=data.get(x).getKdEvent()%></td>
                  <td><%=data.get(x).getNameEvent()%></td>
                  <td><%=data.get(x).getStartTime()%></td>
                  <td><%=data.get(x).getEndTime()%></td>
                  <td><%=data.get(x).getKeterangan()%></td>
                  <td>
                      <a href="addEvent?proses=edit-event&kd_event=<%=data.get(x).getKdEvent()%>">Edit</a>
                      <a href="addEvent?proses=hapus-event&kd_event=<%=data.get(x).getKdEvent()%>">Hapus</a>
                  </td>               
              </tr>
              <% 
                    }
              %>
          </table>
              
</body>
</html>