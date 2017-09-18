/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelender;

/**
 *
 * @author Mohridwan
 */
public class Lokasi {

    /**
     * @return the id_lokasi
     */
    public String getId_lokasi() {
        return id_lokasi;
    }

    /**
     * @param id_lokasi the id_lokasi to set
     */
    public void setId_lokasi(String id_lokasi) {
        this.id_lokasi = id_lokasi;
    }

    /**
     * @return the nama_lokasi
     */
    public String getNama_lokasi() {
        return nama_lokasi;
    }

    /**
     * @param nama_lokasi the nama_lokasi to set
     */
    public void setNama_lokasi(String nama_lokasi) {
        this.nama_lokasi = nama_lokasi;
    }

    /**
     * @return the lokasi_awal
     */
    public String getLokasi_awal() {
        return lokasi_awal;
    }

    /**
     * @param lokasi_awal the lokasi_awal to set
     */
    public void setLokasi_awal(String lokasi_awal) {
        this.lokasi_awal = lokasi_awal;
    }

    /**
     * @return the lokasi_akhir
     */
    public String getLokasi_akhir() {
        return lokasi_akhir;
    }

    /**
     * @param lokasi_akhir the lokasi_akhir to set
     */
    public void setLokasi_akhir(String lokasi_akhir) {
        this.lokasi_akhir = lokasi_akhir;
    }

    /**
     * @return the jarak
     */
    public double getJarak() {
        return jarak;
    }

    /**
     * @param jarak the jarak to set
     */
    public void setJarak(double jarak) {
        this.jarak = jarak;
    }
    private String id_lokasi;
    private String nama_lokasi;
    private String lokasi_awal;
    private String lokasi_akhir;
    private double jarak;
}
