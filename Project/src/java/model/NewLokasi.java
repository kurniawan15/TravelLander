/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dewi Roaza
 */
public class NewLokasi {
    public String kdEvent;
    public String namaLokasi;
    public String latitude;
    public String longitude;
    public String alamat;
    public String ket;


    /**
     * @return the namaLokasi
     */
    public String getNamaLokasi() {
        return namaLokasi;
    }

    /**
     * @param namaLokasi the namaLokasi to set
     */
    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }

    /**
     * @return the latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitute
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitute to set
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
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
}
