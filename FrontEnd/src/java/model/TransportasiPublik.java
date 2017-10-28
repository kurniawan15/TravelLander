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
    private String idTansportasiPublik;
    private String idModa;
    private String namaTransportasiPublik;
    private Date waktuBerangkat;
    private Date waktuDatang;

    /**
     * @return the idTansportasiPublik
     */
    public String getIdTansportasiPublik() {
        return idTansportasiPublik;
    }

    /**
     * @param idTansportasiPublik the idTansportasiPublik to set
     */
    public void setIdTansportasiPublik(String idTansportasiPublik) {
        this.idTansportasiPublik = idTansportasiPublik;
    }

    /**
     * @return the idModa
     */
    public String getIdModa() {
        return idModa;
    }

    /**
     * @param idModa the idModa to set
     */
    public void setIdModa(String idModa) {
        this.idModa = idModa;
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
}
