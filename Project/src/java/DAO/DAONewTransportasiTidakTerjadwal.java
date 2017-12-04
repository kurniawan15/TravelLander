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
import model.NewTransportasiTidakTerjadwal;

/**
 *
 * @author Dewi Roaza
 */
public class DAONewTransportasiTidakTerjadwal extends NewTransportasiTidakTerjadwal implements DAO {
    KoneksiDB db = null;
    
    public DAONewTransportasiTidakTerjadwal (){
        db = new KoneksiDB ();
    }
    
    public void simpan(){
        String sql = "INSERT into Transportasi_Tidak_Terjadwal ( Kd_Transportasi_Tidak_Terjadwal, Id_Moda, Nama_Transportasi_Tidak_Terjadwal) values ('" + kdTransportasiTidakTerjadwal + "','" + idModa + "','" + namaTransportasiTidakTerjadwal + "')";
        db.simpanData(sql);
    }
    
    public void update(){
        String sql="UPDATE Transportasi_Tidak_Terjadwal SET Id_Moda='"+idModa+"', Nama_Transportasi_Tidak_Terjadwal='"+namaTransportasiTidakTerjadwal+"' WHERE Kd_Transportasi_Tidak_Terjadwal= '" + kdTransportasiTidakTerjadwal + "'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    
    public void hapus(){
        String sql="DELETE FROM transportasi_pribadi WHERE Kd_Transportasi_Tidak_Terjadwal= '" + kdTransportasiTidakTerjadwal+ "'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<NewTransportasiTidakTerjadwal> data = new ArrayList<NewTransportasiTidakTerjadwal>();
        ResultSet rs = null;

        try {
            String sql = "select * from Transportasi_Tidak_Terjadwal order by Kd_Transportasi_Tidak_Terjadwal asc";
            rs = db.ambilData(sql);
            System.out.println(sql);
            while (rs.next()) {
                NewTransportasiTidakTerjadwal um = new NewTransportasiTidakTerjadwal();
                um.setKdTransportasiTidakTerjadwal(rs.getString("Kd_Transportasi_Tidak_Terjadwal"));
                um.setIdModa(rs.getString("Id_Moda"));
                um.setNamaTransportasiTidakTerjadwal(rs.getString("Nama_Transportasi_Tidak_Terjadwal"));
                data.add(um);
   }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
            ex.printStackTrace();
        }
        return data;
    }
        public List cariID() {
        List<NewTransportasiTidakTerjadwal> data = new ArrayList<NewTransportasiTidakTerjadwal>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM Transportasi_Tidak_Terjadwal WHERE Kd_Transportasi_Tidak_Terjadwal= '" + kdTransportasiTidakTerjadwal+ "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                NewTransportasiTidakTerjadwal m = new NewTransportasiTidakTerjadwal();
                m.setKdTransportasiTidakTerjadwal(rs.getString("Kd_Transportasi_Tidak_Terjadwal"));
                m.setIdModa(rs.getString("Id_Moda"));
                m.setNamaTransportasiTidakTerjadwal(rs.getString("Nama_Transportasi_Tidak_Terjadwal"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;

    }
}
