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

    private String kdLokasi;
    private String namaLokasi;
    private String alamat;
    
    public Lokasi(){
        
    }
    
    public Lokasi(String idLokasi, String namalokasi, String alamat){
        this.kdLokasi = idLokasi;
        this.namaLokasi = namalokasi;
        this.alamat = alamat;
    }
    
    public String getKdLokasi() {
        return this.kdLokasi;
    }
    
    /**
     * @param kdLokasi the kdLokasi to set
     */
    public void setKdLokasi(String kdLokasi) {
        this.kdLokasi = kdLokasi;
    }
    
    
    
    
    public Lokasi(String namalokasi, String alamat){
        this.namaLokasi = namalokasi;
        this.alamat = alamat;
        }
    /**
     * @return the idLokasi
     */
    
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