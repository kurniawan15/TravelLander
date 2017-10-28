/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.KoneksiDB;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.ModaTransportasi;

/**
 *
 * @author Dewi Roaza
 */
public class DAOModaTransportasi extends ModaTransportasi {
    
    KoneksiDB db = null;

    public DAOModaTransportasi(){
        db = new KoneksiDB();
    }

    public void simpan(){
        String sql = "INSERT into moda_transportasi( Kd_Moda, Tipe_Moda) values ('" + kdModa + "','" + tipeModa + "')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE moda_transportasi SET Tipe_Moda='"+tipeModa+"' WHERE Kd_Moda='"+kdModa+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM moda_transportasi WHERE Kd_Moda='"+kdModa+"'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<ModaTransportasi> data = new ArrayList<ModaTransportasi>();
        ResultSet rs = null;

        try {
            String sql = "select * from moda_transportasi order by Kd_Moda asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                ModaTransportasi um = new ModaTransportasi();
                um.setkdModa(rs.getString("Kd_Moda"));
                um.settipeModa(rs.getString("Tipe_Moda"));
                data.add(um);
   }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
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
                m.setkdModa(rs.getString("Kd_Moda"));
                m.settipeModa(rs.getString("Tipe_Moda"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;

    }

}


