/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import repository.KoneksiDB;



/**
 *
 * @author Mohridwan
 */
public class Lokasi {
    
    public String idLokasi;
    public String namaLokasi;
    public String alamat;
    KoneksiDB db = null;
    
    public Lokasi(){
        db = new KoneksiDB();
    }
    

    public String getIdLokasi() {
        return idLokasi;
    }

    public void setIdLokasi(String idLokasi) {
        this.idLokasi = idLokasi;
    }


    public String getNamaLokasi() {
        return namaLokasi;
    }

 
    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }


    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
        public void simpan(){
        String sql = "INSERT into lokasi( Idlokasi, nama_lokasi, alamat) values ('" + idLokasi + "','" + namaLokasi + "','" + alamat + "')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE lokasi SET nama_lokasi='"+namaLokasi+"',alamat='"+alamat+"' WHERE idLokasi='"+idLokasi+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM lokasi WHERE idLokasi='"+idLokasi+"'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<Lokasi> data = new ArrayList<Lokasi>();
        ResultSet rs = null;

        try {
            String sql = "select * from lokasi order by idLokasi asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Lokasi um = new Lokasi();
                um.setIdLokasi(rs.getString("idLokasi"));
                um.setNamaLokasi(rs.getString("nama_lokasi"));
                um.setAlamat(rs.getString("alamat"));
                data.add(um);

<<<<<<< HEAD
=======
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
        public List cariID() {
        List<Lokasi> data = new ArrayList<Lokasi>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM lokasi WHERE idLokasi='"+idLokasi+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Lokasi m = new Lokasi();
                m.setIdLokasi(rs.getString("idLokasi"));
                m.setNamaLokasi(rs.getString("nama_lokasi"));
                m.setAlamat(rs.getString("alamat"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;

    }
>>>>>>> cbe4bf2d8b7d365872b01b2c03b6e93ace831471
}