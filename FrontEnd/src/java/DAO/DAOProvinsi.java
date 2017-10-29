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
import model.Jarak;
import model.Lokasi;

/**
 *
 * @author Fauzan Akmal
 */
public class DAOProvinsi extends Provinsi{
    
    KoneksuDB db = null;
    
    public DAOProvinsi(){
        
        db = new KoneksiDB();
    }
    
    public void simpan(){
        String sql = "INSERT into provinsi(id_provinsi, nama_provinsi, ibu_kota) values ('" + idProvinsi + "','" + namaProvinsi + "','" + ibuKota + "')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE lokasi SET id_provinsi='" + idProvinsi + "',nama_provinsi='" + namaProvinsi + "', ibu_kota ='" + ibuKota + "' WHERE idProvinsi ='" + idProvinsi + "'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM provinsi WHERE id_provinsi = '" + kdJarak + "'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<Provinsi> data = new ArrayList<Provinsi>();
        ResultSet rs = null;

        try {
            String sql = "select * from provinsi order by idProvinsi asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Provinsi um = new Provinsi();
                um.setidProvinsi(rs.getString("Id_Provinsi"));
                um.setnamaProvinsi(rs.getString("Nama_Provinsi"));
                um.setibuKota(rs.getString("Ibu_Kota"));
                data.add(um);
   }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
        public List cariID() {
        List<Provinsi> data = new ArrayList<Provinsi>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM provinsi WHERE Id_Provinsi = '" + idProvinsi + "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Provinsi m = new Provinsi();
                m.setidProvinsi(rs.getString("Id_Provinsi"));
                m.setnamaProvinsi(rs.getString("Nama_Provinsi"));
                m.setibuKota(rs.getString("Ibu_Kota"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;
    }
        
        public List cariID(String idProvinsi) {
        List<Provinsi> data = new ArrayList<Provinsi>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM jarak WHERE Id_Provinsi = '" + idProvinsi + "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Provinsi m = new Provinsi();
                m.setidProvinsi(rs.getString("Id_Provinsi"));
                m.setnamaProvinsi(rs.getString("Nama_Provinsi"));
                m.setibuKota(rs.getString("Ibu_Kota"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;
    }
    
}
