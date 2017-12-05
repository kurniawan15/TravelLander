/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Json;

/**
 *
 * @author Fadhil-PC
 */
public class Bounds {
    private Northeast northeast;
    private Southwest southwest;

    /**
     * @return the northeast
     */
    public Northeast getNortheast() {
        return northeast;
    }

    /**
     * @param northeast the northeast to set
     */
    public void setNortheast(Northeast northeast) {
        this.northeast = northeast;
    }

    /**
     * @return the southwest
     */
    public Southwest getSouthwest() {
        return southwest;
    }

    /**
     * @param southwest the southwest to set
     */
    public void setSouthwest(Southwest southwest) {
        this.southwest = southwest;
    }
}
