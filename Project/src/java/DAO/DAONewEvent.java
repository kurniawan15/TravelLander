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
        String sql = "INSERT into event(Id_Event,Kd_Traveller,Kd_Transportasi_Tidak_Terjadwal,Kd_Transportasi_Terjadwal,Nama_Event,Waktu_Mulai,Waktu_Selesai,Keterangan) values('"+idEvent+"','"+kdTraveller+"','"+kdTransportasiTidakTerjadwal+"','"+kdTransportasiTerjadwal+"','"+namaEvent+"','"+format.format(waktuMulai)+"','"+format.format(waktuSelesai)+"','"+keterangan+"')";
        db.simpanData(sql);
    }

    @Override
    public void update() {
       String sql = "UPDATE event set Kd_Transportasi_Tidak_Terjadwal = '"+kdTransportasiTidakTerjadwal+"',Kd_Transportasi_Terjadwal = '"+kdTransportasiTerjadwal+"',Nama_Event = '"+namaEvent+"',Waktu_Mulai = '"+format.format(waktuMulai)+"', Waktu_Selesai= '"+format.format(waktuSelesai)+"',Keterangan = '"+keterangan+"' where Id_Event = '"+idEvent+"' and Kd_Traveller = '"+kdTraveller+"'";
       db.simpanData(sql);
       System.out.println(sql);
    }

    @Override
    public void hapus() {
        String sql ="DELETE FROM event WHERE Id_Event = '"+idEvent+"'";
        db.simpanData(sql);
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
                ev.setIdEvent(rs.getString("Id_Event"));
                ev.setKdTraveller (rs.getString("Kd_Traveller"));
                ev.setKdTransportasiTidakTerjadwal(rs.getString("Kd_Transportasi_Tidak_Terjadwal"));
                ev.setKdTransportasiTerjadwal(rs.getString("Kd_Transportasi_Terjadwal"));
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
            String sql = "SELECT * FROM event WHERE Id_Event='"+idEvent+"'";
            rs = db.ambilData(sql);
            System.out.println(sql);
            while (rs.next()) {
                NewEvent ev = new NewEvent();
                ev.setIdEvent(rs.getString("Id_Event"));
                ev.setKdTraveller(rs.getString("Kd_Traveller"));
                ev.setKdTransportasiTidakTerjadwal(rs.getString("Kd_Transportasi_Tidak_Terjadwal"));
                ev.setKdTransportasiTerjadwal(rs.getString("Kd_Transportasi_Terjadwal"));
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
}
