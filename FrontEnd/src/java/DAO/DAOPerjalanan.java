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
        String sql = "INSERT into perjalanan( id_perjalanan, Kd_Transportasi_Publik,Kd_Jarak, Kd_Transportasi_Pribadi, Waktu_tempuh) values ('" + idPerjalanan + "','" + kdTransportasiPublik + "','" + kdJarak + "',,'" + kdTransportasiPribadi + "',,'" + waktuTempuh + "')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE perjalanan SET Kd_Transportasi_Publik='"+kdTransportasiPublik+"',Kd_Jarak='"+kdJarak+"', Kd_Transportasi_Pribadi='"+kdTransportasiPribadi+"', Waktu_tempuh='"+waktuTempuh+"' WHERE id_perjalanan='"+idPerjalanan+"' ";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM kota WHERE id_perjalanan='"+idPerjalanan+"'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<Perjalanan> data = new ArrayList<Perjalanan>();
        ResultSet rs = null;

        try {
            String sql = "select * from perjalanan order by id_perjalanan asc";
            rs = db.ambilData(sql);
            System.out.print(sql);
            while (rs.next()) {
                Perjalanan um = new Perjalanan();
                um.setIdPerjalanan(rs.getString("id_perjalanan"));
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
            String sql = "SELECT * FROM perjalanan WHERE id_perjalanan='"+idPerjalanan+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Perjalanan m = new Perjalanan();
                m.setIdPerjalanan(rs.getString("id_perjalanan"));
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
            
            String idPerjalanan = "IDP0000";
            
            int cnt = 0;
            String sql = "SELECT MAX(id_perjalanan) FROM Perjalanan";   // mengambil maksimal id kota
            
            ResultSet resultSet = db.ambilData(sql);

            while (resultSet.next()) {                      // selama masih ada isinya diambil
                idPerjalanan = resultSet.getString(1);            // yang diambil 1=kd kota
            } 
            
            cnt = Integer.parseInt(idPerjalanan.substring(3));    // mengambil dari index ke 3 (mulai dri 0)
            cnt++;
            if(cnt >= 1000){
                idPerjalanan = "IDP" + String.valueOf(cnt);
            }
            else if(cnt < 1000 && cnt >= 100){
               idPerjalanan = "IDP" + "0" + String.valueOf(cnt);
            }
            else if(cnt < 100 && cnt >= 10){
               idPerjalanan = "IDP" + "00" + String.valueOf(cnt);
            }
            else{
               idPerjalanan = "IDP" + "000" + String.valueOf(cnt);
            }
            db.diskonek(resultSet);
            return idPerjalanan;
    }
}
