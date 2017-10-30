/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Kota;
import Database.KoneksiDB;
import java.sql.SQLException;


/**
 *
 * @author Fadhil-PC
 */
public class DAOKota extends Kota {
    
    KoneksiDB db = null;


    public DAOKota(){

        db = new KoneksiDB();
    }

    public void simpan(){
        String sql = "INSERT into kota( id_kota, nama_kota, id_provinsi) values ('" + idKota + "','" + namaKota + "','" + idProvinsi + "')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE kota SET nama_kota='"+namaKota+"',id_provinsi='"+idProvinsi+"' WHERE id_kota='"+idKota+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM kota WHERE id_kota='"+idKota+"'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<Kota> data = new ArrayList<Kota>();
        ResultSet rs = null;

        try {
            String sql = "select * from kota order by id_kota asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Kota um = new Kota();
                um.setIdKota(rs.getString("id_kota"));
                um.setNamaKota(rs.getString("nama_kota"));
                um.setIdProvinsi(rs.getString("id_provinsi"));
                data.add(um);
   }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
        public List cariID() {
        List<Kota> data = new ArrayList<Kota>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM kota WHERE id_kota='"+idKota+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Kota m = new Kota();
                m.setIdKota(rs.getString("id_kota"));
                m.setNamaKota(rs.getString("nama_kota"));
                m.setIdProvinsi(rs.getString("id_provinsi"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;

    }
        public String getNewId() throws SQLException{
            
            String kdKota = "KT000";
            
            int cnt = 0;
            String sql = "SELECT MAX(id_kota) FROM kota";   // mengambil maksimal id kota
            
            ResultSet resultSet = db.ambilData(sql);
            System.out.println(sql);

            while (resultSet.next()) {                      // selama masih ada isinya diambil
                kdKota = resultSet.getString(1);            // yang diambil 1=kd kota
            } 
            
            cnt = Integer.parseInt(kdKota.substring(2));    // mengambil dari index ke 2 (mulai dri 0)
            cnt++;
            if(cnt >= 100){
                kdKota = "KT" + String.valueOf(cnt);
            }
            else if(cnt < 100 && cnt >= 10){
               kdKota = "KT" + "0" + String.valueOf(cnt);
            }
            else{
               kdKota = "KT" + "00" + String.valueOf(cnt);
            }
            db.diskonek(resultSet);
            return kdKota;
         }
}
