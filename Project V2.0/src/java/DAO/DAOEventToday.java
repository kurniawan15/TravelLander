/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.KoneksiDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.EventNext;

/**
 *
 * @author Hari
 */
public class DAOEventToday extends EventNext implements DAO{
    KoneksiDB db = null;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public DAOEventToday() {
       db = new KoneksiDB();
    }
 

    public void simpan(){
        //
        String sql = "INSERT into event(Kd_Event,Kd_Traveller,Nama_Traveller, Travel_Mode,Avoidtolls,Nama_Event,Waktu_Mulai,Waktu_Selesai,Keterangan, Nama_Lokasi, Alamat, Latitude, Langitude) values('"+kdEvent+"','"+kdTraveller+"','"+namaTraveller+"','"+travelMode+"',"+avoidtolls+",'"+namaEvent+"','"+format.format(waktuMulai)+"','"+format.format(waktuSelesai)+"','"+keterangan+"','"+namaLokasi+"','"+alamat+"','"+latitude+"','"+langitude+"')";
        db.simpanData(sql);
         System.out.println(sql);
    }

    @Override
    public void update() {
       String sql = "UPDATE event set Travel_Mode = '"+travelMode+"',Avoidtolls = '"+avoidtolls+"',Nama_Event = '"+namaEvent+"',Waktu_Mulai = '"+format.format(waktuMulai)+"', Waktu_Selesai= '"+format.format(waktuSelesai)+"',Keterangan = '"+keterangan+"' where Kd_Event = '"+kdEvent+"' and Kd_Traveller = '"+kdTraveller+"'";
       db.simpanData(sql);
       System.out.println(sql);
    }

    @Override
    public void hapus() {
        String sql ="DELETE FROM event WHERE Kd_Event = '"+kdEvent+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }

    @Override
    public List tampil() {
        List<EventNext> listEvent = new ArrayList<EventNext>();
        ResultSet rs = null;
        try{
            String sql = "SELECT * FROM event";
            rs = db.ambilData(sql);
            System.out.println(sql);
            while(rs.next()){
                EventNext ev = new EventNext();
                ev.setKdEvent(rs.getString("Kd_Event"));
                ev.setKdTraveller (rs.getString("Kd_Traveller"));
                ev.setTravelMode(rs.getString("Travel_Mode"));
                ev.setAvoidtolls(rs.getInt("Avoidtolls"));
                ev.setNamaEvent(rs.getString("Nama_Event"));
                ev.setWaktuMulai(new Date(rs.getTimestamp("Waktu_Mulai").getTime()));
                ev.setWaktuSelesai(new Date(rs.getTimestamp("Waktu_Selesai").getTime()));
                ev.setKeterangan(rs.getString("Keterangan"));
                listEvent.add(ev);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
       return listEvent;
     }

    public List<EventNext> getEventToday (String kdTraveller){
        List<EventNext> listEvent = new ArrayList<EventNext>();
        String sql ="call event_today('"+kdTraveller+"')";
        ResultSet rs = db.getDataProcedure(sql);
        try{
            while(rs.next()){
                EventNext et = new EventNext();
                et.setKdEvent(rs.getString("Kd_Event"));
                et.setKdTraveller (rs.getString("Kd_Traveller"));
                et.setTravelMode(rs.getString("Travel_Mode"));
                et.setAvoidtolls(rs.getInt("Avoidtolls"));
                et.setNamaEvent(rs.getString("Nama_Event"));
                et.setWaktuMulai(new Date(rs.getTimestamp("Waktu_Mulai").getTime()));
                et.setWaktuSelesai(new Date(rs.getTimestamp("Waktu_Selesai").getTime()));
                et.setKeterangan(rs.getString("Keterangan_Event"));
                listEvent.add(et);
            }            
        }catch (SQLException ex){
            System.out.println("terjadi kesalahan saat menampilkan EventNex : ");
            ex.printStackTrace();
        }
        return listEvent;
    }
}
