/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.KoneksiDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.TransportasiPublik;

/**
 *
 * @author Pega Kurniawan
 */
public class DAOTransportasiPublik extends TransportasiPublik{
    KoneksiDB db = null;
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
    public DAOTransportasiPublik (){
        db = new KoneksiDB ();
    }
    
    public void simpan(){
        String sql = "INSERT into transportasi_publik ( Kd_Transportasi_Publik, Kd_lokasi_keberangkatan, Kd_lokasi_kedatangan, Kd_Moda, Nama_Transportasi_Publik, Waktu_Berangkat, Waktu_Datang) values ('" + kdTransportasiPublik+ "','" + kdLokasiKeberangkatan+ "','" + kdLokasiKedatangan+ "','" + kdModa + "','" + namaTransportasiPublik + "','" + waktuBerangkat + "','" + waktuDatang + "')";
        db.simpanData(sql);
    }
    
    public void update(){
        String sql="UPDATE transportasi_publik SET Kd_lokasi_keberangkatan='"+kdLokasiKeberangkatan+"', Kd_lokasi_kedatangan='"+kdLokasiKedatangan+"', Kd_Moda='"+kdModa+"', Nama_Transportasi_Publik='"+namaTransportasiPublik+"', Waktu_Berangkat='"+waktuBerangkat+"', Waktu_Datang='"+waktuDatang+"' WHERE Kd_Lokasi_Keberangkatan= '" + kdTransportasiPublik+ "'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    
    public void hapus(){
        String sql="DELETE FROM transportasi_publik WHERE Kd_Transportasi_Publik= '" + kdTransportasiPublik+ "'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<TransportasiPublik> data = new ArrayList<TransportasiPublik>();
        ResultSet rs = null;

        try {
            String sql = "select * from transportasi_publik ";
            rs = db.ambilData(sql);
            System.out.println(sql);
            while (rs.next()) {
                TransportasiPublik tp = new TransportasiPublik();
                tp.setKdTransportasiPublik(rs.getString("Kd_Transportasi_Publik"));
                tp.setKdLokasiKeberangkatan(rs.getString("Kd_lokasi_keberangkatan"));
                tp.setKdLokasiKedatangan(rs.getString("Kd_lokasi_kedatangan"));
                tp.setKdModa(rs.getString("Kd_Moda"));
                tp.setNamaTransportasiPublik(rs.getString("Nama_Transportasi_Publik"));
                if(rs.getString("Waktu_Berangkat").equals("0000-00-00 00:00:00")){
                    tp.setWaktuBerangkat(format.parse("1970-01-01 01:00:00"));
                }
                else{
                    tp.setWaktuBerangkat(new Date (rs.getTimestamp("Waktu_Berangkat").getTime()));
                }
                if(rs.getString("Waktu_Datang").equals("0000-00-00 00:00:00")){
                    tp.setWaktuBerangkat(format.parse("1970-01-01 01:00:00"));
                }
                else{
                    tp.setWaktuBerangkat(new Date (rs.getTimestamp("Waktu_Datang").getTime()));
                }
                data.add(tp);
                }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
            ex.printStackTrace();
        }
        return data;
    }
    
        public List cariID() {
        List<TransportasiPublik> data = new ArrayList<TransportasiPublik>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM transportasi_publik WHERE Kd_Transportasi_Publik= '" + kdTransportasiPublik+ "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                TransportasiPublik tp = new TransportasiPublik();
                tp.setKdTransportasiPublik(rs.getString("Kd_Transportasi_Publik"));
                tp.setKdLokasiKeberangkatan(rs.getString("Kd_lokasi_keberangkatan"));
                tp.setKdLokasiKedatangan(rs.getString("Kd_lokasi_kedatangan"));
                tp.setKdModa(rs.getString("Kd_Moda"));
                tp.setNamaTransportasiPublik(rs.getString("Nama_Transportasi_Publik"));
                tp.setWaktuBerangkat(rs.getDate("Waktu_Berangkat"));
                tp.setWaktuDatang(rs.getDate("Waktu_Datang"));
                data.add(tp);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
            ex.printStackTrace();
        }
        return data;
    }
    public String getNewId() throws SQLException{
            
            String kdTansportasiPublik = "TU00";
            
            int cnt = 0;
            String sql = "SELECT MAX(Kd_Transportasi_Publik) FROM transportasi_publik";   // mengambil maksimal ddari kd_moda
            
            ResultSet resultSet = db.ambilData(sql);

            while (resultSet.next()) {                      // selama masih ada isinya diambil
                kdTansportasiPublik = resultSet.getString(1);            // yang diambil 1=kd kota
            } 
            
            cnt = Integer.parseInt(kdTansportasiPublik.substring(3));    // mengambil dari index ke 3 (mulai dri 0)
            cnt++;
            if(cnt >= 10){
                kdTansportasiPublik = "TU" + String.valueOf(cnt);
            }
            else{
               kdTansportasiPublik = "TU" + "0" + String.valueOf(cnt);
            }
            db.diskonek(resultSet);
            return kdTansportasiPublik;
    }
}
