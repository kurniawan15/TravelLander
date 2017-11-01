/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Dewi Roaza
 * Edited : M.Ridwann H D P
 */
public class Event {
    public String kdTraveller;
    public String kdEvent;
    public String kdPerjalanan;
    public Date startTime;
    public Date endTime;
    public String nameEvent;
    public String keterangan;
    
    public Event() {
    
    }
    
    public Event(String kdTraveller,
    String kdEvent,
    String kdPerjalanan,
    Date startTime,
    Date endTime,
    String nameEvent,
    String keterangan) {
       this.kdTraveller = kdTraveller;
    this.kdEvent = kdEvent;
    this.kdPerjalanan = kdPerjalanan;
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
    public String getKdEvent() {
        return kdEvent;
    }

    /**
     * @param idEvent the idEvent to set
     */
    public void setKdEvent(String kdEvent) {
        this.kdEvent = kdEvent;
    }

    /**
     * @return the idPerjalanan
     */
    public String getKdPerjalanan() {
        return kdPerjalanan;
    }

    /**
     * @param idPerjalanan the idPerjalanan to set
     */
    public void setKdPerjalanan(String kdPerjalanan) {
        this.kdPerjalanan = kdPerjalanan;
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
