/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelender;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dewi Roaza
 */
public class Event {

    
    private String idUser;
    private String idEvent;
    private Date waktuMulai;
    private Date waktuSelesai;
    private String namaAgenda;
    private String idPerjalanan;
    private ModaTransportasi transport;  //nanti hapus aja klo sudah kejsp
    private Lokasi destination;          //nanti hapus aja klo sudah kejsp
    private Lokasi embarkation;          //nanti hapus aja klo sudah kejsp
    
    /**
     * @return the idEvent
     */
    public String getIdEvent() {
        return idEvent;
    }

    /**
     * @param idEvent the idEvent to set
     */
    public void setIdEvent(String idEvent) {
        this.idEvent = idEvent;
    }

    /**
     * @return the nameEvent
     */
    public String getNamaAgenda() {
        return namaAgenda;
    }

    /**
     * @param namaAgenda the nameEvent to set
     */
    public void setNamaAgenda(String namaAgenda) {
        this.namaAgenda = namaAgenda;
    }
    /**
     * @return the idUser
     */
    public String getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the idAgenda
     */
   
    /**
     * @return the startTime
     */
    public Date getWaktuMulai() {
        return waktuMulai;
    }

    /**
     * @param waktuMulai the startTime to set
     */
    public void setWaktuMulai(Date waktuMulai) {
        this.waktuMulai = waktuMulai;
    }

    /**
     * @return the endTime
     */
    public Date getWaktuSelesai() {
        return waktuSelesai;
    }

    /**
     * @param waktuSelesai the endTime to set
     */
    public void setWaktuSelesai(Date waktuSelesai) {
        this.waktuSelesai = waktuSelesai;
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

    /**
     * @return the destination
     */
    public Lokasi getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(Lokasi destination) {
        this.destination = destination;
    }

    /**
     * @return the embarkation
     */
    public Lokasi getEmbarkation() {
        return embarkation;
    }

    /**
     * @param embarkation the embarkation to set
     */
    public void setEmbarkation(Lokasi embarkation) {
        this.embarkation = embarkation;
    }    
   
        /**
     * Prosedur untuk menampilkan satu event
     */
    public void printEvent(List<Perjalanan> list) {
        
        String pattern = "EEEE, dd/MM/yyyy HH:mm";
        SimpleDateFormat format = new SimpleDateFormat(pattern);  
        Perjalanan l = new Perjalanan();
        System.out.println("Nama event \t : " + this.getNamaAgenda());
        System.out.println("Lokasi awal \t : " + this.getEmbarkation().getNamaLokasi());
        System.out.println("Lokasi akhir \t : " + this.destination.getNamaLokasi());
        System.out.println("Waktu mulai \t : " + format.format(this.waktuMulai));
        System.out.println("Waktu selesai \t : " + format.format(this.waktuSelesai) + "\n");
//        System.out.println("Transportasi \t : " + this.transport.getNameTransport() + "\n");
        
        l.getSameLocation(list, this);
        
        }

    /**
     * @return the idPerjalanan
     */
    public String getIdPerjalanan() {
        return idPerjalanan;
    }

    /**
     * @param idPerjalanan the idPerjalanan to set
     */
    public void setIdPerjalanan(String idPerjalanan) {
        this.idPerjalanan = idPerjalanan;
    }


}
