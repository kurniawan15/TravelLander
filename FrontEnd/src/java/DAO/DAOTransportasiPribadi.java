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
import model.TransportasiPribadi;

/**
 *
 * @author Dewi Roaza
 */
public class DAOTransportasiPribadi extends TransportasiPribadi{ 
    
    KoneksiDB db = null;
    
    public DAOTransportasiPribadi (){
        db = new KoneksiDB ();
    }
    
    public void simpan(){
        String sql = "INSERT into transportasi_pribadi ( Kd_Transportasi_Pribadi, Kd_Moda, Nama_Transportasi_Pribadi) values ('" + kdTansportasiPribadi+ "','" + kdModa + "','" + namaTransportasiPribadi + "')";
        db.simpanData(sql);
    }
    
    public void update(){
        String sql="UPDATE transportasi_pribadi SET Kd_Moda='"+kdModa+"', Nama_Transportasi_Pribadi='"+namaTransportasiPribadi+"' WHERE Kd_Transportasi_Pribadi= '" + kdTansportasiPribadi+ "'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    
    public void hapus(){
        String sql="DELETE FROM transportasi_pribadi WHERE Kd_Transportasi_Pribadi= '" + kdTansportasiPribadi+ "'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<TransportasiPribadi> data = new ArrayList<TransportasiPribadi>();
        ResultSet rs = null;

        try {
            String sql = "select * from transportasi_pribadi order by Kd_Transportasi_Pribadi asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                TransportasiPribadi um = new TransportasiPribadi();
                um.setkdTansportasiPribadi(rs.getString("Kd_Transportasi_Pribadi"));
                um.setkdModa(rs.getString("Kd_Moda"));
                um.setnamaTransportasiPribadi(rs.getString("Nama_Transportasi_Pribadi"));
                data.add(um);
   }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
        public List cariID() {
        List<TransportasiPribadi> data = new ArrayList<TransportasiPribadi>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM transportasi_pribadi WHERE Kd_Transportasi_Pribadi= '" + kdTansportasiPribadi+ "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                TransportasiPribadi m = new TransportasiPribadi();
                m.setkdTansportasiPribadi(rs.getString("Kd_Transportasi_Pribadi"));
                m.setkdModa(rs.getString("Kd_Moda"));
                m.setnamaTransportasiPribadi(rs.getString("Nama_Transportasi_Pribadi"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;

    }
        
    public String getNewId() throws SQLException{
            
            String kdTansportasiPribadi = "KMP00";
            
            int cnt = 0;
            String sql = "SELECT MAX(Kd_Transportasi_Pribadi) FROM transportasi_pribadi";   // mengambil maksimal ddari kd_moda
            
            ResultSet resultSet = db.ambilData(sql);

            while (resultSet.next()) {                      // selama masih ada isinya diambil
                kdTansportasiPribadi = resultSet.getString(1);            // yang diambil 1=kd kota
            } 
            
            cnt = Integer.parseInt(kdTansportasiPribadi.substring(3));    // mengambil dari index ke 3 (mulai dri 0)
            cnt++;
            if(cnt >= 10){
                kdTansportasiPribadi = "KMP" + String.valueOf(cnt);
            }
            else{
               kdTansportasiPribadi = "KMP" + "0" + String.valueOf(cnt);
            }
            db.diskonek(resultSet);
            return kdTansportasiPribadi;
    }
}
