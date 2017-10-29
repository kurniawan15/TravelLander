/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.DAODB;
import Database.KoneksiDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Event;
import model.Lokasi;

/**
 *
 * @author Zulkifli Arsyad
 */
public class DAOEvent extends Event implements DAO{
    
    static KoneksiDB db = null;
    
    public DAOEvent() {
       db = new KoneksiDB();
    }
 

    public void simpan(){
        String sql = "INSERT into Event(id_event,id_perjalanan,kd_traveler,nama_event,waktu_mulai,waktu_selesai,keterangan) values('"+idEvent+"','"+idPerjalanan+"','"+kdTraveller+"','"+nameEvent+"','"+startTime+"','"+endTime+"','"+keterangan+"')";
        db.simpanData(sql);
    }

    @Override
    public void update() {
       String sql = "UPDATE event set id_perjalanan = '"+idPerjalanan+"',name_event = '"+nameEvent+"',waktu_mulai = '"+startTime+"', waktu_selesai= '"+endTime+"',keterangan = '"+keterangan+"' where id_event = '"+idEvent+"' and kd_traveler = '"+kdTraveller+"'";
    }

    @Override
    public void hapus() {
        String sql ="DELETE FROM Event WHERE id_Event = '"+getIdEvent()+"'";
    }

    @Override
    public List tampil() {
        List<Event> listEvent = new ArrayList<Event>();
        ResultSet rs = null;
        try{
            String sql = "SELECT * FROM event";
            rs = db.ambilData(sql);
            while(rs.next()){
                Event ev = new Event();
                ev.setIdEvent(rs.getString("id_event"));
                ev.setNameEvent(rs.getString("nama_event"));
                ev.setIdPerjalanan(rs.getString("id_perjalanan"));
                ev.setKeterangan(rs.getString("keterangan"));
                ev.setStartTime(rs.getDate("waktu_mulai"));
                ev.setEndTime(rs.getDate("waktu_selesai"));
                ev.setKdTraveller(rs.getString("kd_traveller"));
                
                listEvent.add(ev);
            }
        }
        catch(Exception ex){
            
        }
       return listEvent;
     }

    
    public Event cariID(String idEvent) {
        Event ev = new Event();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM event WHERE id_event='"+idEvent+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                ev.setIdEvent(rs.getString("id_event"));
                ev.setNameEvent(rs.getString("nama_event"));
                ev.setStartTime(rs.getDate("waktu_mulai"));
                ev.setEndTime(rs.getDate("waktu_selesai"));
                ev.setKdTraveller(rs.getString("kd_traveller"));
                ev.setIdPerjalanan(rs.getString("id_perjalanan"));
                ev.setKeterangan(rs.getString("keterangan"));

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return ev;
    }
    
    public String getNewId() throws SQLException{
            
            //EV230917TR000101
            SimpleDateFormat format = new SimpleDateFormat("ddMMyy");       
            String idEvent = "EV" + format.format(new Date());
            String kdTraveller = "TR0001";
            
            idEvent+=kdTraveller;
            
            int cnt = 0;
            String sql = "SELECT MAX(id_event) FROM event WHERE substring(id_event) = '"+idEvent+"'"; 
            
            ResultSet resultSet = db.ambilData(sql);

            while (resultSet.next()) {
                idEvent = resultSet.getString(1);
            } 
            
            cnt = Integer.parseInt(idEvent.substring(3));
            cnt++;
            if(cnt < 10){
                idEvent = "EV" + kdTraveller + "0" +String.valueOf(cnt);
            }
            else{
               idEvent = "EV" + kdTraveller +String.valueOf(cnt);
            }
            db.diskonek(resultSet);
            return idEvent;
         }
    

    public static void main(String[]args){
        SimpleDateFormat format = new SimpleDateFormat("ddMMyy");       
            String idEvent = "EV" + format.format(new Date());
            String kdTraveller = "TR0001";
            
            idEvent+=kdTraveller;
            try{
            int cnt = 0;
            String sql = "SELECT MAX(id_event) FROM event WHERE substring(id_event,1,14) = '"+idEvent+"'"; 
            System.out.println(idEvent);
            ResultSet resultSet = new DAOEvent().db.ambilData(sql);

            while (resultSet.next()) {
                idEvent = resultSet.getString(1);
                System.out.println(resultSet.getString(1));
            } 
            
            System.out.println(idEvent);
            cnt = Integer.parseInt(idEvent.substring(14));
            cnt++;
            
            if(cnt < 10){
                idEvent = "EV" + kdTraveller + "0" +String.valueOf(cnt);
            }
            else{
               idEvent = "EV" + kdTraveller +String.valueOf(cnt);
            }
            
            db.diskonek(resultSet);
            
            System.out.println(idEvent);
    }
            
            catch(Exception ex){
                
            }
    }
}
