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
import model.NewModaPerjalanan;

/**
 *
 * @author Dewi Roaza
 */
public class DAOModaPerjalanan extends NewModaPerjalanan implements DAO{
    
    KoneksiDB db = null;

    public DAOModaPerjalanan(){
        db = new KoneksiDB();
    }

    public void simpan(){
        String sql = "INSERT into moda_perjalanan( Travel_mode, Avoidtolls) values ('" + travelMode + "','" + avoidtolls + "')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE moda_perjalanan SET Avoidtolls='"+avoidtolls+"' WHERE Travel_mode='"+travelMode+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM moda_perjalanan WHERE Travel_mode='"+travelMode+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public List tampil() {
        List<NewModaPerjalanan> data = new ArrayList<NewModaPerjalanan>();
        ResultSet rs = null;

        try {
            String sql = "select * from moda_perjalanan order by Travel_mode asc";
            rs = db.ambilData(sql);
            System.out.print(sql);
            while (rs.next()) {
                NewModaPerjalanan um = new NewModaPerjalanan();
                um.setTravelMode(rs.getString("Travel_mode"));
                um.setAvoidtolls(rs.getInt("Avoidtolls"));
                data.add(um);
   }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
            ex.printStackTrace();
        }
        return data;
    }
        public List cariID() {
        List<NewModaPerjalanan> data = new ArrayList<NewModaPerjalanan>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM moda_perjalanan WHERE Kd_Moda='"+travelMode+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                NewModaPerjalanan m = new NewModaPerjalanan();
                m.setTravelMode(rs.getString("Travel_mode"));
                m.setAvoidtolls(rs.getInt("Avoidtolls"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;

    }
        
    public String getNewId() throws SQLException{
            
            String kdModa = "KMT00";
            
            int cnt = 0;
            String sql = "SELECT MAX(Travel_mode) FROM moda_perjalanan";   // mengambil maksimal ddari kd_moda
            
            ResultSet resultSet = db.ambilData(sql);

            while (resultSet.next()) {                      // selama masih ada isinya diambil
                kdModa = resultSet.getString(1);            // yang diambil 1=kd kota
            } 
            
            cnt = Integer.parseInt(kdModa.substring(3));    // mengambil dari index ke 3 (mulai dri 0)
            cnt++;
            if(cnt >= 10){
                kdModa = "KMT" + String.valueOf(cnt);
            }
            else{
               kdModa = "KMT" + "0" + String.valueOf(cnt);
            }
            db.diskonek(resultSet);
            return kdModa;
         }

}


