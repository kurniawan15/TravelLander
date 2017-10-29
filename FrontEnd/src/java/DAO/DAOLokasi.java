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
public class DAOLokasi extends Lokasi {
    
    KoneksiDB db = null;


    public DAOLokasi(){

        db = new KoneksiDB();
    }

    public void simpan(){
        String sql = "INSERT into lokasi(kd_lokasi, nama_lokasi, alamat, id_kota, id_provinsi) values ('" + kd_lokasi + "','" + namaLokasi + "','" + alamat + "', '" + id_kota + "', '"+id_provinsi+ "')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE lokasi SET nama_lokasi='"+namaLokasi+"',alamat='"+alamat+"',id_kota='"+id_kota+"',id_provinsi='"+id_provinsi+"' WHERE kd_lokasi='"+kd_lokasi+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM lokasi WHERE kd_lokasi='"+kd_lokasi+"'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<Lokasi> data = new ArrayList<Lokasi>();
        ResultSet rs = null;

        try {
            String sql = "select * from lokasi order by kd_lokasi asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Lokasi dlok = new Lokasi();
                dlok.setKdLokasi(rs.getString("kd_lokasi"));
                dlok.setNamaLokasi(rs.getString("nama_lokasi"));
                dlok.setAlamat(rs.getString("alamat"));
                dlok.setId_kota(rs.getString("id_kota"));
                dlok.setId_provinsi(rs.getString("id_provinsi"));
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
            String sql = "SELECT * FROM lokasi WHERE kd_lokasi='"+kd_lokasi+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Lokasi lok = new Lokasi();
                lok.setKdLokasi(rs.getString("kd_lokasi"));
                lok.setNamaLokasi(rs.getString("nama_lokasi"));
                lok.setAlamat(rs.getString("alamat"));
                lok.setId_kota(rs.getString("id_kota"));
                lok.setId_provinsi(rs.getString("id_provinsi"));
                data.add(lok);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;
    }
        
        public List cariID(String kd_lokasi) {
        List<Lokasi> data = new ArrayList<Lokasi>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM lokasi WHERE kd_lokasi='"+kd_lokasi+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Lokasi m = new Lokasi();
                m.setKdLokasi(rs.getString("kd_lokasi"));
                m.setNamaLokasi(rs.getString("nama_lokasi"));
                m.setAlamat(rs.getString("alamat"));
                m.setId_kota(rs.getString("id_kota"));
                m.setId_provinsi(rs.getString("id_provinsi"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;
    }
}