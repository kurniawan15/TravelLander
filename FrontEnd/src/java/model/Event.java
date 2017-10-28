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
 * Edited : M.Ridwann H D P
 */
public class Event {
    public String kdTraveller;
    public String idEvent;
    public String idPerjalanan;
    public Date startTime;
    public Date endTime;
    public String nameEvent;
    public String keterangan;
    
    public Event() {
    
    }
    
    public Event(String kdTraveller,
    String idEvent,
    String idPerjalanan,
    Date startTime,
    Date endTime,
    String nameEvent,
    String keterangan) {
       this.kdTraveller = kdTraveller;
    this.idEvent = idEvent;
    this.idPerjalanan = idPerjalanan;
    this.startTime = startTime;
    this.endTime = endTime;
    this.nameEvent = nameEvent;
    this.keterangan = keterangan;
    }
    
    /**
     * @return the kdTraveller
     */
    public String getKdTraveller() {
        return kdTraveller;
    }

    /**
     * @param kdTraveller the kdTraveller to set
     */
    public void setKdTraveller(String kdTraveller) {
        this.kdTraveller = kdTraveller;
    }

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
     * @return the keterangan
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    

  
}
