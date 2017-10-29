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
public class Perjalanan {
    public String idPerjalanan;
    public String kdTransportasiPublik;
    public String kdJarak;
    public String kdTransportasiPribadi;
    public int waktuTempuh;
    
  
    /**
     * @return the idLookup
     */
    public String getIdPerjalanan() {
        return idPerjalanan;
    }

    /**
     * @param idLookup the idLookup to set
     */
    public void setIdPerjalanan(String idPerjalanan) {
        this.idPerjalanan = idPerjalanan;
    }

    /**
     * @return the kdTransportasiPublik
     */
    public String getKdTransportasiPublik() {
        return kdTransportasiPublik;
    }

    /**
     * @param kdTransportasiPublik the kdTransportasiPublik to set
     */
    public void setKdTransportasiPublik(String kdTransportasiPublik) {
        this.kdTransportasiPublik = kdTransportasiPublik;
    }

    /**
     * @return the kdJarak
     */
    public String getKdJarak() {
        return kdJarak;
    }

    /**
     * @param kdJarak the kdJarak to set
     */
    public void setKdJarak(String kdJarak) {
        this.kdJarak = kdJarak;
    }

    /**
     * @return the kdTransportasiPribadi
     */
    public String getKdTransportasiPribadi() {
        return kdTransportasiPribadi;
    }

    /**
     * @param kdTransportasiPribadi the kdTransportasiPribadi to set
     */
    public void setKdTransportasiPribadi(String kdTransportasiPribadi) {
        this.kdTransportasiPribadi = kdTransportasiPribadi;
    }

    /**
     * @return the waktuTempuh
     */
    public int getWaktuTempuh() {
        return waktuTempuh;
    }

    /**
     * @param waktuTempuh the waktuTempuh to set
     */
    public void setWaktuTempuh(int waktuTempuh) {
        this.waktuTempuh = waktuTempuh;
    }

    public void setkdTransportasiPublik(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setkdJarak(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setkdTransportasiPribadi(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setwaktuTempuh(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
