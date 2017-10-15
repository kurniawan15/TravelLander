/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mohridwan
 */
public class Lokasi {
    
    
    private Integer idLokasi;
    private String namaLokasi;
    private String alamat;
    
    public Lokasi(){
        
    }
    
    public Lokasi(Integer idLokasi, String namalokasi, String alamat){
        this.idLokasi = idLokasi;
        this.namaLokasi = namalokasi;
        this.alamat = alamat;
    }
    
    public Lokasi(String namalokasi, String alamat){
        this.namaLokasi = namalokasi;
        this.alamat = alamat;
        }
    /**
     * @return the idLokasi
     */
    public Integer getIdLokasi() {
        return idLokasi;
    }

    /**
     * @param idLokasi the idLokasi to set
     */
    public void setIdLokasi(Integer idLokasi) {
        this.idLokasi = idLokasi;
    }

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

}
