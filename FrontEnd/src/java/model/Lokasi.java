/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Database.KoneksiDB;



/**
 *
 * @author Mohridwan
 */
public class Lokasi {
    
    public String kd_lokasi;
    public String namaLokasi;
    public String alamat;
    public String id_kota;
    public String id_provinsi;
    
    
    public Lokasi(){
       
    }
    

    public String getKdLokasi() {
        return kd_lokasi;
    }

    public void setKdLokasi(String kd_lokasi) {
        this.kd_lokasi = kd_lokasi;
    }


    public String getNamaLokasi() {
        return namaLokasi;
    }

 
    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }


    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the id_kota
     */
    public String getId_kota() {
        return id_kota;
    }

    /**
     * @param id_kota the id_kota to set
     */
    public void setId_kota(String id_kota) {
        this.id_kota = id_kota;
    }

    /**
     * @return the id_provinsi
     */
    public String getId_provinsi() {
        return id_provinsi;
    }

    /**
     * @param id_provinsi the id_provinsi to set
     */
    public void setId_provinsi(String id_provinsi) {
        this.id_provinsi = id_provinsi;
    }
    
    
}