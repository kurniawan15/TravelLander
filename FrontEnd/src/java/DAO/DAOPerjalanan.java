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
import model.Kota;
import model.Perjalanan;

/**
 *
 * @author Dewi Roaza
 */
public class DAOPerjalanan extends Perjalanan{
    KoneksiDB db = null;


    public DAOPerjalanan(){

        db = new KoneksiDB();
    }

    public void simpan(){
        String sql = "INSERT into perjalanan( Kd_Perjalanan, Kd_Transportasi_Publik,Kd_Jarak, Kd_Transportasi_Pribadi, Waktu_tempuh) values ('" + kdPerjalanan + "','" + kdTransportasiPublik + "','" + kdJarak + "',,'" + kdTransportasiPribadi + "',,'" + waktuTempuh + "')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE perjalanan SET Kd_Transportasi_Publik='"+kdTransportasiPublik+"',Kd_Jarak='"+kdJarak+"', Kd_Transportasi_Pribadi='"+kdTransportasiPribadi+"', Waktu_tempuh='"+waktuTempuh+"' WHERE Kd_Perjalanan='"+kdPerjalanan+"' ";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM kota WHERE Kd_Perjalanan='"+kdPerjalanan+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public List tampil() {
        List<Perjalanan> data = new ArrayList<Perjalanan>();
        ResultSet rs = null;

        try {
            String sql = "select * from perjalanan order by Kd_Perjalanan asc";
            rs = db.ambilData(sql);
            System.out.print(sql);
            while (rs.next()) {
                Perjalanan um = new Perjalanan();
                um.setKdPerjalanan(rs.getString("Kd_Perjalanan"));
                um.setKdTransportasiPublik(rs.getString("Kd_Transportasi_Publik"));
                um.setKdJarak(rs.getString("Kd_Jarak"));
                um.setKdTransportasiPribadi(rs.getString("Kd_Transportasi_Pribadi"));
                um.setWaktuTempuh(rs.getInt("Waktu_tempuh"));
                data.add(um);
   }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
        public List cariID() {
        List<Perjalanan> data = new ArrayList<Perjalanan>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM perjalanan WHERE Kd_Perjalanan='"+kdPerjalanan+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Perjalanan m = new Perjalanan();
                m.setKdPerjalanan(rs.getString("Kd_Perjalanan"));
                m.setKdTransportasiPublik(rs.getString("Kd_Transportasi_Publik"));
                m.setKdJarak(rs.getString("Kd_Jarak"));
                m.setKdTransportasiPribadi(rs.getString("Kd_Transportasi_Pribadi"));
                m.setWaktuTempuh(rs.getInt("Waktu_tempuh"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;

    }
    public String getNewId() throws SQLException{
            
            String kdPerjalanan = "IDP0000";
            
            int cnt = 0;
            String sql = "SELECT MAX(Kd_Perjalanan) FROM Perjalanan";   // mengambil maksimal id kota
            
            ResultSet resultSet = db.ambilData(sql);

            while (resultSet.next()) {                      // selama masih ada isinya diambil
                kdPerjalanan = resultSet.getString(1);            // yang diambil 1=kd kota
            } 
            
            cnt = Integer.parseInt(kdPerjalanan.substring(3));    // mengambil dari index ke 3 (mulai dri 0)
            cnt++;
            if(cnt >= 1000){
                kdPerjalanan = "IDP" + String.valueOf(cnt);
            }
            else if(cnt < 1000 && cnt >= 100){
               kdPerjalanan = "IDP" + "0" + String.valueOf(cnt);
            }
            else if(cnt < 100 && cnt >= 10){
               kdPerjalanan = "IDP" + "00" + String.valueOf(cnt);
            }
            else{
               kdPerjalanan = "IDP" + "000" + String.valueOf(cnt);
            }
            db.diskonek(resultSet);
            return kdPerjalanan;
    }
    
    public String getKdPerjalanan(String kdLokasiAwal,String kdLokasiAkhir,String kdTransportasiPublik,String kdTransportasiPribadi){
       String kdPerjalanan = "KDP0000";
       ResultSet rs;
       try {
           String sql;
           if(kdTransportasiPublik != null){
               sql = "SELECT Kd_Perjalanan FROM perjalanan WHERE Kd_Jarak = (Select Kd_Jarak from jarak where kd_lokasi_awal = '"+kdLokasiAwal+"' and kd_lokasi_akhir = '"+kdLokasiAkhir+"' and kd_transportasi_publik = '"+kdTransportasiPublik+"' and kd_transportasi_pribadi IS NULL)";
           }
           else{
               sql = "SELECT Kd_Perjalanan FROM perjalanan WHERE Kd_Jarak = (Select Kd_jarak from jarak where kd_lokasi_awal = '"+kdLokasiAwal+"' and kd_lokasi_akhir = '"+kdLokasiAkhir+"' and kd_transportasi_publik IS NULL and kd_transportasi_pribadi = '"+kdTransportasiPribadi+"')";
           }
            
            rs = db.ambilData(sql);
            System.out.println(sql);
            while (rs.next()) {
                kdPerjalanan = rs.getString(1);
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
       
        return kdPerjalanan;
    }
}
