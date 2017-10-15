/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Dewi Roaza
 */
public class Event {
    private String idUser;
    private Integer idEvent;
    private Date waktuMulai;
    private Date waktuSelesai;
    private String namaAgenda;
    //private ModaTransportasi transport;
     private String idPerjalanan;
    
public Event() {
}

public Event (Integer idEvent, String nameEvent, Date startTime, Date endTime, Integer lokasi){

    this.idEvent = idEvent;
    this.namaAgenda = nameEvent;
    this.waktuMulai = startTime;
    this.waktuSelesai = endTime;
  //  this.transport = transport;
    this.idPerjalanan = idPerjalanan;
}
    /**
     * @return the idEvent
     */
    public Integer getIdEvent() {
        return idEvent;
    }

    /**
     * @param idEvent the idEvent to set
     */
    public void setIdEvent(Integer idEvent) {
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

    /**
     * @param transport the transport to set
     */

    /**
     * @return the destination
     */


        /**
     * Prosedur untuk menampilkan satu event
     */
   public void printEvent() {
//        System.out.println("Nama event \t : " + this.getNameEvent());
//        System.out.println("Lokasi awal \t : " + this.destination.getNamaLokasi());
//        System.out.println("Lokasi akhir \t : " + this.destination.getNamaLokasi());
//        System.out.println("Waktu mulai \t : " + this.startTime);
//        System.out.println("Waktu selesai \t : " + this.endTime);
//        System.out.println("Transportasi \t : " + this.transport.getNameTransport() + "\n");
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
