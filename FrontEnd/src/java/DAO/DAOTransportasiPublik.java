/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.KoneksiDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.TransportasiPublik;

/**
 *
 * @author Dewi Roaza
 */
public class DAOTransportasiPublik extends TransportasiPublik{
    KoneksiDB db = null;
    
    public DAOTransportasiPublik (){
        db = new KoneksiDB ();
    }
    
    public void simpan(){
        String sql = "INSERT into transportasi_publik ( Kd_Transportasi_Publik, Kd_Moda, Nama_Transportasi_Publik, Waktu_Berangkat, Waktu_Datang) values ('" + kdTansportasiPublik+ "','" + kdModa + "','" + namaTransportasiPublik + "','" + waktuBerangkat + "','" + waktuDatang + "')";
        db.simpanData(sql);
    }
    
    public void update(){
        String sql="UPDATE transportasi_publik SET Kd_Moda='"+kdModa+"', Nama_Transportasi_publik='"+namaTransportasiPublik+"',Waktu_Berangkat='"+waktuBerangkat+"',Waktu_Datang='"+waktuDatang+"' WHERE Kd_Transportasi_Publik= '" + kdTansportasiPublik+ "'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    
    public void hapus(){
        String sql="DELETE FROM transportasi_publik WHERE Kd_Transportasi_Publik= '" + kdTansportasiPublik+ "'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<TransportasiPublik> data = new ArrayList<TransportasiPublik>();
        ResultSet rs = null;

        try {
            String sql = "select * from transportasi_publik order by Kd_Transportasi_Publik asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                TransportasiPublik um = new TransportasiPublik();
                um.setkdTansportasiPublik(rs.getString("Kd_Transportasi_Publik"));
                um.setkdModa(rs.getString("Kd_Moda"));
                um.setnamaTransportasiPublik(rs.getString("Nama_Transportasi_Publik"));
                um.setwaktuBerangkat(rs.getString("Waktu_Berangkat"));
                um.setwaktuDatang(rs.getString("Waktu_Datang"));
                data.add(um);
   }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
        public List cariID() {
        List<TransportasiPublik> data = new ArrayList<TransportasiPublik>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM transportasi_publik WHERE Kd_Transportasi_Publik= '" + kdTansportasiPublik+ "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                TransportasiPublik m = new TransportasiPublik();
                m.setkdTansportasiPublik(rs.getString("Kd_Transportasi_Publik"));
                m.setkdModa(rs.getString("Kd_Moda"));
                m.setnamaTransportasiPublik(rs.getString("Nama_Transportasi_Publik"));
                m.setwaktuBerangkat(rs.getString("Waktu_Berangkat"));
                m.setwaktuDatang(rs.getString("Waktu_Datang"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;
    }
    public String getNewId() throws SQLException{
            
            String kdTansportasiPublik = "KMU00";
            
            int cnt = 0;
            String sql = "SELECT MAX(Kd_Transportasi_Publik) FROM transportasi_publik";   // mengambil maksimal ddari kd_moda
            
            ResultSet resultSet = db.ambilData(sql);

            while (resultSet.next()) {                      // selama masih ada isinya diambil
                kdTansportasiPublik = resultSet.getString(1);            // yang diambil 1=kd kota
            } 
            
            cnt = Integer.parseInt(kdTansportasiPublik.substring(3));    // mengambil dari index ke 3 (mulai dri 0)
            cnt++;
            if(cnt >= 10){
                kdTansportasiPublik = "KMU" + String.valueOf(cnt);
            }
            else{
               kdTansportasiPublik = "KMU" + "0" + String.valueOf(cnt);
            }
            db.diskonek(resultSet);
            return kdTansportasiPublik;
    }
}
