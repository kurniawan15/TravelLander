/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.KoneksiDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Event;
import model.Lokasi;

/**
 *
 * 
 */
public class DAOEvent extends Event implements DAO{
    
   static  KoneksiDB db = null;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    public DAOEvent() {
       db = new KoneksiDB();
    }
 

    public void simpan(){
        
        String sql = "INSERT into event(kd_event,kd_perjalanan,kd_traveller,nama_event,waktu_mulai,waktu_selesai,keterangan) values('"+kdEvent+"','"+kdPerjalanan+"','"+kdTraveller+"','"+nameEvent+"','"+format.format(startTime)+"','"+format.format(endTime)+"','"+keterangan+"')";
        db.simpanData(sql);
        System.out.println(sql);
    }

    @Override
    public void update() {
       String sql = "UPDATE event set kd_perjalanan = '"+kdPerjalanan+"',nama_event = '"+nameEvent+"',waktu_mulai = '"+format.format(startTime)+"', waktu_selesai= '"+format.format(endTime)+"',keterangan = '"+keterangan+"' where kd_event = '"+kdEvent+"' and kd_traveller = '"+kdTraveller+"'";
       db.simpanData(sql);
       System.out.println(sql);
    }

    @Override
    public void hapus() {
        String sql ="DELETE FROM Event WHERE kd_Event = '"+kdEvent+"'";
        db.simpanData(sql);
    }

    @Override
    public List tampil() {
        List<Event> listEvent = new ArrayList<Event>();
        ResultSet rs = null;
        try{
            String sql = "SELECT * FROM event";
            rs = db.ambilData(sql);
            System.out.println(sql);
            while(rs.next()){
                Event ev = new Event();
                ev.setKdEvent(rs.getString("kd_event"));
                ev.setNameEvent(rs.getString("nama_event"));
                ev.setKdPerjalanan(rs.getString("kd_perjalanan"));
                ev.setKeterangan(rs.getString("keterangan"));
                ev.setStartTime(rs.getDate("waktu_mulai"));
                ev.setEndTime(rs.getDate("waktu_selesai"));
                ev.setKdTraveller(rs.getString("kd_traveller"));
                
                listEvent.add(ev);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
       return listEvent;
     }

    
    public List cariID() {
        List<Event> listEvent = new ArrayList<Event>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM event WHERE kd_event='"+kdEvent+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Event ev = new Event();
                ev.setKdEvent(rs.getString("kd_event"));
                ev.setNameEvent(rs.getString("nama_event"));
                ev.setStartTime(rs.getDate("waktu_mulai"));
                ev.setEndTime(rs.getDate("waktu_selesai"));
                ev.setKdTraveller(rs.getString("kd_traveller"));
                ev.setKdPerjalanan(rs.getString("kd_Perjalanan"));
                ev.setKeterangan(rs.getString("keterangan"));
                
                listEvent.add(ev);
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return listEvent;
    }
    
    public String getNewId() throws SQLException{
            
            //EV230917TR000101
            SimpleDateFormat format = new SimpleDateFormat("ddMMyy");    
            String date = format.format(startTime);
            String idEvent = "EV" + date;
            String kdTraveller = "TR0001";
            
            idEvent+=kdTraveller;
            idEvent = idEvent + "00";
            
            int cnt = 0;
            String sql = "SELECT MAX(kd_event) FROM event WHERE substring(kd_event,1,14) = substring('"+idEvent+"',1,14)"; 
            
            ResultSet resultSet = db.ambilData(sql);

            while (resultSet.next()) {
                   idEvent = resultSet.getString(1);
               
            } 
            
            if(idEvent == null){
                idEvent = "EV" + date + kdTraveller + "01";
            }
            else{
                cnt = Integer.parseInt(idEvent.substring(14));
            }
            
            
            cnt++;
            if(cnt < 10){
                idEvent = "EV" + date + kdTraveller + "0" +String.valueOf(cnt);
            }
            else{
               idEvent = "EV" + date  + kdTraveller +String.valueOf(cnt);
            }
            
            db.diskonek(resultSet);
            
            return idEvent;
         }
    
    public static void main(String[]args){
       DAOEvent dao = new DAOEvent();
       SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh.mm");
       try{
            System.out.println(dao.getNewId());
            dao.setKdEvent(dao.getNewId());
       }catch(Exception ex){
           ex.printStackTrace();
       }
            
        dao.setNameEvent("Main");
       
       try {
           dao.setStartTime(format.parse("29/10/2017 21.00"));
           dao.setEndTime(format.parse("29/10/2017 23.00"));
       } catch (ParseException ex) {
           Logger.getLogger(DAOEvent.class.getName()).log(Level.SEVERE, null, ex);
       }
        dao.setKdPerjalanan("IDP0006");
        dao.setKeterangan("Bayar masing masing");
        dao.setKdTraveller("TR0001");
        
        dao.simpan();
    }
}
