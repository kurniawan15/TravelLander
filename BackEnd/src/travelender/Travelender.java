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
        
        //Lokasi awal yang ada pada referensi
        List<Lokasi> listLokasi = new ArrayList<Lokasi>();
        
        //Transport 
        List<ModaTransportasi> listTransport = new ArrayList<ModaTransportasi>();
        
        //lookup
        List<Perjalanan> listLookup = new ArrayList<Perjalanan>();
        
        Perjalanan l = new Perjalanan();
                
        Lokasi lokasi1 = new Lokasi();

        lokasi1.setKdLokasi("KL00001");
        lokasi1.setNamaLokasi("Rumah");
        lokasi1.setAlamat("Jl. Maleber Cianjur");
        listLokasi.add(lokasi1);

        Lokasi lokasi2 = new Lokasi();

        lokasi2.setKdLokasi("KL00002");
        lokasi2.setNamaLokasi("Hotel Amarossa Bandung");
        lokasi2.setAlamat("Jl. Aceh No. 71");
        listLokasi.add(lokasi2);

        Lokasi lokasi3 = new Lokasi();

        lokasi3.setKdLokasi("KL00003");
        lokasi3.setNamaLokasi("SMA Negeri 20 Bandung");
        lokasi3.setAlamat("Jalan Citarum No.23, Citarum");
        listLokasi.add(lokasi3);

        Lokasi lokasi4 = new Lokasi();

        lokasi4.setKdLokasi("KL00004");
        lokasi4.setNamaLokasi("Rumah Makan Ampera");
        lokasi4.setAlamat("Jl. PH.H. Mustofa, Neglasari, Cibeunying Kaler, Bandung, Jawa Barat 40124");
        listLokasi.add(lokasi4);

        Lokasi lokasi5 = new Lokasi();

        lokasi5.setKdLokasi("KL00005");
        lokasi5.setNamaLokasi("SMP Negeri 14 Bandung");
        lokasi5.setAlamat("Jl.Lap Supratman, Cihapit");
        listLokasi.add(lokasi5);

        Lokasi lokasi6 = new Lokasi();

        lokasi6.setKdLokasi("KL00006");
        lokasi6.setNamaLokasi("R.M Sugih Parahyangan");
        lokasi6.setAlamat("Jl. Ters. Jkt No.48, Babakan Surabaya, Kiaracondong, Kota Bandung, Jawa Barat 40291");
        listLokasi.add(lokasi6);

        Lokasi lokasi7 = new Lokasi();

        lokasi7.setKdLokasi("KL00007");
        lokasi7.setNamaLokasi("Dinas Pendidikan Kota Cianjur");
        lokasi7.setAlamat("Jl. Perintis Kemerdekaan No. 3, Cilaku, Sirnagalih, Cilaku, Kabupaten Cianjur, Jawa Barat");
        listLokasi.add(lokasi7);

        
        //Transport item pertama
        ModaTransportasi moda1 =new ModaTransportasi ();
        moda1.setKdModa("KMT01");
        moda1.setTipeModa("Kereta Api");
        
        listTransport.add(moda1);
        
        //Transport item kedua
        ModaTransportasi moda2 =new ModaTransportasi ();
        moda2.setKdModa("KMT02");
        moda2.setTipeModa("Pesawat");
        
        listTransport.add(moda2);
        
        //Transport item ketiga
        ModaTransportasi moda3 =new ModaTransportasi ();
        moda3.setKdModa("KMT03");
        moda3.setTipeModa("Mobil");
        
        listTransport.add(moda3);
        
        //Transport item keempat
        ModaTransportasi moda4 =new ModaTransportasi ();
        moda4.setKdModa("KMT04");
        moda4.setTipeModa("Bus");
        
        listTransport.add(moda4);
        
        //Transport item kelima
        ModaTransportasi moda5 =new ModaTransportasi ();
        moda5.setKdModa("KMT05");
        moda5.setTipeModa("Motor");
        
        listTransport.add(moda5);
        
        //Transport item keenam
        ModaTransportasi moda6 =new ModaTransportasi ();
        moda6.setKdModa("KMT06");
        moda6.setTipeModa("Sepeda");
        
        listTransport.add(moda6);
        
        //Transport item ketuju
        ModaTransportasi moda7 =new ModaTransportasi ();
        moda7.setKdModa("KMT07");
        moda7.setTipeModa("Berjalan Kaki");
        
        listTransport.add(moda7);
        
        //LookupItem pertama
        Perjalanan lookupItem1 = new Perjalanan();
        
        lookupItem1.setIdPerjalanan("IDP0001");
        lookupItem1.setWaktuTempuh(63);
        lookupItem1.setJarakTempuh(99);
        lookupItem1.setKodeLokasiAwal(lokasi1);         //dari Rumah
        lookupItem1.setKodeLokasiAkhir(lokasi2);        //ke hotel
        lookupItem1.setKdModa(moda3);            //mobil
        
        listLookup.add(lookupItem1);
        
        listLookup.add(lookupItem1);
        //LookupItem kedua
        Perjalanan lookupItem2 = new Perjalanan();
        
        lookupItem2.setIdPerjalanan("IDP0002");
        lookupItem2.setWaktuTempuh(3);
        lookupItem2.setJarakTempuh(1);
        lookupItem2.setKodeLokasiAwal(lokasi2);         //dari hotel
        lookupItem2.setKodeLokasiAkhir(lokasi3);        //ke SMA 20 Bandung
        lookupItem2.setKdModa(moda3);            //mobil
        listLookup.add(lookupItem2);
        
        //LookupItem ketiga
        Perjalanan lookupItem3 = new Perjalanan();
        
        lookupItem3.setIdPerjalanan("IDP0003");
        lookupItem3.setWaktuTempuh(7);
        lookupItem3.setJarakTempuh(3);
        lookupItem3.setKodeLokasiAwal(lokasi3);         //dari SMA 20 Bandung
        lookupItem3.setKodeLokasiAkhir(lokasi4);        //ke Rumah Makan A
        lookupItem3.setKdModa(moda3);            //mobil
        listLookup.add(lookupItem3);
        
        //LookupItem keempat
        Perjalanan lookupItem4 = new Perjalanan();
        
        lookupItem4.setIdPerjalanan("IDP0004");
        lookupItem4.setWaktuTempuh(10);
        lookupItem4.setJarakTempuh(4);
        lookupItem4.setKodeLokasiAwal(lokasi4);         //dari Rumah Makan A
        lookupItem4.setKodeLokasiAkhir(lokasi5);        //ke SMP 14 Bandung
        lookupItem4.setKdModa(moda3);            //mobil
        listLookup.add(lookupItem4);
        
        //LookupItem kelima
        Perjalanan lookupItem5 = new Perjalanan();
        
        lookupItem5.setIdPerjalanan("IDP0005");
        lookupItem5.setWaktuTempuh(5);
        lookupItem5.setJarakTempuh(2);
        lookupItem5.setKodeLokasiAwal(lokasi2);         //dari Hotel
        lookupItem5.setKodeLokasiAkhir(lokasi5);        //ke SMA 14 Bandung
        lookupItem5.setKdModa(moda3);            //mobil
        listLookup.add(lookupItem5);
        
        //LookupItem keenam
        Perjalanan lookupItem6 = new Perjalanan();
        
        lookupItem6.setIdPerjalanan("IDP0006");
        lookupItem6.setWaktuTempuh(9);
        lookupItem6.setJarakTempuh(4);
        lookupItem6.setKodeLokasiAwal(lokasi5);         //dari SMP 14 Bandung
        lookupItem6.setKodeLokasiAkhir(lokasi6);        //ke Rumah makan Sugih
        lookupItem6.setKdModa(moda3);            //mobil
        listLookup.add(lookupItem6);
        
        //LookupItem ketuju
        Perjalanan lookupItem7 = new Perjalanan();
        
        lookupItem7.setIdPerjalanan("IDP0007");
        lookupItem7.setWaktuTempuh(10);
        lookupItem7.setJarakTempuh(4);
        lookupItem7.setKodeLokasiAwal(lokasi6);         //dari Rumah makan Sugih
        lookupItem7.setKodeLokasiAkhir(lokasi2);        //ke Hotel
        lookupItem7.setKdModa(moda3);            //mobil
        listLookup.add(lookupItem7);
        
        //LookupItem kedelapan
        Perjalanan lookupItem8 = new Perjalanan();
        
        lookupItem8.setIdPerjalanan("IDP0008");
        lookupItem8.setWaktuTempuh(95);
        lookupItem8.setJarakTempuh(68);
        lookupItem8.setKodeLokasiAwal(lokasi2);         //dari hotel
        lookupItem8.setKodeLokasiAkhir(lokasi7);        //ke Dinas
        lookupItem8.setKdModa(moda3);            //mobil
        listLookup.add(lookupItem8);
        
        //LookupItem kesembilan
        Perjalanan lookupItem9 = new Perjalanan();
        
        lookupItem9.setIdPerjalanan("IDP0009");
        lookupItem9.setWaktuTempuh(11);
        lookupItem9.setJarakTempuh(8);
        lookupItem9.setKodeLokasiAwal(lokasi7);         //dari Dinas
        lookupItem9.setKodeLokasiAkhir(lokasi1);        //ke Rumah
        lookupItem9.setKdModa(moda3);            //mobil
        listLookup.add(lookupItem9);
        
        //LookupItem kesepuluh
        Perjalanan lookupItem10 = new Perjalanan();
        
        lookupItem10.setIdPerjalanan("IDP0010");
        lookupItem10.setWaktuTempuh(50);
        lookupItem10.setJarakTempuh(99);
        lookupItem10.setKodeLokasiAwal(lokasi1);        //dari rumah
        lookupItem10.setKodeLokasiAkhir(lokasi2);       //ke hotel
        lookupItem10.setKdModa(moda1);           //KA
        listLookup.add(lookupItem10);
        
        //LookupItem kesebelas
        Perjalanan lookupItem11 = new Perjalanan();
        
        lookupItem11.setIdPerjalanan("IDP0011");
        lookupItem11.setWaktuTempuh(70);
        lookupItem11.setJarakTempuh(99);
        lookupItem11.setKodeLokasiAwal(lokasi1);        //dari rumah
        lookupItem11.setKodeLokasiAkhir(lokasi2);       //ke hotel
        lookupItem11.setKdModa(moda4);           //Bus
        listLookup.add(lookupItem11);
        
        //LookupItem keduabelas
        Perjalanan lookupItem12 = new Perjalanan();
        
        lookupItem12.setIdPerjalanan("IDP0012");
        lookupItem12.setWaktuTempuh(45);
        lookupItem12.setJarakTempuh(99);
        lookupItem12.setKodeLokasiAwal(lokasi1);        //dari rumah
        lookupItem12.setKodeLokasiAkhir(lokasi2);       //ke hotel
        lookupItem12.setKdModa(moda5);           //Motor
        listLookup.add(lookupItem12);
        
        //LookupItem ketigabelas
        Perjalanan lookupItem13 = new Perjalanan();
        
        lookupItem13.setIdPerjalanan("IDP0013");
        lookupItem13.setWaktuTempuh(75);
        lookupItem13.setJarakTempuh(99);
        lookupItem13.setKodeLokasiAwal(lokasi1);        //dari rumah
        lookupItem13.setKodeLokasiAkhir(lokasi2);       //ke hotel
        lookupItem13.setKdModa(moda6);           //Sepeda
        listLookup.add(lookupItem13);
    
        //LookupItem keempatbelas
        Perjalanan lookupItem14 = new Perjalanan();
        
        lookupItem14.setIdPerjalanan("IDP0014");
        lookupItem14.setWaktuTempuh(3);
        lookupItem14.setJarakTempuh(1);
        lookupItem14.setKodeLokasiAwal(lokasi2);         //dari hotel
        lookupItem14.setKodeLokasiAkhir(lokasi3);        //ke SMA 20 Bandung
        lookupItem14.setKdModa(moda4);            //Bus
        listLookup.add(lookupItem14);
        
        //LookupItem kelimabelas
        Perjalanan lookupItem15 = new Perjalanan();
        
        lookupItem15.setIdPerjalanan("IDP0015");
        lookupItem15.setWaktuTempuh(2);
        lookupItem15.setJarakTempuh(1);
        lookupItem15.setKodeLokasiAwal(lokasi2);         //dari hotel
        lookupItem15.setKodeLokasiAkhir(lokasi3);        //ke SMA 20 Bandung
        lookupItem15.setKdModa(moda5);            //Motor
        listLookup.add(lookupItem15);
        
        //LookupItem keenambelas
        Perjalanan lookupItem16 = new Perjalanan();
        
        lookupItem16.setIdPerjalanan("IDP0016");
        lookupItem16.setWaktuTempuh(5);
        lookupItem16.setJarakTempuh(1);
        lookupItem16.setKodeLokasiAwal(lokasi2);         //dari hotel
        lookupItem16.setKodeLokasiAkhir(lokasi3);        //ke SMA 20 Bandung
        lookupItem16.setKdModa(moda6);            //Sepeda
        listLookup.add(lookupItem16);
        
        //LookupItem ketujuhbelas
        Perjalanan lookupItem17 = new Perjalanan();
        
        lookupItem17.setIdPerjalanan("IDP0017");
        lookupItem17.setWaktuTempuh(10);
        lookupItem17.setJarakTempuh(1);
        lookupItem17.setKodeLokasiAwal(lokasi2);         //dari hotel
        lookupItem17.setKodeLokasiAkhir(lokasi3);        //ke SMA 20 Bandung
        lookupItem17.setKdModa(moda7);            //Jalan Kaki
        listLookup.add(lookupItem17);
        
        //LookupItem kedelapanbelas
        Perjalanan lookupItem18 = new Perjalanan();
        
        lookupItem18.setIdPerjalanan("IDP0018");
        lookupItem18.setWaktuTempuh(10);
        lookupItem18.setJarakTempuh(3);
        lookupItem18.setKodeLokasiAwal(lokasi3);         //dari SMA 20 Bandung
        lookupItem18.setKodeLokasiAkhir(lokasi4);        //ke Rumah Makan A
        lookupItem18.setKdModa(moda4);            //bus
        listLookup.add(lookupItem18);
        
        //LookupItem kesembilanbelas
        Perjalanan lookupItem19 = new Perjalanan();
        
        lookupItem19.setIdPerjalanan("IDP0018");
        lookupItem19.setWaktuTempuh(5);
        lookupItem19.setJarakTempuh(3);
        lookupItem19.setKodeLokasiAwal(lokasi3);         //dari SMA 20 Bandung
        lookupItem19.setKodeLokasiAkhir(lokasi4);        //ke Rumah Makan A
        lookupItem19.setKdModa(moda5);            //motor
        listLookup.add(lookupItem19);
        
        //LookupItem keduapuluh
        Perjalanan lookupItem20 = new Perjalanan();
        
        lookupItem20.setIdPerjalanan("IDP0020");
        lookupItem20.setWaktuTempuh(12);
        lookupItem20.setJarakTempuh(3);
        lookupItem20.setKodeLokasiAwal(lokasi3);         //dari SMA 20 Bandung
        lookupItem20.setKodeLokasiAkhir(lokasi4);        //ke Rumah Makan A
        lookupItem20.setKdModa(moda6);            //sepeda
        listLookup.add(lookupItem20);
        
        //LookupItem keduapuluhsatu
        Perjalanan lookupItem21 = new Perjalanan();
        
        lookupItem21.setIdPerjalanan("IDP0021");
        lookupItem21.setWaktuTempuh(20);
        lookupItem21.setJarakTempuh(3);
        lookupItem21.setKodeLokasiAwal(lokasi3);         //dari SMA 20 Bandung
        lookupItem21.setKodeLokasiAkhir(lokasi4);        //ke Rumah Makan A
        lookupItem21.setKdModa(moda7);            //Berjalan kaki
        listLookup.add(lookupItem21);
        
        /*
        Pengubahan format tanggal
        */
        String pattern = "dd/MM/yyyy hh:mm";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        
        User kanto = new User();
        kanto.setNameUser("Kanto");
        
        
        
        Event event1 = new Event();
        event1.setNamaAgenda("Check In Hotel dan istirahat");
        event1.setEmbarkation(listLokasi.get(0));        //rumah
        event1.setDestination(listLokasi.get(1));        //hotel
        //event1.setTransport(listTransport.get(2));     //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime1 = format.parse("21/9/2017 22:45:00");
          Date endTime1 = format.parse("22/9/2017 05:45:00");
          
          event1.setWaktuMulai(startTime1);
          event1.setWaktuSelesai(endTime1);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event1);
        
        Event event2 = new Event();
        event2.setNamaAgenda("Pengawasan dan Pelatihan");
        event2.setEmbarkation(event1.getDestination());
        event2.setDestination(listLokasi.get(2));        //SMA 20 bandung
        event2.setTransport(listTransport.get(2));       //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime2 = format.parse("22/9/2017 06:15:00");
          Date endTime2 = format.parse("22/9/2017 14:00:00");
          
          event2.setWaktuMulai(startTime2);
          event2.setWaktuSelesai(endTime2);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event2);
        
        Event event3 = new Event();
        event3.setNamaAgenda("Evaluasi dan Pelaporan");
        event3.setEmbarkation(event2.getDestination());
        event3.setDestination(listLokasi.get(3));       //Rumah makan  
        event3.setTransport(listTransport.get(2));      //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime3 = format.parse("22/9/2017 18:00:00");
          Date endTime3 = format.parse("22/9/2017 20:45:00");
          
          event3.setWaktuMulai(startTime3);
          event3.setWaktuSelesai(endTime3);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event3);
        
        Event event4 = new Event();
        event4.setNamaAgenda("Istirahat");
        event4.setEmbarkation(event3.getDestination());
        event4.setDestination(listLokasi.get(1));       //Hotel
        event4.setTransport(listTransport.get(2));      //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime4 = format.parse("22/9/2017 21:10:00");
          Date endTime4 = format.parse("23/9/2017 05:10:00");
          
          event4.setWaktuMulai(startTime4);
          event4.setWaktuSelesai(endTime4);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event4);
        
        Event event5 = new Event();
        event5.setNamaAgenda("Pengawasan dan Pelatihan");
        event5.setEmbarkation(event4.getDestination());
        event5.setDestination(listLokasi.get(4));
        event5.setTransport(listTransport.get(2)); //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime5 = format.parse("23/9/2017 06:10:00");
          Date endTime5 = format.parse("23/9/2017 14:00:00");
          
          event5.setWaktuMulai(startTime5);
          event5.setWaktuSelesai(endTime5);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event5);
        
        Event event6 = new Event();
        event6.setNamaAgenda("Laporan dan Evaluasi");
        event6.setEmbarkation(event5.getDestination());
        event6.setDestination(listLokasi.get(5));
        event6.setTransport(listTransport.get(2)); //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime6 = format.parse("23/9/2017 18:00:00");
          Date endTime6 = format.parse("23/9/2017 20:45:00");
          
          event6.setWaktuMulai(startTime6);
          event6.setWaktuSelesai(endTime6);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event6);
        
        Event event7 = new Event();
        event7.setNamaAgenda("Istirahat");
        event7.setEmbarkation(event6.getDestination());
        event7.setDestination(listLokasi.get(1));
        event7.setTransport(listTransport.get(2)); //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime7 = format.parse("23/9/2017 21:10:00");
          Date endTime7 = format.parse("24/9/2017 03:45:00");
          
          event7.setWaktuMulai(startTime7);
          event7.setWaktuSelesai(endTime7);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event7);
        
        Event event8 = new Event();
        event8.setNamaAgenda("Penyerahan laporan");
        event8.setEmbarkation(event7.getDestination());
        event8.setDestination(listLokasi.get(6));
        event8.setTransport(listTransport.get(2)); //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime8 = format.parse("24/9/2017 06:15:00");
          Date endTime8 = format.parse("24/9/2017 08:30:00");
          
          event8.setWaktuMulai(startTime8);
          event8.setWaktuSelesai(endTime8);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event8);
        
        
        Event event9 = new Event();
        event9.setNamaAgenda("Istirahat di rumah");
        event9.setEmbarkation(event8.getDestination());
        event9.setDestination(listLokasi.get(0));
        event9.setTransport(listTransport.get(2)); //disesuaikan dengan combobox pada desain web
        
        try {
          Date startTime9 = format.parse("24/9/2017 08:45:00");
          Date endTime9 = format.parse("24/9/2017 23:59:00");
          
          event9.setWaktuMulai(startTime9);
          event9.setWaktuSelesai(endTime9);
          
        } catch (ParseException e) {
          e.printStackTrace();
        }
        
        listEvent.add(event9);
        
        kanto.setListEvent(listEvent);
        
        kanto.printListEvent(listLookup);
        
        
    }    
}
