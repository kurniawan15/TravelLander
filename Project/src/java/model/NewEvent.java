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
    public String kdEvent;
    public String kdTraveller;
    public String travelMode;
    public int avoidtolls;
    public String namaEvent;
    public Date waktuMulai;
    public Date waktuSelesai;
    public String keterangan;

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
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * @param keterangan the ket to set
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    /**
     * @return the idEvent
     */
    public String getKdEvent() {
        return kdEvent;
    }

    /**
     * @param kdEvent the idEvent to set
     */
    public void setKdEvent(String kdEvent) {
        this.kdEvent = kdEvent;
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
     * @return the kdTransportasiTidakTerjadwal
     */
    public String getTravelMode() {
        return travelMode;
    }

    /**
     * @param travelMode the kdTransportasiTidakTerjadwal to set
     */
    public void setTravelMode(String travelMode) {
        this.travelMode = travelMode;
    }

    /**
     * @return the kdTransportasiTerjadwal
     */
    public int getAvoidtolls() {
        return avoidtolls;
    }

    /**
     * @param avoidtolls the kdTransportasiTerjadwal to set
     */
    public void setAvoidtolls(int avoidtolls) {
        this.avoidtolls = avoidtolls;
    }
    
}
