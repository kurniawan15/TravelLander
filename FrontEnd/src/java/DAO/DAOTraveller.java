/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Traveller;
import Database.KoneksiDB;


/**
 *
 * @author Fadhil-PC
 */
public class DAOTraveller extends Traveller {
    
    KoneksiDB db = null;


public DAOTraveller(){

     db = new KoneksiDB();
}

    public void simpan(){
        String sql = "INSERT into traveller( Kd_Traveller, Nama_Traveller, Username, Password, Email) values ('" + Kd_Traveller + "','" + Nama_Traveller + "','" + Username + "','" + Password + "','" + Email + "')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE traveller SET Nama_Traveller='"+Nama_Traveller+"', Username='"+Username+"', Password='"+Password+"', Email='"+Email+"' WHERE Kd_Traveller='"+ Kd_Traveller +"' ";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM traveller WHERE Kd_Traveller='"+Kd_Traveller+"'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<Traveller> data = new ArrayList<Traveller>();
        ResultSet rs = null;

        try {
            String sql = "select * from traveller order by Kd_Traveller asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Traveller um = new Traveller();
                um.setKd_Traveller(rs.getString("Kd_Traveller"));
                um.setNama_Traveller(rs.getString("Nama_Traveller"));
                um.setUsername(rs.getString("Username"));
                um.setPassword(rs.getString("Password"));
                um.setEmail(rs.getString("Email"));
                data.add(um);
   }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
        public List cariID() {
        List<Traveller> data = new ArrayList<Traveller>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM traveller WHERE Kd_Traveller='"+Kd_Traveller+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Traveller m = new Traveller();
                m.setKd_Traveller(rs.getString("Kd_Traveller"));
                m.setNama_Traveller(rs.getString("Nama_Traveller"));
                m.setUsername(rs.getString("Username"));
                m.setPassword(rs.getString("Password"));
                m.setEmail(rs.getString("Email"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;

    }
}
