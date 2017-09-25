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

    private String id_lokasi;
    private String nama_lokasi;
    private Lookup alamat;
    
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
     * @return the alamat
     */
    public Lookup getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(Lookup alamat) {
        this.alamat = alamat;
    }

}
