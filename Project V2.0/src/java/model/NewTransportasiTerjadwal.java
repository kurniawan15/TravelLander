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
public class NewTransportasiTerjadwal {
    public String kdTransportasiTerjadwal;
    public String kdModa;
    public String namaTransportasiTerjadwal;
    public Date waktuBerangkat;
    public Date waktuDatang;

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

    /**
     * @return the namaTransportasiTerjadwal
     */
    public String getNamaTransportasiTerjadwal() {
        return namaTransportasiTerjadwal;
    }

    /**
     * @param namaTransportasiTerjadwal the namaTransportasiTerjadwal to set
     */
    public void setNamaTransportasiTerjadwal(String namaTransportasiTerjadwal) {
        this.namaTransportasiTerjadwal = namaTransportasiTerjadwal;
    }

    /**
     * @return the waktuBerangkat
     */
    public Date getWaktuBerangkat() {
        return waktuBerangkat;
    }

    /**
     * @param waktuBerangkat the waktuBerangkat to set
     */
    public void setWaktuBerangkat(Date waktuBerangkat) {
        this.waktuBerangkat = waktuBerangkat;
    }

    /**
     * @return the waktuDatang
     */
    public Date getWaktuDatang() {
        return waktuDatang;
    }

    /**
     * @param waktuDatang the waktuDatang to set
     */
    public void setWaktuDatang(Date waktuDatang) {
        this.waktuDatang = waktuDatang;
    }

    /**
     * @return the kdModa
     */
    public String getKdModa() {
        return kdModa;
    }

    /**
     * @param kdModa the kdModa to set
     */
    public void setKdModa(String kdModa) {
        this.kdModa = kdModa;
    }
}
