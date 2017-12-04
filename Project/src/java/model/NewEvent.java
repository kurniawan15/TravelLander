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
    public String idEvent;
    public String kdTraveller;
    public String kdTransportasiTidakTerjadwal;
    public String kdTransportasiTerjadwal;
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
    public String getKdTransportasiTidakTerjadwal() {
        return kdTransportasiTidakTerjadwal;
    }

    /**
     * @param kdTransportasiTidakTerjadwal the kdTransportasiTidakTerjadwal to set
     */
    public void setKdTransportasiTidakTerjadwal(String kdTransportasiTidakTerjadwal) {
        this.kdTransportasiTidakTerjadwal = kdTransportasiTidakTerjadwal;
    }

    /**
     * @return the kdTransportasiTerjadwal
     */
    public String getKdTransportasiTerjadwal() {
        return kdTransportasiTerjadwal;
    }

    /**
     * @param kdTransportasiTerjadwal the kdTransportasiTerjadwal to set
     */
    public void setKdTransportasiTerjadwal(String kdTransportasiTerjadwal) {
        this.kdTransportasiTerjadwal = kdTransportasiTerjadwal;
    }
    
}
