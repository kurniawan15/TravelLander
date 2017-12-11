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
import model.NewLokasi;

/**
 *
 * @author Dewi Roaza
 */
public class DAONewLokasi extends NewLokasi implements DAO {
    KoneksiDB db = null;


    public DAONewLokasi(){

        db = new KoneksiDB();
    }

    public void simpan(){
        String sql = "INSERT into lokasi(kd_event, nama_lokasi, latitude, longitude, alamat, keterangan) values ('" + kdEvent + "','" + namaLokasi + "','" + latitude + "', '" + longitude + "', '"+alamat+ "', '"+keterangan+ "')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE lokasi SET nama_lokasi='"+namaLokasi+"',latitude='"+latitude+"',longitude='"+longitude+"',alamat='"+alamat+"',keterangan='"+keterangan+"' WHERE kd_event='"+kdEvent+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM lokasi WHERE kd_event='"+kdEvent+"'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<NewLokasi> data = new ArrayList<NewLokasi>();
        ResultSet rs = null;

        try {
            /*String sql = "SELECT lokasi.kd_lokasi, lokasi.nama_lokasi, lokasi.alamat, lokasi.id_kota, kota.nama_kota, kota.id_provinsi,"
                    + " provinsi.nama_provinsi FROM lokasi INNER JOIN kota ON lokasi.id_kota = kota.id_kota "
                    + "INNER JOIN provinsi ON kota.id_provinsi = provinsi.id_provinsi";
            */
            String sql = "SELECT * FROM list_lokasi";
            rs = db.ambilData(sql);
            while (rs.next()) {
                NewLokasi dlok = new NewLokasi();
                dlok.setKdEvent(rs.getString("kd_event"));
                dlok.setNamaLokasi(rs.getString("nama_lokasi"));
                dlok.setLatitude(rs.getString("latitude"));
                dlok.setLongitude(rs.getString("langitude"));                
                dlok.setAlamat(rs.getString("alamat"));
                dlok.setKeterangan(rs.getString("keterangan"));
                data.add(dlok);
   }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
        public String getLokasiAkhir(String kd) {
        List<NewLokasi> data = new ArrayList<NewLokasi>();
        ResultSet rs = null;
        NewLokasi lok = new NewLokasi();
        try {
            String sql = "SELECT * FROM lokasi WHERE id_event='"+kd+"' and keterangan = 'akhir'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                
                lok.setKdEvent(rs.getString("id_event"));
                lok.setNamaLokasi(rs.getString("nama_lokasi"));
                lok.setLatitude(rs.getString("latitude"));
                lok.setLongitude(rs.getString("longitude"));
                lok.setAlamat(rs.getString("alamat"));
                lok.setKeterangan(rs.getString("keterangan"));
                //data.add(lok);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return lok.getNamaLokasi();
    }
}
