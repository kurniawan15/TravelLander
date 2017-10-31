<%-- 
    Document   : edit_lokasi
    Created on : Oct 30, 2017, 6:14:44 PM
    Author     : Hari
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Lokasi"%>
<%@page import="DAO.DAOLokasi"%>
<%@page import="model.Provinsi"%>
<%@page import="DAO.DAOProvinsi"%>
<%@page import="model.Kota"%>
<%@page import="DAO.DAOKota"%>
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
    <div class="title">Edit Lokasi </div>  
        <div class="imput">
            <form action="../../lokasi?data=lokasi&proses=update-lokasi" method="post">
    <%
                String kd_lokasi = request.getParameter("kd_lokasi");
                DAOLokasi km = new DAOLokasi();
                km.setKdLokasi(kd_lokasi);
                List<Lokasi> data = new ArrayList<Lokasi>();
                data = km.cariID();
                        
             
                if (data.size() > 0) {

            %>
                Nama Lokasi
                <input type="text" placeholder="Masukan kode Lokasi" name="nama_lokasi" required  value="<%=data.get(0).getNamaLokasi()%>"></td>
                Alamat
                <input type="text" placeholder="Masukan Nama Lokasi" name="alamat" required value="<%=data.get(0).getAlamat()%>"></td>
              
                Kota
                <select class="pilih_kota" name="id_kota"">
                 <%
                     DAOKota dkot = new DAOKota();
                        List<Kota> kot = new ArrayList<Kota>();
                        kot = dkot.tampil();
                      for (Kota k : kot) {
                    %>
                <option value="<%=k.getIdKota()%>"><%=k.getNamaKota()%></option>
                <% 
                       }
                %>
                </select>
                
                <button type="submit" name="Update">Update Data</button>
                <td><input type="hidden" name="kd_lokasi" value="<%=data.get(0).getKdLokasi()%>"></td>
                 <%}%>
                
            </form>
                 <a href="Lokasi.jsp"><button >cencel</button></a>
                
        </div>
        </div>
</div>
</html>
