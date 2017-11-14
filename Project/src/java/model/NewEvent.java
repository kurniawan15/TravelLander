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
 */
public class NewEvent {
    private String kdEvent;
    private String kdPerjalanan;
    private String kdTraveller;
    private String namaEvent;
    private Date waktuMulai;
    private Date waktuSelesai;
    private String ket;

    /**
     * @return the kdEvent
     */
    public String getKdEvent() {
        return kdEvent;
    }

    /**
     * @param kdEvent the kdEvent to set
     */
    public void setKdEvent(String kdEvent) {
        this.kdEvent = kdEvent;
    }

    /**
     * @return the namaEvent
     */
    public String getNamaEvent() {
        return namaEvent;
    }

    /**
     * @param namaEvent the namaEvent to set
     */
    public void setNamaEvent(String namaEvent) {
        this.namaEvent = namaEvent;
    }

    /**
     * @return the waktuMulai
     */
    public Date getWaktuMulai() {
        return waktuMulai;
    }

    /**
     * @param waktuMulai the waktuMulai to set
     */
    public void setWaktuMulai(Date waktuMulai) {
        this.waktuMulai = waktuMulai;
    }

    /**
     * @return the waktuSelesai
     */
    public Date getWaktuSelesai() {
        return waktuSelesai;
    }

    /**
     * @param waktuSelesai the waktuSelesai to set
     */
    public void setWaktuSelesai(Date waktuSelesai) {
        this.waktuSelesai = waktuSelesai;
    }

    /**
     * @return the ket
     */
    public String getKet() {
        return ket;
    }

    /**
     * @param ket the ket to set
     */
    public void setKet(String ket) {
        this.ket = ket;
    }

    /**
     * @return the kdPerjalanan
     */
    public String getKdPerjalanan() {
        return kdPerjalanan;
    }

    /**
     * @param kdPerjalanan the kdPerjalanan to set
     */
    public void setKdPerjalanan(String kdPerjalanan) {
        this.kdPerjalanan = kdPerjalanan;
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
    
}
