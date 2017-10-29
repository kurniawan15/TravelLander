<%-- 
    Document   : edit_event
    Created on : Oct 29, 2017, 8:31:38 PM
    Author     : Lenovo
--%>

<%@page import="model.Event"%>
<%@page import="DAO.DAOEvent"%>
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
        <center><h1>Edit Event </h1></center>
        <form action="addEvent?data=event&proses=update-event" method="post">
            <table style="margin:20px auto;">
            <%
                String idEvent = request.getParameter("id_event");
                DAOEvent ev = new DAOEvent();
                ev.setIdEvent(idEvent);
                List<Event> data = new ArrayList<Event>();
                data = ev.cariID(); 
                if (data.size() > 0) {

            %>
		<tr>
                    <td>Nama</td>
                    <td><input type="text" name="nama_lokasi" value="<%=data.get(0).getNameEvent()%>"></td>
		</tr>
		<tr>
                    <td>ID Perjalanan</td>
                    <td><input type="text" name="alamat" value="<%=data.get(0).getIdPerjalanan()%>"></td>
                    <td><input type="hidden" name="id_event" value="<%=data.get(0).getIdEvent()%>"></td>
		</tr>
                <tr>
                    <td>Waktu mulai/td>
                    <td><input type="text" name="waktu_mulai" value="<%=data.get(0).getStartTime()%>"></td>
		</tr>
		<tr>
                    <td>Waktu selesai/td>
                    <td><input type="text" name="waktu_selesai" value="<%=data.get(0).getEndTime()%>"></td>
		</tr>
                <tr>
                    <td>Keterangan/td>
                    <td><input type="text" name="keterangan" value="<%=data.get(0).getKeterangan()%>"></td>
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

