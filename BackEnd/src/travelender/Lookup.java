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
public class Lookup {
    private String idLookup;
    private float jarakTempuh;
    private int waktuTempuh;
    private Lokasi lokasiAwal;
    private Lokasi LokasiAkhir;
    private ModaTransportasi transport;

    /**
     * @return the idLookup
     */
    public String getIdLookup() {
        return idLookup;
    }

    /**
     * @param idLookup the idLookup to set
     */
    public void setIdLookup(String idLookup) {
        this.idLookup = idLookup;
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
    public Lokasi getLokasiAwal() {
        return lokasiAwal;
    }

    /**
     * @param lokasiAwal the lokasiAwal to set
     */
    public void setLokasiAwal(Lokasi lokasiAwal) {
        this.lokasiAwal = lokasiAwal;
    }

    /**
     * @return the LokasiAkhir
     */
    public Lokasi getLokasiAkhir() {
        return LokasiAkhir;
    }

    /**
     * @param LokasiAkhir the LokasiAkhir to set
     */
    public void setLokasiAkhir(Lokasi LokasiAkhir) {
        this.LokasiAkhir = LokasiAkhir;
    }

    /**
     * @return the transport
     */
    public ModaTransportasi getTransport() {
        return transport;
    }

    /**
     * @param transport the transport to set
     */
    public void setTransport(ModaTransportasi transport) {
        this.transport = transport;
    }
    
    public long getIntervalTime(Event prevEvent,Event curEvent){
        return curEvent.getStartTime().getTime() - prevEvent.getEndTime().getTime();
    }
    
    public List<Lookup> getSameLocation(List<Lookup> listLookup,Event event){
           
        
        List<Lookup> listSame = new ArrayList<Lookup>();
        int i = 0,j = 1;
//        System.out.println("Moda yang memungkinkan : ");
            
        for(Lookup l :listLookup){
            if((l.getLokasiAwal() == event.getEmbarkation())&&(l.getLokasiAkhir() == event.getDestination())){
                
                listSame.add(listLookup.get(i));
//                System.out.print(j + "." + l.getTransport().getNameTransport());
//                System.out.println(", waktu berangkat : " + event.getStartTime().getTime()  - (l.getWaktuTempuh() * 60));
//                System.out.println(" \t, waktu berangkat : " + format.format(new Date(event.getStartTime().getTime() - (l.getWaktuTempuh() * 60000))));
                j++;
            }         
        i++;
        }          
        
        
//        System.out.println("\n");
           return listSame;
    }
    
    public void getModaTransportasi(List<Lookup> listLookup,Event event){
        String pattern = "EEEE, dd/MM/yyyy HH:mm";
        SimpleDateFormat format = new SimpleDateFormat(pattern); 
        
        List<Lookup> listSame = getSameLocation(listLookup, event);
        int i = 0,j = 1;
        System.out.println("Moda yang memungkinkan : ");
        for(Lookup l :listSame){
                
//                if(l.getWaktuTempuh() <= ){
                    System.out.print(j + "." + l.getTransport().getNameTransport());
//                    System.out.println(", waktu berangkat : " + event.getStartTime().getTime()  - (l.getWaktuTempuh() * 60));
                    System.out.println(" \t, waktu berangkat : " + format.format(new Date(event.getStartTime().getTime() - (l.getWaktuTempuh() * 60000))));
                
                    j++;
//                }
                i++;
        }
    }
    
    public void getModaTransportasi(List<Lookup> listLookup,Event prevEvent,Event curEvent){
        String pattern = "EEEE, dd/MM/yyyy HH:mm";
        SimpleDateFormat format = new SimpleDateFormat(pattern); 
        
        List<Lookup> listSame = getSameLocation(listLookup, curEvent);
        int i = 0,j = 1;
        System.out.println("Moda yang memungkinkan : ");
        for(Lookup l :listSame){
                
                if((l.getWaktuTempuh() * 60000) <= getIntervalTime(prevEvent,curEvent)){
                    System.out.print(j + "." + l.getTransport().getNameTransport());
//                    System.out.println(", waktu berangkat : " + event.getStartTime().getTime()  - (l.getWaktuTempuh() * 60));
                    System.out.println(" \t, waktu berangkat : " + format.format(new Date(curEvent.getStartTime().getTime() - (l.getWaktuTempuh() * 60000))));
//                    System.out.println("waktu tempuh : " + l.getWaktuTempuh() + ", waktu travel " + getIntervalTime(prevEvent,curEvent)/60000);
                    
                    j++;
                }
                i++;
        }
    }
    
}
