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
    private String kdModa;
    private String tipeModa;
    
    public ModaTransportasi (){
    
    }
    
    public ModaTransportasi (String kdModa, String tipeModa){
        this.kdModa = kdModa;
        this.tipeModa = tipeModa;
    }
    

    /**
     * @return the idTransport
     */
    public String getKdModa() {
        return kdModa;
    }

    /**
     * @param kdModa the idTransport to set
     */
    public void setKdModa(String kdModa) {
        this.kdModa = kdModa;
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
