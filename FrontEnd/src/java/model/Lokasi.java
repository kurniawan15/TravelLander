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
    
    
    public String idLokasi;
    public String namaLokasi;
    public String alamat;
    
    
    public Lokasi(){
       
    }
    

    public String getIdLokasi() {
        return idLokasi;
    }

    public void setIdLokasi(String idLokasi) {
        this.idLokasi = idLokasi;
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
    
    
}