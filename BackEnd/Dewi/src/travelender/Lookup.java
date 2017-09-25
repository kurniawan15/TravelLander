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
    private String lokasiAwal;
    private String LokasiAkhir;
    private String transport;

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
    public String getLokasiAwal() {
        return lokasiAwal;
    }

    /**
     * @param lokasiAwal the lokasiAwal to set
     */
    public void setLokasiAwal(String lokasiAwal) {
        this.lokasiAwal = lokasiAwal;
    }

    /**
     * @return the LokasiAkhir
     */
    public String getLokasiAkhir() {
        return LokasiAkhir;
    }

    /**
     * @param LokasiAkhir the LokasiAkhir to set
     */
    public void setLokasiAkhir(String LokasiAkhir) {
        this.LokasiAkhir = LokasiAkhir;
    }

    /**
     * @return the transport
     */
    public String getTransport() {
        return transport;
    }

    /**
     * @param transport the transport to set
     */
    public void setTransport(String transport) {
        this.transport = transport;
    }
}
