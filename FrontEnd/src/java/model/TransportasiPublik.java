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
public class TransportasiPublik {
    public String kdTransportasiPublik;
    public String kdLokasiKeberangkatan;
    public String kdLokasiKedatangan;
    public String kdModa;
    public String namaTransportasiPublik;
    public Date waktuBerangkat;
    public Date waktuDatang;

    /**
     * @return the idTansportasiPublik
     */
    public String getKdTransportasiPublik() {
        return kdTransportasiPublik;
    }

    /**
     * @param kdTansportasiPublik the idTansportasiPublik to set
     */
    public void setKdTransportasiPublik(String kdTansportasiPublik) {
        this.kdTransportasiPublik = kdTansportasiPublik;
    }

    /**
     * @return the idModa
     */
    public String getKdModa() {
        return kdModa;
    }

    /**
     * @param kdModa the idModa to set
     */
    public void setKdModa(String kdModa) {
        this.kdModa = kdModa;
    }

    /**
     * @return the namaTransportasiPublik
     */
    public String getNamaTransportasiPublik() {
        return namaTransportasiPublik;
    }

    /**
     * @param namaTransportasiPublik the namaTransportasiPublik to set
     */
    public void setNamaTransportasiPublik(String namaTransportasiPublik) {
        this.namaTransportasiPublik = namaTransportasiPublik;
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
     * @return the kdLokasiKeberangk
     */
    public String getKdLokasiKeberangkatan() {
        return kdLokasiKeberangkatan;
    }

    /**
     * @param kdLokasiKeberangkatan the kdLokasiKeberangk to set
     */
    public void setKdLokasiKeberangkatan(String kdLokasiKeberangkatan) {
        this.kdLokasiKeberangkatan = kdLokasiKeberangkatan;
    }

    /**
     * @return the kdLokasiKedatangan
     */
    public String getKdLokasiKedatangan() {
        return kdLokasiKedatangan;
    }

    /**
     * @param kdLokasiKedatangan the kdLokasiKedatangan to set
     */
    public void setKdLokasiKedatangan(String kdLokasiKedatangan) {
        this.kdLokasiKedatangan = kdLokasiKedatangan;
    }
}
