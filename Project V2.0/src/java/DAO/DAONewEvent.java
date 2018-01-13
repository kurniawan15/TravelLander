/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.KoneksiDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.NewEvent;

/**
 *
 * @author Dewi Roaza
 */
public class DAONewEvent extends NewEvent implements DAO{
    static  KoneksiDB db = null;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public DAONewEvent() {
       db = new KoneksiDB();
    }
 

    public void simpan(){
        //
        String sql = "INSERT into event(Kd_Event,Kd_Traveller,Travel_Mode,Avoidtolls,Nama_Event,Waktu_Mulai,Waktu_Selesai,Keterangan) values('"+kdEvent+"','"+kdTraveller+"','"+travelMode+"',"+avoidtolls+",'"+namaEvent+"','"+format.format(waktuMulai)+"','"+format.format(waktuSelesai)+"','"+keterangan+"')";
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
        List<NewEvent> listEvent = new ArrayList<NewEvent>();
        ResultSet rs = null;
        try{
            String sql = "SELECT * FROM event";
            rs = db.ambilData(sql);
            System.out.println(sql);
            while(rs.next()){
                NewEvent ev = new NewEvent();
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

    public List cariID() {
        List<NewEvent> listEvent = new ArrayList<NewEvent>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM event WHERE Kd_Event='"+kdEvent+"'";
            rs = db.ambilData(sql);
            System.out.println(sql);
            while (rs.next()) {
                NewEvent ev = new NewEvent();
                ev.setKdEvent(rs.getString("Kd_Event"));
                ev.setKdTraveller(rs.getString("Kd_Traveller"));
                
                ev.setTravelMode(rs.getString("Travel_Mode"));
                ev.setAvoidtolls(rs.getInt("Avoidtolls"));
                
                ev.setNamaEvent(rs.getString("Nama_Event"));
                ev.setWaktuMulai(new Date(rs.getTimestamp("Waktu_Mulai").getTime()));
                ev.setWaktuSelesai(new Date(rs.getTimestamp("Waktu_Selesai").getTime()));
                ev.setKeterangan(rs.getString("Keterangan"));
                
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
            String date = format.format(waktuMulai);
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
    /**
     * 
     * @return List Traveller
     */
    public List getEventByTraveller() {
        List<NewEvent> listEvent = new ArrayList<NewEvent>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM event WHERE Kd_Traveller='"+kdTraveller+"'";
            rs = db.ambilData(sql);
            System.out.println(sql);
            while (rs.next()) {
                NewEvent ev = new NewEvent();
                ev.setKdEvent(rs.getString("Kd_Event"));
                ev.setKdTraveller(rs.getString("Kd_Traveller"));
                
                ev.setTravelMode(rs.getString("Travel_Mode"));
                ev.setAvoidtolls(rs.getInt("Avoidtolls"));
                
                ev.setNamaEvent(rs.getString("Nama_Event"));
                ev.setWaktuMulai(new Date(rs.getTimestamp("Waktu_Mulai").getTime()));
                ev.setWaktuSelesai(new Date(rs.getTimestamp("Waktu_Selesai").getTime()));
                ev.setKeterangan(rs.getString("Keterangan"));
                
                listEvent.add(ev);
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return listEvent;
    }
/*-------------------------------------------------------------------------------------------------------------*/    
    public List<NewEvent> getEventNext (String kdTraveller){
        List<NewEvent> listEvent = new ArrayList<NewEvent>();
        String sql ="call event_next('"+kdTraveller+"')";
        ResultSet rs =db.getDataProcedure(sql);
        try{
            while(rs.next()){
                NewEvent nx = new NewEvent();
                nx.setKdEvent(rs.getString("Kd_Event"));
                nx.setKdTraveller (rs.getString("Kd_Traveller"));
                nx.setTravelMode(rs.getString("Travel_Mode"));
                nx.setAvoidtolls(rs.getInt("Avoidtolls"));
                nx.setNamaEvent(rs.getString("Nama_Event"));
                nx.setWaktuMulai(new Date(rs.getTimestamp("Waktu_Mulai").getTime()));
                nx.setWaktuSelesai(new Date(rs.getTimestamp("Waktu_Selesai").getTime()));
                nx.setKeterangan(rs.getString("Keterangan"));
                listEvent.add(nx);
            }            
        }catch (SQLException ex){
            System.out.println("terjadi kesalahan saat menampilkan EventNex : ");
            ex.printStackTrace();
        }
        return listEvent;
    } 
    public Date getDepartureTime(Date arrTime,Time trivial){
        Date deptTime = null;
        
        deptTime = new Date(arrTime.getTime() - trivial.getTime());
        return deptTime;
    } 
}
