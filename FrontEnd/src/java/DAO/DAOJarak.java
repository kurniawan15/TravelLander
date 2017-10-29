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
import model.Jarak;
import model.Lokasi;

/**
 *
 * @author Dewi Roaza
 */
public class DAOJarak extends Jarak{
    
    KoneksiDB db = null;


    public DAOJarak(){

        db = new KoneksiDB();
    }

    public void simpan(){
        String sql = "INSERT into jarak( Kd_jarak, Kd_Lokasi_Awal, Kd_Lokasi_Akhir, Jarak) values ('" + kdJarak + "','" + kdLokasiAwal + "','" + kdLokasiAkhir + "','" + jarak + "')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE lokasi SET Kd_jarak='"+kdJarak+"',Kd_Lokasi_Awal='"+kdLokasiAwal+"', Kd_Lokasi_Akhir='"+kdLokasiAkhir+"', Jarak ='"+jarak+"' WHERE kdJarak ='"+kdJarak+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM jarak WHERE Kd_jarak='"+kdJarak+"'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<Jarak> data = new ArrayList<Jarak>();
        ResultSet rs = null;

        try {
            String sql = "select * from jarak order by kdJarak asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Jarak um = new Jarak();
                um.setkdJarak(rs.getString("Kd_jarak"));
                um.setkdLokasiAwal(rs.getString("Kd_Lokasi_Awal"));
                um.setkdLokasiAkhir(rs.getString("Kd_Lokasi_Akhir"));
                um.setjarak(rs.getString("Jarak"));
                data.add(um);
   }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
        public List cariID() {
        List<Jarak> data = new ArrayList<Jarak>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM jarak WHERE Kd_jarak='"+kdJarak+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Jarak m = new Jarak();
                m.setkdJarak(rs.getString("Kd_jarak"));
                m.setkdLokasiAwal(rs.getString("Kd_Lokasi_Awal"));
                m.setkdLokasiAkhir(rs.getString("Kd_Lokasi_Akhir"));
                m.setjarak(rs.getString("Jarak"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;
    }
        
        public List cariID(String kdJarak) {
        List<Jarak> data = new ArrayList<Jarak>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM jarak WHERE Kd_jarak='"+kdJarak+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Jarak m = new Jarak();
                m.setkdJarak(rs.getString("Kd_jarak"));
                m.setkdLokasiAwal(rs.getString("Kd_Lokasi_Awal"));
                m.setkdLokasiAkhir(rs.getString("Kd_Lokasi_Akhir"));
                m.setjarak(rs.getString("Jarak"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;
    }
    public String getNewId() throws SQLException{
            
            String kdJarak = "JPL0000";
            
            int cnt = 0;
            String sql = "SELECT MAX(Kd_jarak) FROM jarak";   // mengambil maksimal id kota
            
            ResultSet resultSet = db.ambilData(sql);

            while (resultSet.next()) {                      // selama masih ada isinya diambil
                kdJarak = resultSet.getString(1);            // yang diambil 1=kd kota
            } 
            
            cnt = Integer.parseInt(kdJarak.substring(3));    // mengambil dari index ke 3 (mulai dri 0)
            cnt++;
            if(cnt >= 1000){
                kdJarak = "JPL" + String.valueOf(cnt);
            }
            else if(cnt < 1000 && cnt >= 100){
               kdJarak = "JPL" + "0" + String.valueOf(cnt);
            }
            else if(cnt < 100 && cnt >= 10){
               kdJarak = "JPL" + "00" + String.valueOf(cnt);
            }
            else{
               kdJarak = "JPL" + "000" + String.valueOf(cnt);
            }
            db.diskonek(resultSet);
            return kdJarak;
    }
}
