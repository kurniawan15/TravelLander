/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelender;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dewi Roaza
 */
public class Perjalanan {
    private String idPerjalanan;
    private float jarakTempuh;
    private int waktuTempuh;
    private Lokasi kodeLokasiAwal;
    private Lokasi kodeLokasiAkhir;
    private ModaTransportasi kdModa;

    /**
     * @return the idLookup
     */
    public String getIdPerjalanan() {
        return idPerjalanan;
    }

    /**
     * @param idPerjalanan the idLookup to set
     */
    public void setIdPerjalanan(String idPerjalanan) {
        this.idPerjalanan = idPerjalanan;
    }

    /**
     * @return the jarakTempuh
     */
    public float getJarakTempuh() {
        return jarakTempuh;
    }

    /**
     * @param jarakTempuh the jarakTempuh to set
     */
    public void setJarakTempuh(float jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }

    /**
     * @return the waktuTempuh
     */
    public int getWaktuTempuh() {
        return waktuTempuh;
    }

    /**
     * @param waktuTempuh the waktuTempuh to set
     */
    public void setWaktuTempuh(int waktuTempuh) {
        this.waktuTempuh = waktuTempuh;
    }

    /**
     * @return the lokasiAwal
     */
    public Lokasi getKodeLokasiAwal() {
        return kodeLokasiAwal;
    }

    /**
     * @param kodeLokasiAwal the lokasiAwal to set
     */
    public void setKodeLokasiAwal(Lokasi kodeLokasiAwal) {
        this.kodeLokasiAwal = kodeLokasiAwal;
    }

    /**
     * @return the LokasiAkhir
     */
    public Lokasi getKodeLokasiAkhir() {
        return kodeLokasiAkhir;
    }

    /**
     * @param kodeLokasiAkhir the LokasiAkhir to set
     */
    public void setKodeLokasiAkhir(Lokasi kodeLokasiAkhir) {
        this.kodeLokasiAkhir = kodeLokasiAkhir;
    }

    /**
     * @return the transport
     */
    public ModaTransportasi getKdModa() {
        return kdModa;
    }

    /**
     * @param kdModa the transport to set
     */
    public void setKdModa(ModaTransportasi kdModa) {
        this.kdModa = kdModa;
    }
    
    public void getIntervalTime(Lokasi lokasi1,Lokasi lokasi2,Event event){
        
    }
    
    public void getSameLocation(List<Perjalanan> listLookup,Event event){
           
        String pattern = "EEEE, dd/MM/yyyy HH:mm";
        SimpleDateFormat format = new SimpleDateFormat(pattern); 
        List<Perjalanan> listSame = new ArrayList<Perjalanan>();
        int i = 0,j = 1;
        System.out.println("Moda yang memungkinkan : ");
            
        for(Perjalanan l :listLookup){
            if((l.getKodeLokasiAwal() == event.getEmbarkation())&&(l.getKodeLokasiAkhir() == event.getDestination())){
                
                listSame.add(listLookup.get(i));
                System.out.print(j + "." + l.getKdModa().getTipeModa());
//                System.out.println(", waktu berangkat : " + event.getStartTime().getTime()  - (l.getWaktuTempuh() * 60));
                System.out.println(" \t, waktu berangkat : " + format.format(new Date(event.getWaktuMulai().getTime() - (l.getWaktuTempuh() * 60000))));
                j++;
            }
            
            
        i++;
        }          
        
        System.out.println("\n");
//           return listSame;
    }
}
