/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Json;

import java.util.List;

/**
 *
 * @author Fadhil-PC
 */
public class GeocodedWayPoint {
    private String geocoder_status;
    private String place_id;
    private List<String> types = null;
    private Boolean partialMatch;

    /**
     * @return the geocoder_status
     */
    public String getGeocoder_status() {
        return geocoder_status;
    }

    /**
     * @param geocoder_status the geocoder_status to set
     */
    public void setGeocoder_status(String geocoder_status) {
        this.geocoder_status = geocoder_status;
    }

    /**
     * @return the place_id
     */
    public String getPlace_id() {
        return place_id;
    }

    /**
     * @param place_id the place_id to set
     */
    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    /**
     * @return the types
     */
    public List<String> getTypes() {
        return types;
    }

    /**
     * @param types the types to set
     */
    public void setTypes(List<String> types) {
        this.types = types;
    }

    /**
     * @return the partialMatch
     */
    public Boolean getPartialMatch() {
        return partialMatch;
    }

    /**
     * @param partialMatch the partialMatch to set
     */
    public void setPartialMatch(Boolean partialMatch) {
        this.partialMatch = partialMatch;
    }
}
