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
             
        List<Event> listEvent = new ArrayList<Event>();
        
        //Lokasi yang ada pada referensi
        List<Lokasi> listLokasi = new ArrayList<Lokasi>();
        
        //Transport 
        List<ModaTransportasi> listTransport = new ArrayList<ModaTransportasi>();
        
        
        
        Lokasi lokasi1 = new Lokasi();

        lokasi1.setIdLokasi("KL00001");
        lokasi1.setNamaLokasi("Rumah");
        lokasi1.setAlamat("Jl. Maleber Cianjur");

        listLokasi.add(lokasi1);

        Lokasi lokasi2 = new Lokasi();

        lokasi2.setIdLokasi("KL00002");
        lokasi2.setNamaLokasi("Hotel Amarossa Bandung");
        lokasi2.setAlamat("Jl. Aceh No. 71");
        listLokasi.add(lokasi2);

        Lokasi Lokasi3 = new Lokasi();

        Lokasi3.setIdLokasi("KL00003");
        Lokasi3.setNamaLokasi("SMA Negeri 20 Bandung");
        Lokasi3.setAlamat("Jalan Citarum No.23, Citarum");
        listLokasi.add(Lokasi3);

        Lokasi Lokasi4 = new Lokasi();

        Lokasi4.setIdLokasi("KL00004");
        Lokasi4.setNamaLokasi("Rumah Makan Ampera");
        Lokasi4.setAlamat("Jl. PH.H. Mustofa, Neglasari, Cibeunying Kaler, Bandung, Jawa Barat 40124");
        listLokasi.add(Lokasi4);

        Lokasi Lokasi5 = new Lokasi();

        Lokasi5.setIdLokasi("KL00005");
        Lokasi5.setNamaLokasi("SMP Negeri 14 Bandung");
        Lokasi5.setAlamat("Jl.Lap Supratman, Cihapit");
        listLokasi.add(Lokasi5);

        Lokasi Lokasi6 = new Lokasi();

        Lokasi6.setIdLokasi("KL00006");
        Lokasi6.setNamaLokasi("R.M Sugih Parahyangan");
        Lokasi6.setAlamat("Jl. Ters. Jkt No.48, Babakan Surabaya, Kiaracondong, Kota Bandung, Jawa Barat 40291");
        listLokasi.add(Lokasi6);

        Lokasi Lokasi7 = new Lokasi();

        Lokasi7.setIdLokasi("KL00007");
        Lokasi7.setNamaLokasi("Dinas Pendidikan Kota Cianjur");
        Lokasi7.setAlamat("Jl. Perintis Kemerdekaan No. 3, Cilaku, Sirnagalih, Cilaku, Kabupaten Cianjur, Jawa Barat");
        listLokasi.add(Lokasi7);

        
        //Transport item pertama
        ModaTransportasi moda1 =new ModaTransportasi ();
        moda1.setIdTransport("KMT01");
        moda1.setNameTransport("Kereta Api");
        
        listTransport.add(moda1);
        
        //Transport item kedua
        ModaTransportasi moda2 =new ModaTransportasi ();
        moda2.setIdTransport("KMT02");
        moda2.setNameTransport("Pesawat");
        
        listTransport.add(moda2);
        
        //Transport item ketiga
        ModaTransportasi moda3 =new ModaTransportasi ();
        moda3.setIdTransport("KMT03");
        moda3.setNameTransport("MObil");
        
        listTransport.add(moda3);
        
        //Transport item keempat
        ModaTransportasi moda4 =new ModaTransportasi ();
        moda4.setIdTransport("KMT04");
        moda4.setNameTransport("Bus");
        
        listTransport.add(moda4);
        
        //Transport item kelima
        ModaTransportasi moda5 =new ModaTransportasi ();
        moda5.setIdTransport("KMT05");
        moda5.setNameTransport("Motor");
        
        listTransport.add(moda5);
        
        //Transport item keenam
        ModaTransportasi moda6 =new ModaTransportasi ();
        moda6.setIdTransport("KMT06");
        moda6.setNameTransport("Sepeda");
        
        listTransport.add(moda6);
        
        //Transport item ketuju
        ModaTransportasi moda7 =new ModaTransportasi ();
        moda7.setIdTransport("KMT07");
        moda7.setNameTransport("Berjalan Kaki");
        
        listTransport.add(moda7);
        
        /*
        Pengubahan format tanggal
        */
        String pattern = "dd/MM/yyyy hh:mm:ss";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        
        User kanto = new User();
        kanto.setNameUser("Kanto");
        
        
        
        Event event1 = new Event();
        event1.setNameEvent("Check In Hotel dan istirahat");
        event1.setDestination(listLokasi.get(1));
        event1.setTransport(listTransport.get(5)); //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime1 = format.parse("21/9/2017 22:45:00");
          Date endTime1 = format.parse("22/9/2017 05:45:00");
          
          event1.setStartTime(startTime1);
          event1.setEndTime(endTime1);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event1);
        
        
        Event event2 = new Event();
        event2.setNameEvent("Pengawasan dan Pelatihan");
        event2.setDestination(listLokasi.get(2));
        event2.setTransport(listTransport.get(5)); //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime2 = format.parse("22/9/2017 06:15:00");
          Date endTime2 = format.parse("22/9/2017 14:00:00");
          
          event2.setStartTime(startTime2);
          event2.setEndTime(endTime2);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event2);
        
        Event event3 = new Event();
        event3.setNameEvent("Evaluasi dan Pelaporan");
        event3.setDestination(listLokasi.get(3));
        event3.setTransport(listTransport.get(5)); //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime3 = format.parse("22/9/2017 18:00:00");
          Date endTime3 = format.parse("22/9/2017 20:45:00");
          
          event3.setStartTime(startTime3);
          event3.setEndTime(endTime3);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event3);
        
        
        Event event4 = new Event();
        event4.setNameEvent("Istirahat");
        event4.setDestination(listLokasi.get(1));
        event4.setTransport(listTransport.get(5)); //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime4 = format.parse("22/9/2017 21:10:00");
          Date endTime4 = format.parse("23/9/2017 05:10:00");
          
          event4.setStartTime(startTime4);
          event4.setEndTime(endTime4);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event4);
        
        Event event5 = new Event();
        event5.setNameEvent("Pengawasan dan Pelatihan");
        event5.setDestination(listLokasi.get(4));
        event5.setTransport(listTransport.get(5)); //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime5 = format.parse("23/9/2017 06:10:00");
          Date endTime5 = format.parse("23/9/2017 14:00:00");
          
          event5.setStartTime(startTime5);
          event5.setEndTime(endTime5);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event5);
        
        Event event6 = new Event();
        event6.setNameEvent("Laporan dan Evaluasi");
        event6.setDestination(listLokasi.get(5));
        event6.setTransport(listTransport.get(5)); //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime6 = format.parse("23/9/2017 18:00:00");
          Date endTime6 = format.parse("23/9/2017 20:45:00");
          
          event6.setStartTime(startTime6);
          event6.setEndTime(endTime6);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event6);
        
        Event event7 = new Event();
        event7.setNameEvent("Istirahat");
        event7.setDestination(listLokasi.get(1));
        event7.setTransport(listTransport.get(5)); //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime7 = format.parse("23/9/2017 21:10:00");
          Date endTime7 = format.parse("24/9/2017 03:45:00");
          
          event7.setStartTime(startTime7);
          event7.setEndTime(endTime7);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event7);
        
        Event event8 = new Event();
        event8.setNameEvent("Penyerahan laporan");
        event8.setDestination(listLokasi.get(6));
        event8.setTransport(listTransport.get(5)); //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime8 = format.parse("24/9/2017 06:15:00");
          Date endTime8 = format.parse("24/9/2017 08:30:00");
          
          event8.setStartTime(startTime8);
          event8.setEndTime(endTime8);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event8);
        
        
        Event event9 = new Event();
        event9.setNameEvent("Istirahat di rumah");
        event9.setDestination(listLokasi.get(0));
        event9.setTransport(listTransport.get(5)); //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime9 = format.parse("24/9/2017 08:45:00");
          Date endTime9 = format.parse("24/9/2017 23:59:00");
          
          event9.setStartTime(startTime9);
          event9.setEndTime(endTime9);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event9);
        
        kanto.setListEvent(listEvent);
        
        kanto.printListEvent();
    }    
}
