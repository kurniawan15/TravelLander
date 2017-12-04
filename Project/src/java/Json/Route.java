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
public class Route {
    private Bounds bounds;
    private String copyrights;
    private List<Leg> legs = null;
    private OverviewPolyline overview_polyline;
    private String summary;
    private List<Object> warnings = null;
    private List<Object> waypoint_order = null;

    /**
     * @return the bounds
     */
    public Bounds getBounds() {
        return bounds;
    }

    /**
     * @param bounds the bounds to set
     */
    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }

    /**
     * @return the copyrights
     */
    public String getCopyrights() {
        return copyrights;
    }

    /**
     * @param copyrights the copyrights to set
     */
    public void setCopyrights(String copyrights) {
        this.copyrights = copyrights;
    }

    /**
     * @return the legs
     */
    public List<Leg> getLegs() {
        return legs;
    }

    /**
     * @param legs the legs to set
     */
    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }

    /**
     * @return the overview_polyline
     */
    public OverviewPolyline getOverview_polyline() {
        return overview_polyline;
    }

    /**
     * @param overview_polyline the overview_polyline to set
     */
    public void setOverview_polyline(OverviewPolyline overview_polyline) {
        this.overview_polyline = overview_polyline;
    }

    /**
     * @return the summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary the summary to set
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return the warnings
     */
    public List<Object> getWarnings() {
        return warnings;
    }

    /**
     * @param warnings the warnings to set
     */
    public void setWarnings(List<Object> warnings) {
        this.warnings = warnings;
    }

    /**
     * @return the waypoint_order
     */
    public List<Object> getWaypoint_order() {
        return waypoint_order;
    }

    /**
     * @param waypoint_order the waypoint_order to set
     */
    public void setWaypoint_order(List<Object> waypoint_order) {
        this.waypoint_order = waypoint_order;
    }
}
