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
import model.ModaTransportasi;

/**
 *
 * @author Dewi Roaza
 */
public class DAOModaTransportasi extends ModaTransportasi implements DAO{
    
    KoneksiDB db = null;

    public DAOModaTransportasi(){
        db = new KoneksiDB();
    }

    public void simpan(){
        String sql = "INSERT into moda_transportasi( Id_Moda, Tipe_Moda) values ('" + kdModa + "','" + tipeModa + "')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE moda_transportasi SET Tipe_Moda='"+tipeModa+"' WHERE Id_Moda='"+kdModa+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM moda_transportasi WHERE Id_Moda='"+kdModa+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public List tampil() {
        List<ModaTransportasi> data = new ArrayList<ModaTransportasi>();
        ResultSet rs = null;

        try {
            String sql = "select * from moda_transportasi order by Id_Moda asc";
            rs = db.ambilData(sql);
            System.out.print(sql);
            while (rs.next()) {
                ModaTransportasi um = new ModaTransportasi();
                um.setKdModa(rs.getString("Id_Moda"));
                um.setTipeModa(rs.getString("Tipe_Moda"));
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
        List<ModaTransportasi> data = new ArrayList<ModaTransportasi>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM moda_transportasi WHERE Kd_Moda='"+kdModa+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                ModaTransportasi m = new ModaTransportasi();
                m.setKdModa(rs.getString("Id_Moda"));
                m.setTipeModa(rs.getString("Tipe_Moda"));
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
            String sql = "SELECT MAX(Id_Moda) FROM moda_transportasi";   // mengambil maksimal ddari kd_moda
            
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


