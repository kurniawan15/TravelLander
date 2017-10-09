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
        List<Lookup> listLookup = new ArrayList<Lookup>();
        
        Lookup l = new Lookup();
                
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

        Lokasi lokasi3 = new Lokasi();

        lokasi3.setIdLokasi("KL00003");
        lokasi3.setNamaLokasi("SMA Negeri 20 Bandung");
        lokasi3.setAlamat("Jalan Citarum No.23, Citarum");
        listLokasi.add(lokasi3);

        Lokasi lokasi4 = new Lokasi();

        lokasi4.setIdLokasi("KL00004");
        lokasi4.setNamaLokasi("Rumah Makan Ampera");
        lokasi4.setAlamat("Jl. PH.H. Mustofa, Neglasari, Cibeunying Kaler, Bandung, Jawa Barat 40124");
        listLokasi.add(lokasi4);

        Lokasi lokasi5 = new Lokasi();

        lokasi5.setIdLokasi("KL00005");
        lokasi5.setNamaLokasi("SMP Negeri 14 Bandung");
        lokasi5.setAlamat("Jl.Lap Supratman, Cihapit");
        listLokasi.add(lokasi5);

        Lokasi lokasi6 = new Lokasi();

        lokasi6.setIdLokasi("KL00006");
        lokasi6.setNamaLokasi("R.M Sugih Parahyangan");
        lokasi6.setAlamat("Jl. Ters. Jkt No.48, Babakan Surabaya, Kiaracondong, Kota Bandung, Jawa Barat 40291");
        listLokasi.add(lokasi6);

        Lokasi lokasi7 = new Lokasi();

        lokasi7.setIdLokasi("KL00007");
        lokasi7.setNamaLokasi("Dinas Pendidikan Kota Cianjur");
        lokasi7.setAlamat("Jl. Perintis Kemerdekaan No. 3, Cilaku, Sirnagalih, Cilaku, Kabupaten Cianjur, Jawa Barat");
        listLokasi.add(lokasi7);
        
        Lokasi lokasi8 = new Lokasi();

        lokasi8.setIdLokasi("KL00008");
        lokasi8.setNamaLokasi("Bandara Husein Sastranegara");
        lokasi8.setAlamat("Jl. Pajajaran No. 156, Husen Sastranegara, Cicendo");
        listLokasi.add(lokasi8);
        
        Lokasi lokasi9 = new Lokasi();

        lokasi9.setIdLokasi("KL00009");
        lokasi9.setNamaLokasi("Red Planet Hotel Surabaya");
        lokasi9.setAlamat("Jl. Arjuna No. 64 - 66, Surabaya, Jawa Timur 60251");
        listLokasi.add(lokasi9);
        
        Lokasi lokasi10 = new Lokasi();

        lokasi10.setIdLokasi("KL000010");
        lokasi10.setNamaLokasi("Bandara Internasional Juanda Surabaya");
        lokasi10.setAlamat("Jl. Ir. H. Juanda, Betro, Sedati, Kabupaten Sidoarjo");
        listLokasi.add(lokasi10);
        
        Lokasi lokasi11 = new Lokasi();

        lokasi11.setIdLokasi("KL000011");
        lokasi11.setNamaLokasi("SMAN 15 Surabaya");
        lokasi11.setAlamat("Jl. Dukuh Menanggal Sel. No.103, Dukuh Menanggal");
        listLokasi.add(lokasi11);
        
        Lokasi lokasi12 = new Lokasi();

        lokasi12.setIdLokasi("KL000012");
        lokasi12.setNamaLokasi("Bebek Handayani Surabaya");
        lokasi12.setAlamat("Jl. Parang Kusumo No.2-I, Kemayoran, Krembangan");
        listLokasi.add(lokasi12);
        
        Lokasi lokasi13 = new Lokasi();

        lokasi13.setIdLokasi("KL000013");
        lokasi13.setNamaLokasi("Stasiun Surabaya Gubeng");
        lokasi13.setAlamat("Jl. Stasiun Gubeng, Pacar Keling, Tambaksari");
        listLokasi.add(lokasi13);
        
        Lokasi lokasi14 = new Lokasi();

        lokasi14.setIdLokasi("KL000014");
        lokasi14.setNamaLokasi("Mesjid Cheng Ho Surabaya");
        lokasi14.setAlamat("Jl. Gading No.2, Ketabang, Genteng, Kota SBY,");
        listLokasi.add(lokasi14);
        
        Lokasi lokasi15 = new Lokasi();

        lokasi15.setIdLokasi("KL000015");
        lokasi15.setNamaLokasi("Stasiun Kota Malang");
        lokasi15.setAlamat("Jalan Trunojoyo No.10, Klojen, Kiduldalem");
        listLokasi.add(lokasi15);
        
        Lokasi lokasi16 = new Lokasi();

        lokasi16.setIdLokasi("KL000016");
        lokasi16.setNamaLokasi("Hotel Gajahmada Graha");
        lokasi16.setAlamat("Jalan Doktor Cipto No.17, Rampal Celaket,");
        listLokasi.add(lokasi16);
        
        Lokasi lokasi17 = new Lokasi();

        lokasi17.setIdLokasi("KL000017");
        lokasi17.setNamaLokasi("Bakso Bakar Pak Man");
        lokasi17.setAlamat("Jl. Diponegoro No.19, Klojen, Kota Malang");
        listLokasi.add(lokasi17);
        
        Lokasi lokasi18 = new Lokasi();

        lokasi18.setIdLokasi("KL000018");
        lokasi18.setNamaLokasi("SMPN 12 Malang");
        lokasi18.setAlamat("Bandungrejosari, Sukun, Kota Malang, Jawa Timur 65");
        listLokasi.add(lokasi18);
        
        Lokasi lokasi19 = new Lokasi();

        lokasi19.setIdLokasi("KL000019");
        lokasi19.setNamaLokasi("Taman Kunang Kunang");
        lokasi19.setAlamat("Jl. Jakarta, Oro-oro Dowo, Klojen, Kota Malang");
        listLokasi.add(lokasi19);
        
        Lokasi lokasi20 = new Lokasi();

        lokasi20.setIdLokasi("KL000020");
        lokasi20.setNamaLokasi("Bandar Udara Internasional Abdulrachman Saleh");
        lokasi20.setAlamat("Jl. Komodor Udara Abdul Rahman Saleh, Bunut Wetan");
        listLokasi.add(lokasi20);

        
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
        moda3.setNameTransport("Mobil");
        
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
        
        //LookupItem pertama
        Lookup lookupItem1 = new Lookup();
        
        lookupItem1.setIdLookup("IDP0001");
        lookupItem1.setWaktuTempuh(63);
        lookupItem1.setJarakTempuh(99);
        lookupItem1.setLokasiAwal(lokasi1);         //dari Rumah
        lookupItem1.setLokasiAkhir(lokasi2);        //ke hotel
        lookupItem1.setTransport(moda3);            //mobil
        
        listLookup.add(lookupItem1);
        
        listLookup.add(lookupItem1);
        //LookupItem kedua
        Lookup lookupItem2 = new Lookup();
        
        lookupItem2.setIdLookup("IDP0002");
        lookupItem2.setWaktuTempuh(3);
        lookupItem2.setJarakTempuh(1);
        lookupItem2.setLokasiAwal(lokasi2);         //dari hotel
        lookupItem2.setLokasiAkhir(lokasi3);        //ke SMA 20 Bandung
        lookupItem2.setTransport(moda3);            //mobil
        listLookup.add(lookupItem2);
        
        //LookupItem ketiga
        Lookup lookupItem3 = new Lookup();
        
        lookupItem3.setIdLookup("IDP0003");
        lookupItem3.setWaktuTempuh(7);
        lookupItem3.setJarakTempuh(3);
        lookupItem3.setLokasiAwal(lokasi3);         //dari SMA 20 Bandung
        lookupItem3.setLokasiAkhir(lokasi4);        //ke Rumah Makan A
        lookupItem3.setTransport(moda3);            //mobil
        listLookup.add(lookupItem3);
        
        //LookupItem keempat
        Lookup lookupItem4 = new Lookup();
        
        lookupItem4.setIdLookup("IDP0004");
        lookupItem4.setWaktuTempuh(10);
        lookupItem4.setJarakTempuh(4);
        lookupItem4.setLokasiAwal(lokasi4);         //dari Rumah Makan A
        lookupItem4.setLokasiAkhir(lokasi5);        //ke SMP 14 Bandung
        lookupItem4.setTransport(moda3);            //mobil
        listLookup.add(lookupItem4);
        
        //LookupItem kelima
        Lookup lookupItem5 = new Lookup();
        
        lookupItem5.setIdLookup("IDP0005");
        lookupItem5.setWaktuTempuh(5);
        lookupItem5.setJarakTempuh(2);
        lookupItem5.setLokasiAwal(lokasi2);         //dari Hotel
        lookupItem5.setLokasiAkhir(lokasi5);        //ke SMA 14 Bandung
        lookupItem5.setTransport(moda3);            //mobil
        listLookup.add(lookupItem5);
        
        //LookupItem keenam
        Lookup lookupItem6 = new Lookup();
        
        lookupItem6.setIdLookup("IDP0006");
        lookupItem6.setWaktuTempuh(9);
        lookupItem6.setJarakTempuh(4);
        lookupItem6.setLokasiAwal(lokasi5);         //dari SMP 14 Bandung
        lookupItem6.setLokasiAkhir(lokasi6);        //ke Rumah makan Sugih
        lookupItem6.setTransport(moda3);            //mobil
        listLookup.add(lookupItem6);
        
        //LookupItem ketuju
        Lookup lookupItem7 = new Lookup();
        
        lookupItem7.setIdLookup("IDP0007");
        lookupItem7.setWaktuTempuh(10);
        lookupItem7.setJarakTempuh(4);
        lookupItem7.setLokasiAwal(lokasi6);         //dari Rumah makan Sugih
        lookupItem7.setLokasiAkhir(lokasi2);        //ke Hotel
        lookupItem7.setTransport(moda3);            //mobil
        listLookup.add(lookupItem7);
        
        //LookupItem kedelapan
        Lookup lookupItem8 = new Lookup();
        
        lookupItem8.setIdLookup("IDP0008");
        lookupItem8.setWaktuTempuh(95);
        lookupItem8.setJarakTempuh(68);
        lookupItem8.setLokasiAwal(lokasi2);         //dari hotel
        lookupItem8.setLokasiAkhir(lokasi7);        //ke Dinas
        lookupItem8.setTransport(moda3);            //mobil
        listLookup.add(lookupItem8);
        
        //LookupItem kesembilan
        Lookup lookupItem9 = new Lookup();
        
        lookupItem9.setIdLookup("IDP0009");
        lookupItem9.setWaktuTempuh(11);
        lookupItem9.setJarakTempuh(8);
        lookupItem9.setLokasiAwal(lokasi7);         //dari Dinas
        lookupItem9.setLokasiAkhir(lokasi1);        //ke Rumah
        lookupItem9.setTransport(moda3);            //mobil
        listLookup.add(lookupItem9);
        
        //LookupItem kesepuluh
        Lookup lookupItem10 = new Lookup();
        
        lookupItem10.setIdLookup("IDP0010");
        lookupItem10.setWaktuTempuh(50);
        lookupItem10.setJarakTempuh(99);
        lookupItem10.setLokasiAwal(lokasi1);        //dari rumah
        lookupItem10.setLokasiAkhir(lokasi2);       //ke hotel
        lookupItem10.setTransport(moda1);           //KA
        listLookup.add(lookupItem10);
        
        //LookupItem kesebelas
        Lookup lookupItem11 = new Lookup();
        
        lookupItem11.setIdLookup("IDP0011");
        lookupItem11.setWaktuTempuh(70);
        lookupItem11.setJarakTempuh(99);
        lookupItem11.setLokasiAwal(lokasi1);        //dari rumah
        lookupItem11.setLokasiAkhir(lokasi2);       //ke hotel
        lookupItem11.setTransport(moda4);           //Bus
        listLookup.add(lookupItem11);
        
        //LookupItem keduabelas
        Lookup lookupItem12 = new Lookup();
        
        lookupItem12.setIdLookup("IDP0012");
        lookupItem12.setWaktuTempuh(45);
        lookupItem12.setJarakTempuh(99);
        lookupItem12.setLokasiAwal(lokasi1);        //dari rumah
        lookupItem12.setLokasiAkhir(lokasi2);       //ke hotel
        lookupItem12.setTransport(moda5);           //Motor
        listLookup.add(lookupItem12);
        
        //LookupItem ketigabelas
        Lookup lookupItem13 = new Lookup();
        
        lookupItem13.setIdLookup("IDP0013");
        lookupItem13.setWaktuTempuh(75);
        lookupItem13.setJarakTempuh(99);
        lookupItem13.setLokasiAwal(lokasi1);        //dari rumah
        lookupItem13.setLokasiAkhir(lokasi2);       //ke hotel
        lookupItem13.setTransport(moda6);           //Sepeda
        listLookup.add(lookupItem13);
    
        //LookupItem keempatbelas
        Lookup lookupItem14 = new Lookup();
        
        lookupItem14.setIdLookup("IDP0014");
        lookupItem14.setWaktuTempuh(3);
        lookupItem14.setJarakTempuh(1);
        lookupItem14.setLokasiAwal(lokasi2);         //dari hotel
        lookupItem14.setLokasiAkhir(lokasi3);        //ke SMA 20 Bandung
        lookupItem14.setTransport(moda4);            //Bus
        listLookup.add(lookupItem14);
        
        //LookupItem kelimabelas
        Lookup lookupItem15 = new Lookup();
        
        lookupItem15.setIdLookup("IDP0015");
        lookupItem15.setWaktuTempuh(2);
        lookupItem15.setJarakTempuh(1);
        lookupItem15.setLokasiAwal(lokasi2);         //dari hotel
        lookupItem15.setLokasiAkhir(lokasi3);        //ke SMA 20 Bandung
        lookupItem15.setTransport(moda5);            //Motor
        listLookup.add(lookupItem15);
        
        //LookupItem keenambelas
        Lookup lookupItem16 = new Lookup();
        
        lookupItem16.setIdLookup("IDP0016");
        lookupItem16.setWaktuTempuh(5);
        lookupItem16.setJarakTempuh(1);
        lookupItem16.setLokasiAwal(lokasi2);         //dari hotel
        lookupItem16.setLokasiAkhir(lokasi3);        //ke SMA 20 Bandung
        lookupItem16.setTransport(moda6);            //Sepeda
        listLookup.add(lookupItem16);
        
        //LookupItem ketujuhbelas
        Lookup lookupItem17 = new Lookup();
        
        lookupItem17.setIdLookup("IDP0017");
        lookupItem17.setWaktuTempuh(10);
        lookupItem17.setJarakTempuh(1);
        lookupItem17.setLokasiAwal(lokasi2);         //dari hotel
        lookupItem17.setLokasiAkhir(lokasi3);        //ke SMA 20 Bandung
        lookupItem17.setTransport(moda7);            //Jalan Kaki
        listLookup.add(lookupItem17);
        
        //LookupItem kedelapanbelas
        Lookup lookupItem18 = new Lookup();
        
        lookupItem18.setIdLookup("IDP0018");
        lookupItem18.setWaktuTempuh(10);
        lookupItem18.setJarakTempuh(3);
        lookupItem18.setLokasiAwal(lokasi3);         //dari SMA 20 Bandung
        lookupItem18.setLokasiAkhir(lokasi4);        //ke Rumah Makan A
        lookupItem18.setTransport(moda4);            //bus
        listLookup.add(lookupItem18);
        
        //LookupItem kesembilanbelas
        Lookup lookupItem19 = new Lookup();
        
        lookupItem19.setIdLookup("IDP0018");
        lookupItem19.setWaktuTempuh(5);
        lookupItem19.setJarakTempuh(3);
        lookupItem19.setLokasiAwal(lokasi3);         //dari SMA 20 Bandung
        lookupItem19.setLokasiAkhir(lokasi4);        //ke Rumah Makan A
        lookupItem19.setTransport(moda5);            //motor
        listLookup.add(lookupItem19);
        
        //LookupItem keduapuluh
        Lookup lookupItem20 = new Lookup();
        
        lookupItem20.setIdLookup("IDP0020");
        lookupItem20.setWaktuTempuh(12);
        lookupItem20.setJarakTempuh(3);
        lookupItem20.setLokasiAwal(lokasi3);         //dari SMA 20 Bandung
        lookupItem20.setLokasiAkhir(lokasi4);        //ke Rumah Makan A
        lookupItem20.setTransport(moda6);            //sepeda
        listLookup.add(lookupItem20);
        
        //LookupItem keduapuluhsatu
        Lookup lookupItem21 = new Lookup();
        
        lookupItem21.setIdLookup("IDP0021");
        lookupItem21.setWaktuTempuh(20);
        lookupItem21.setJarakTempuh(3);
        lookupItem21.setLokasiAwal(lokasi3);         //dari SMA 20 Bandung
        lookupItem21.setLokasiAkhir(lokasi4);        //ke Rumah Makan A
        lookupItem21.setTransport(moda7);            //Berjalan kaki
        listLookup.add(lookupItem21);
        
        Lookup lookupItem22 = new Lookup();
        
        lookupItem22.setIdLookup("IDP0022");
        lookupItem22.setWaktuTempuh(133);
        lookupItem22.setJarakTempuh(63);
        lookupItem22.setLokasiAwal(lokasi1);         //dari rumah
        lookupItem22.setLokasiAkhir(lokasi8);        //ke bandara husain
        lookupItem22.setTransport(moda3);            //mobil
        listLookup.add(lookupItem22);
        
        Lookup lookupItem23 = new Lookup();
        
        lookupItem23.setIdLookup("IDP0023");
        lookupItem23.setWaktuTempuh(90);
        lookupItem23.setJarakTempuh(573);
        lookupItem23.setLokasiAwal(lokasi8);         //dari bandara husain
        lookupItem23.setLokasiAkhir(lokasi10);       //ke bandara juanda
        lookupItem23.setTransport(moda2);            //pesawat
        listLookup.add(lookupItem23);
        
        Lookup lookupItem24 = new Lookup();
        
        lookupItem24.setIdLookup("IDP0024");
        lookupItem24.setWaktuTempuh(40);
        lookupItem24.setJarakTempuh(19);
        lookupItem24.setLokasiAwal(lokasi10);        //dari bandara juanda
        lookupItem24.setLokasiAkhir(lokasi9);        //ke red planet
        lookupItem24.setTransport(moda3);            //mobil
        listLookup.add(lookupItem24);
        
        Lookup lookupItem25 = new Lookup();
        
        lookupItem25.setIdLookup("IDP0025");
        lookupItem25.setWaktuTempuh(30);
        lookupItem25.setJarakTempuh(12);
        lookupItem25.setLokasiAwal(lokasi9);         //dari red planet
        lookupItem25.setLokasiAkhir(lokasi11);       //ke SMAN 15 SBY
        lookupItem25.setTransport(moda2);            //mobil
        listLookup.add(lookupItem25);
        
        Lookup lookupItem26 = new Lookup();
        
        lookupItem26.setIdLookup("IDP0026");
        lookupItem26.setWaktuTempuh(34);
        lookupItem26.setJarakTempuh(14);
        lookupItem26.setLokasiAwal(lokasi11);         //dari SMAN 15 SBY
        lookupItem26.setLokasiAkhir(lokasi12);       //ke bebek handayani
        lookupItem26.setTransport(moda5);            //motor
        listLookup.add(lookupItem26);
        
        Lookup lookupItem27 = new Lookup();
        
        lookupItem27.setIdLookup("IDP0027");
        lookupItem27.setWaktuTempuh(25);
        lookupItem27.setJarakTempuh(4);
        lookupItem27.setLokasiAwal(lokasi12);         //dari bebek handayani
        lookupItem27.setLokasiAkhir(lokasi14);       //ke masjid cheng ho
        lookupItem27.setTransport(moda5);            //mobil
        listLookup.add(lookupItem27);
        
        Lookup lookupItem28 = new Lookup();
        
        lookupItem28.setIdLookup("IDP0028");
        lookupItem28.setWaktuTempuh(15);
        lookupItem28.setJarakTempuh(2);
        lookupItem28.setLokasiAwal(lokasi14);         //dari masjid cheng ho
        lookupItem28.setLokasiAkhir(lokasi13);       //ke stasiun gubek
        lookupItem28.setTransport(moda2);            //mobil
        listLookup.add(lookupItem28);
        
        Lookup lookupItem29 = new Lookup();
        
        lookupItem29.setIdLookup("IDP0029");
        lookupItem29.setWaktuTempuh(168);
        lookupItem29.setJarakTempuh(90);
        lookupItem29.setLokasiAwal(lokasi13);         //dari stasiun gubek
        lookupItem29.setLokasiAkhir(lokasi15);       //ke stasiun kota malang
        lookupItem29.setTransport(moda1);            //mobil
        listLookup.add(lookupItem29);
        
        Lookup lookupItem30 = new Lookup();
        
        lookupItem30.setIdLookup("IDP0030");
        lookupItem30.setWaktuTempuh(3);
        lookupItem30.setJarakTempuh(1);
        lookupItem30.setLokasiAwal(lokasi15);         //dari stasiun kota malang
        lookupItem30.setLokasiAkhir(lokasi16);       //ke hotel gajah mada
        lookupItem30.setTransport(moda3);            //mobil
        listLookup.add(lookupItem30);
        
        Lookup lookupItem31 = new Lookup();
        
        lookupItem31.setIdLookup("IDP0031");
        lookupItem31.setWaktuTempuh(18);
        lookupItem31.setJarakTempuh(5);
        lookupItem31.setLokasiAwal(lokasi16);         //dari hotel gajah mada
        lookupItem31.setLokasiAkhir(lokasi18);       //ke SMPN 12 malang
        lookupItem31.setTransport(moda3);            //mobil
        listLookup.add(lookupItem31);
        
        Lookup lookupItem32 = new Lookup();
        
        lookupItem32.setIdLookup("IDP0032");
        lookupItem32.setWaktuTempuh(18);
        lookupItem32.setJarakTempuh(5);
        lookupItem32.setLokasiAwal(lokasi18);         //dari SMPN 12 malang
        lookupItem32.setLokasiAkhir(lokasi17);       //ke Bakso bakar
        lookupItem32.setTransport(moda3);            //mobil
        listLookup.add(lookupItem32);
        
        Lookup lookupItem33 = new Lookup();
        
        lookupItem33.setIdLookup("IDP0033");
        lookupItem33.setWaktuTempuh(9);
        lookupItem33.setJarakTempuh(3);
        lookupItem33.setLokasiAwal(lokasi17);         //dari Bakso bakar
        lookupItem33.setLokasiAkhir(lokasi19);       //ke taman kunang kunang
        lookupItem33.setTransport(moda5);            //mobil
        listLookup.add(lookupItem33);
        
        Lookup lookupItem34 = new Lookup();
        
        lookupItem34.setIdLookup("IDP0034");
        lookupItem34.setWaktuTempuh(10);
        lookupItem34.setJarakTempuh(4);
        lookupItem34.setLokasiAwal(lokasi19);         //dari taman kunang kunang
        lookupItem34.setLokasiAkhir(lokasi16);       //ke hotel gajah mada
        lookupItem34.setTransport(moda5);            //mobil
        listLookup.add(lookupItem34);
        
        Lookup lookupItem35 = new Lookup();
        
        lookupItem35.setIdLookup("IDP0035");
        lookupItem35.setWaktuTempuh(25);
        lookupItem35.setJarakTempuh(12);
        lookupItem35.setLokasiAwal(lokasi16);         //dari hotel gajah mada
        lookupItem35.setLokasiAkhir(lokasi20);       //ke bandar abdul
        lookupItem35.setTransport(moda3);            //mobil
        listLookup.add(lookupItem34);
        
        Lookup lookupItem36 = new Lookup();
        
        lookupItem36.setIdLookup("IDP0036");
        lookupItem36.setWaktuTempuh(110);
        lookupItem36.setJarakTempuh(800);
        lookupItem36.setLokasiAwal(lokasi20);         //dari bandara abdul
        lookupItem36.setLokasiAkhir(lokasi8);       //ke bandara husein
        lookupItem36.setTransport(moda2);            //pesawat
        listLookup.add(lookupItem36);
        
        Lookup lookupItem37 = new Lookup();
        
        lookupItem37.setIdLookup("IDP0037");
        lookupItem37.setWaktuTempuh(120);
        lookupItem37.setJarakTempuh(66);
        lookupItem37.setLokasiAwal(lokasi8);         //dari bandara husein
        lookupItem37.setLokasiAkhir(lokasi7);       //ke dinas p
        lookupItem37.setTransport(moda3);            //mobil
        listLookup.add(lookupItem37);
        
        Lookup lookupItem38 = new Lookup();
        
        lookupItem38.setIdLookup("IDP0038");
        lookupItem38.setWaktuTempuh(13);
        lookupItem38.setJarakTempuh(5);
        lookupItem38.setLokasiAwal(lokasi7);         //dari dinas p
        lookupItem38.setLokasiAkhir(lokasi1);       //ke rumah
        lookupItem38.setTransport(moda3);            //mobil
        listLookup.add(lookupItem38);
        
        
        /*
        Pengubahan format tanggal
        */
        String pattern = "dd/MM/yyyy hh:mm";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        
        User kanto = new User();
        kanto.setNameUser("Kanto");
        
        
        
        Event event1 = new Event();
        event1.setNameEvent("Check In Hotel dan istirahat");
        event1.setEmbarkation(listLokasi.get(0));        //rumah
        event1.setDestination(listLokasi.get(1));        //hotel
        //event1.setTransport(listTransport.get(2));     //disesuaikan dengan combobox pada desain web
        
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
        event2.setEmbarkation(event1.getDestination());
        event2.setDestination(listLokasi.get(2));        //SMA 20 bandung
        event2.setTransport(listTransport.get(2));       //disesuaikan dengan combobox pada desain web
        
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
        event3.setEmbarkation(event2.getDestination());
        event3.setDestination(listLokasi.get(3));       //Rumah makan  
        event3.setTransport(listTransport.get(2));      //disesuaikan dengan combobox pada desain web
        
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
        event4.setEmbarkation(event3.getDestination());
        event4.setDestination(listLokasi.get(1));       //Hotel
        event4.setTransport(listTransport.get(2));      //disesuaikan dengan combobox pada desain web
        
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
        event5.setEmbarkation(event4.getDestination());
        event5.setDestination(listLokasi.get(4));
        event5.setTransport(listTransport.get(2)); //disesuaikan dengan combobox pada desain web
        
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
        event6.setEmbarkation(event5.getDestination());
        event6.setDestination(listLokasi.get(5));
        event6.setTransport(listTransport.get(2)); //disesuaikan dengan combobox pada desain web
        
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
        event7.setEmbarkation(event6.getDestination());
        event7.setDestination(listLokasi.get(1));
        event7.setTransport(listTransport.get(2)); //disesuaikan dengan combobox pada desain web
        
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
        event8.setEmbarkation(event7.getDestination());
        event8.setDestination(listLokasi.get(6));
        event8.setTransport(listTransport.get(2)); //disesuaikan dengan combobox pada desain web
        
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
        event9.setEmbarkation(event8.getDestination());
        event9.setDestination(listLokasi.get(0));
        event9.setTransport(listTransport.get(2)); //disesuaikan dengan combobox pada desain web
        
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
        
        kanto.printListEvent(listLookup);
        
        
    }    
}
