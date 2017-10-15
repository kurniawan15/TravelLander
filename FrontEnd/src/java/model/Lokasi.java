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
    
    
    private Integer kdLokasi;
    private String namaLokasi;
    private String alamat;
    
    public Lokasi(){
        
    }
    
    public Lokasi(Integer idLokasi, String namalokasi, String alamat){
        this.kdLokasi = idLokasi;
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
    public Integer getKdLokasi() {
        return kdLokasi;
    }

    /**
     * @param kdLokasi the idLokasi to set
     */
    public void setKdLokasi(Integer kdLokasi) {
        this.kdLokasi = kdLokasi;
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
