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
    public int jarakTempuh;
    public int waktuTempuh;
    public Lokasi lokasiAwal;
    public Lokasi lokasiAkhir;
    public ModaTransportasi transport;

    
    public Perjalanan(String idPerjalanan,int jarakTempuh, int waktuTempuh,Lokasi lokasiAwal,Lokasi lokasiAkhir,ModaTransportasi transportasi){
        this.idPerjalanan = idPerjalanan;
        this.jarakTempuh = jarakTempuh;
        this.lokasiAkhir = lokasiAkhir;
        this.transport = transport;
        this.waktuTempuh = waktuTempuh;
    }
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
     * @return the jarakTempuh
     */
    public int getJarakTempuh() {
        return jarakTempuh;
    }

    /**
     * @param jarakTempuh the jarakTempuh to set
     */
    public void setJarakTempuh(int jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
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

    /**
     * @return the lokasiAwal
     */
    public Lokasi getLokasiAwal() {
        return lokasiAwal;
    }

    /**
     * @param lokasiAwal the lokasiAwal to set
     */
    public void setLokasiAwal(Lokasi lokasiAwal) {
        this.lokasiAwal = lokasiAwal;
    }

    /**
     * @return the LokasiAkhir
     */
    public Lokasi getLokasiAkhir() {
        return lokasiAkhir;
    }

    /**
     * @param LokasiAkhir the LokasiAkhir to set
     */
    public void setLokasiAkhir(Lokasi LokasiAkhir) {
        this.lokasiAkhir = LokasiAkhir;
    }

    /**
     * @return the transport
     */
    public ModaTransportasi getTransport() {
        return transport;
    }

    /**
     * @param transport the transport to set
     */
    public void setTransport(ModaTransportasi transport) {
        this.transport = transport;
    }
    
    public void getIntervalTime(Lokasi lokasi1,Lokasi lokasi2,Event event){
        
    }
}
