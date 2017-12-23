<%-- 
    Document   : tambah-kota
    Created on : Oct 30, 2017, 12:58:51 AM
    Author     : Hari
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Provinsi"%>
<%@page import="DAO.DAOProvinsi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Super Admin</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<div class="widget">
    <div class="title">Tambah Provinsi </div>  
        <div class="imput">
            <form action="../../provinsi?data=provinsi&proses=update-provinsi" method="post">
                <%
                String id_provinsi = request.getParameter("id_provinsi");
                DAOProvinsi kt = new DAOProvinsi();
                kt.setIdProvinsi(id_provinsi);
                List<Provinsi> data = new ArrayList<Provinsi>();
                data = kt.cariID(); 
                if (data.size() > 0) {
                %>
                Id Provinsi
                <input type="text" placeholder="<%=data.get(0).getIdProvinsi()%>" name="id_provinsi" required>
                Nama Provinsi
                <input type="text" placeholder="<%=data.get(0).getNamaProvinsi()%>" name="nama_provinsi" required>
                Ibukota
                <input type="text" placeholder="<%=data.get(0).getIbuKota()%>" name="ibu_kota" required>
               
                <button type="submit" name="Tambah">Update Data</button>
                <%}%>
            </form>
        </div>
</div>
</html>
