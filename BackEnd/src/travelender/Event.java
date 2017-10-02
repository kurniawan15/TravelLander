/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelender;

import java.util.Date;

/**
 *
 * @author Dewi Roaza
 */
public class Event {

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
    public String getNameEvent() {
        return nameEvent;
    }

    /**
     * @param nameEvent the nameEvent to set
     */
    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }
    private String idUser;
    private String idEvent;
    private Date startTime;
    private Date endTime;
    private String nameEvent;
    private ModaTransportasi transport;
    private Lokasi destination;
    private Lokasi lokasiAwal;
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
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
     * Prosedur untuk menampilkan satu event
     */
    public void printEvent() {
        System.out.println("Nama event \t : " + this.getNameEvent());
        System.out.println("Lokasi awal \t : " + this.lokasiAwal.getNamaLokasi());
        System.out.println("Lokasi akhir \t : " + this.destination.getNamaLokasi());
        System.out.println("Waktu mulai \t : " + this.startTime);
        System.out.println("Waktu selesai \t : " + this.endTime);
        System.out.println("Transportasi \t : " + this.transport.getNameTransport() + "\n");
        }

}
