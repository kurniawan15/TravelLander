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
public class ModaTransportasi {
    public String idModa;
    public String tipeModa;

    /**
     * @return the idTransport
     */
    public String getIdModa() {
        return idModa;
    }

    /**
     * @param idModa the idTransport to set
     */
    public void setIdModa(String idModa) {
        this.idModa = idModa;
    }

    /**
     * @return the nameTransport
     */
    public String getTipeModa() {
        return tipeModa;
    }

    /**
     * @param tipeModa the nameTransport to set
     */
    public void setTipeModa(String tipeModa) {
        this.tipeModa = tipeModa;
    }
}
