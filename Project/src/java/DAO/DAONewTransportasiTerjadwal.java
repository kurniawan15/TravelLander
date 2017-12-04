/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.KoneksiDB;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.NewTransportasiTerjadwal;

/**
 *
 * @author Dewi Roaza
 */
public class DAONewTransportasiTerjadwal extends NewTransportasiTerjadwal implements DAO{
    KoneksiDB db = null;
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
    public DAONewTransportasiTerjadwal (){
        db = new KoneksiDB ();
    }
    
    public void simpan(){
        String sql = "INSERT into Transportasi_Terjadwal ( Kd_Transportasi_Terjadwal, Id_Moda, Nama_Transportasi_Terjadwal, Waktu_Berangkat, Waktu_Datang) values ('" + kdTransportasiTerjadwal+ "','" + idModa + "','" + namaTransportasiTerjadwal + "','" + waktuBerangkat + "','" + waktuDatang + "')";
        db.simpanData(sql);
    }
    
    public void update(){
        String sql="UPDATE Transportasi_Terjadwal SET  Id_Moda='"+idModa+"', Nama_Transportasi_Terjadwal='"+namaTransportasiTerjadwal+"', Waktu_Berangkat='"+waktuBerangkat+"', Waktu_Datang='"+waktuDatang+"' WHERE Kd_Transportasi_Terjadwal= '" + kdTransportasiTerjadwal+ "'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    
    public void hapus(){
        String sql="DELETE FROM Transportasi_Terjadwal WHERE Kd_Transportasi_Terjadwal= '" + kdTransportasiTerjadwal+ "'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<NewTransportasiTerjadwal> data = new ArrayList<NewTransportasiTerjadwal>();
        ResultSet rs = null;

        try {
            String sql = "select * from Transportasi_Terjadwal ";
            rs = db.ambilData(sql);
            System.out.println(sql);
            while (rs.next()) {
                NewTransportasiTerjadwal tp = new NewTransportasiTerjadwal();
                tp.setKdTransportasiTerjadwal(rs.getString("Kd_Transportasi_Terjadwal"));
                tp.setIdModa(rs.getString("Id_Moda"));
                tp.setNamaTransportasiTerjadwal(rs.getString("Nama_Transportasi_Terjadwal"));
                if(rs.getString("Waktu_Berangkat").equals("0000-00-00 00:00:00")){
                    tp.setWaktuBerangkat(format.parse("1970-01-01 01:00:00"));
                }
                else{
                    tp.setWaktuBerangkat(new Date (rs.getTimestamp("Waktu_Berangkat").getTime()));
                }
                if(rs.getString("Waktu_Datang").equals("0000-00-00 00:00:00")){
                    tp.setWaktuBerangkat(format.parse("1970-01-01 01:00:00"));
                }
                else{
                    tp.setWaktuBerangkat(new Date (rs.getTimestamp("Waktu_Datang").getTime()));
                }
                data.add(tp);
                }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
            ex.printStackTrace();
        }
        return data;
    }
    
        public List cariID() {
        List<NewTransportasiTerjadwal> data = new ArrayList<NewTransportasiTerjadwal>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM Transportasi_Terjadwal WHERE Kd_Transportasi_Terjadwal= '" + kdTransportasiTerjadwal+ "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                NewTransportasiTerjadwal tp = new NewTransportasiTerjadwal();
                tp.setKdTransportasiTerjadwal(rs.getString("Kd_Transportasi_Terjadwal"));
                tp.setIdModa(rs.getString("Id_Moda"));
                tp.setNamaTransportasiTerjadwal(rs.getString("Nama_Transportasi_Terjadwal"));
                tp.setWaktuBerangkat(rs.getDate("Waktu_Berangkat"));
                tp.setWaktuDatang(rs.getDate("Waktu_Datang"));
                data.add(tp);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
            ex.printStackTrace();
        }
        return data;
    }
}
