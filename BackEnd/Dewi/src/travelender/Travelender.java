/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;



/**
 *
 * @author Dewi Roaza
 *         Mohammad Ridwan H D P
 */

public class Travelender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
        List<Agenda> listAgenda = new ArrayList<Agenda>();
        
        //Lokasi yang ada pada referensi
        List<Lokasi> listLokasi = new ArrayList<Lokasi>();
        
        Agenda agenda1 = new Agenda();
        
        //Lokasi Item yang pertama
        Lokasi lokasi1 = new Lokasi();
        
        lokasi1.setNamaLokasi("Disdik");
        lokasi1.setAlamat("Jl. Diponegoro no.27 ");

        listLokasi.add(lokasi1);
        
        //Lokasi item yang kedua
        Lokasi lokasi2 = new Lokasi();
        
        lokasi2.setNamaLokasi("Kantor DPRD Kota Bandung");
        lokasi2.setAlamat("Jl. Jakarta no.193");

        listLokasi.add(lokasi2);
        
        
        User kanto = new User();
        kanto.setNameUser("Kanto");
        
        agenda1.setNameAgenda("Rapat Kurikulum");
        agenda1.setDestination(listLokasi.get(0));
        
        /*
        Pengubahan format tanggal
        */
        String pattern = "dd/MM/yyyy hh:mm:ss";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        try {
          Date date1 = format.parse("21/9/2017 10:00:00");
          Date date2 = format.parse("24/9/2017 10:00:00");
          
          agenda1.setStartTime(date1);
          agenda1.setEndTime(date2);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
            
        // formatting
        
            
//        agenda1.setTransport("Mobil");
        
        listAgenda.add(agenda1);
        
//        Agenda agenda2 = new Agenda();
//        
//        agenda2.setNameAgenda("Akreditasi SMA 1");
//        agenda2.setNameLocation("SMA 1");
//        agenda2.setStartTime(Time.valueOf("13:00:00"));
//        agenda2.setEndTime(Time.valueOf("16:00:00"));
//        agenda2.setTransport("Kereta");
//        
//        listAgenda.add(agenda2);
//        
//        Agenda agenda3 = new Agenda();
//        
//        agenda3.setNameAgenda("Ramah Tamah bersama Walikota");
//        agenda3.setNameLocation("Pemkot");
//        agenda3.setStartTime(Time.valueOf("18:30:00"));
//        agenda3.setEndTime(Time.valueOf("20:00:00"));
//        agenda3.setTransport("Mobil");
//        
//        listAgenda.add(agenda3);
//        
        kanto.setListAgenda(listAgenda);
        
        kanto.printListAgenda();
    }    
}
