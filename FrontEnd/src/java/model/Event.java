/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 *
 * @author Dewi Roaza
 */
public class Event {
    private String idUser;
    private Integer idEvent;
    private Date startTime;
    private Date endTime;
    private String nameEvent;
    private int lokasi;

    public Event() {
}

public Event (Integer idEvent, String nameEvent, Date startTime, Date endTime, Integer lokasi){

    this.idEvent = idEvent;
    this.nameEvent = nameEvent;
    this.startTime = startTime;
    this.endTime = endTime;
  //  this.transport = transport;
    this.lokasi = lokasi;
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
    public String getNameEvent() {
        return nameEvent;
    }

    /**
     * @param nameEvent the nameEvent to set
     */
    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
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
     * @return the lokasi
     */
    public int getLokasi() {
        return lokasi;
    }

    /**
     * @param lokasi the lokasi to set
     */
    public void setLokasi(int lokasi) {
        this.lokasi = lokasi;
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
}
