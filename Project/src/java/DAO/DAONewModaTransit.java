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
import model.NewModaPerjalanan;
import model.NewModaTransit;

/**
 *
 * @author Dewi Roaza
 */
public class DAONewModaTransit extends NewModaTransit implements DAO{

    KoneksiDB db = null;

    public DAONewModaTransit(){
        db = new KoneksiDB();
    }

    public void simpan(){
        String sql = "INSERT into moda_transit( Kd_Event, Vehicle_Mode, Transit) values ('" + kdEvent + "','" + vehicleMode + "','" + transit + "')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE moda_transit SET Vehicle_Mode='"+vehicleMode+"', Transit ='"+transit+"' WHERE Kd_Event='"+kdEvent+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM moda_transit WHERE Kd_Event='"+kdEvent+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public List tampil() {
        List<NewModaTransit> data = new ArrayList<NewModaTransit>();
        ResultSet rs = null;

        try {
            String sql = "select * from moda_transit order by Kd_Event asc";
            rs = db.ambilData(sql);
            System.out.print(sql);
            while (rs.next()) {
                NewModaTransit um = new NewModaTransit();
                um.setKdEvent(rs.getString("Kd_Event"));
                um.setVehicleMode(rs.getString("Vehicle_Mode"));
                um.setTransit(rs.getString("Transit"));
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
        List<NewModaTransit> data = new ArrayList<NewModaTransit>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM moda_transit WHERE Kd_Event='"+kdEvent+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                NewModaTransit m = new NewModaTransit();
                m.setKdEvent(rs.getString("Kd_Event"));
                m.setVehicleMode(rs.getString("Vehicle_Mode"));
                m.setTransit(rs.getString("Transit"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;

    }
}
