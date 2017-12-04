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
public class Direction {
    private List<GeocodedWayPoint> geocoded_Waypoints = null;
    private List<Route> routes = null;
    private String status;

    /**
     * @return the geocoded_Waypoints
     */
    public List<GeocodedWayPoint> getGeocoded_Waypoints() {
        return geocoded_Waypoints;
    }

    /**
     * @param geocoded_Waypoints the geocoded_Waypoints to set
     */
    public void setGeocoded_Waypoints(List<GeocodedWayPoint> geocoded_Waypoints) {
        this.geocoded_Waypoints = geocoded_Waypoints;
    }

    /**
     * @return the routes
     */
    public List<Route> getRoutes() {
        return routes;
    }

    /**
     * @param routes the routes to set
     */
    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
