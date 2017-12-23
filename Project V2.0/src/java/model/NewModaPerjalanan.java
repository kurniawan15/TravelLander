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
public class NewModaPerjalanan {
    public String travelMode;
    public int avoidtolls;

    /**
     * @return the idTransport
     */
    public String getTravelMode() {
        return travelMode;
    }

    /**
     * @param travelMode the idTransport to set
     */
    public void setTravelMode(String travelMode) {
        this.travelMode = travelMode;
    }

    /**
     * @return the nameTransport
     */
    public int getAvoidtolls() {
        return avoidtolls;
    }

    /**
     * @param avoidtolls the nameTransport to set
     */
    public void setAvoidtolls(int avoidtolls) {
        this.avoidtolls = avoidtolls;
    }
}
