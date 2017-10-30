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
import model.Provinsi;

/**
 *
 * @author Fauzan Akmal
 */
public class DAOProvinsi extends Provinsi{
    
    KoneksiDB db = null;
    
    public DAOProvinsi(){
        
        db = new KoneksiDB();
    }
    
    public void simpan(){
        String sql = "INSERT into provinsi(id_provinsi, nama_provinsi, ibu_kota) values ('" + idProvinsi + "','" + namaProvinsi + "','" + ibuKota + "')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE provinsi SET nama_provinsi='" + namaProvinsi + "', ibu_kota ='" + ibuKota + "' WHERE id_provinsi ='" + idProvinsi + "'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM provinsi WHERE id_provinsi = '" + idProvinsi + "'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<Provinsi> data = new ArrayList<Provinsi>();
        ResultSet rs = null;

        try {
            String sql = "select * from provinsi order by id_provinsi asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Provinsi um = new Provinsi();
                um.setIdProvinsi(rs.getString("id_provinsi"));
                um.setNamaProvinsi(rs.getString("nama_provinsi"));
                um.setIbuKota(rs.getString("ibu_kota"));
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
            String sql = "SELECT * FROM provinsi WHERE id_provinsi = '" + getIdProvinsi() + "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Provinsi m = new Provinsi();
                m.setIdProvinsi(rs.getString("id_provinsi"));
                m.setNamaProvinsi(rs.getString("nama_provinsi"));
                m.setIbuKota(rs.getString("ibu_kota"));
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
            String sql = "SELECT * FROM jarak WHERE id_provinsi = '" + idProvinsi + "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Provinsi m = new Provinsi();
                m.setIdProvinsi(rs.getString("id_provinsi"));
                m.setNamaProvinsi(rs.getString("nama_provinsi"));
                m.setIbuKota(rs.getString("ibu_kota"));
                data.add(m);
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;
    }    
}
