/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelender;

/**
 *
 * @author Dewi Roaza
 */
public class Lookup {
    private String idLookup;
    private float jarakTempuh;
    private int waktuTempuh;
    private Lokasi lokasiAwal;
    private Lokasi LokasiAkhir;
    private ModaTransportasi transport;

    /**
     * @return the idLookup
     */
    public String getIdLookup() {
        return idLookup;
    }

    /**
     * @param idLookup the idLookup to set
     */
    public void setIdLookup(String idLookup) {
        this.idLookup = idLookup;
    }

    /**
     * @return the jarakTempuh
     */
    public float getJarakTempuh() {
        return jarakTempuh;
    }

    /**
     * @param jarakTempuh the jarakTempuh to set
     */
    public void setJarakTempuh(float jarakTempuh) {
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
        return LokasiAkhir;
    }

    /**
     * @param LokasiAkhir the LokasiAkhir to set
     */
    public void setLokasiAkhir(Lokasi LokasiAkhir) {
        this.LokasiAkhir = LokasiAkhir;
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
