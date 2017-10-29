/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Lokasi;
import Database.KoneksiDB;

/**
 *
 * @author Cyber Pegasus
 */
public class DAOLokasi extends Lokasi{
    
    KoneksiDB db = null;


public DAOLokasi(){

     db = new KoneksiDB();
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
                Lokasi dlok = new Lokasi();
                dlok.setIdLokasi(rs.getString("idLokasi"));
                dlok.setNamaLokasi(rs.getString("nama_lokasi"));
                dlok.setAlamat(rs.getString("alamat"));
                data.add(dlok);
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
                Lokasi lok = new Lokasi();
                lok.setIdLokasi(rs.getString("idLokasi"));
                lok.setNamaLokasi(rs.getString("nama_lokasi"));
                lok.setAlamat(rs.getString("alamat"));
                data.add(lok);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;

    }
}