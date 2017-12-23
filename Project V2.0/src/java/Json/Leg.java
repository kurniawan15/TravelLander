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
public class Leg {
    private Distance distance;
    private Duration duration;
    private String end_address;
    private EndLocation end_location;
    private String start_address;
    private StartLocation start_location;
    private List<Step> steps = null;
    private List<Object> via_waypoint = null;

    /**
     * @return the distance
     */
    public Distance getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    /**
     * @return the duration
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    /**
     * @return the end_address
     */
    public String getEnd_address() {
        return end_address;
    }

    /**
     * @param end_address the end_address to set
     */
    public void setEnd_address(String end_address) {
        this.end_address = end_address;
    }

    /**
     * @return the end_location
     */
    public EndLocation getEnd_location() {
        return end_location;
    }

    /**
     * @param end_location the end_location to set
     */
    public void setEnd_location(EndLocation end_location) {
        this.end_location = end_location;
    }

    /**
     * @return the start_address
     */
    public String getStart_address() {
        return start_address;
    }

    /**
     * @param start_address the start_address to set
     */
    public void setStart_address(String start_address) {
        this.start_address = start_address;
    }

    /**
     * @return the start_location
     */
    public StartLocation getStart_location() {
        return start_location;
    }

    /**
     * @param start_location the start_location to set
     */
    public void setStart_location(StartLocation start_location) {
        this.start_location = start_location;
    }

    /**
     * @return the steps
     */
    public List<Step> getSteps() {
        return steps;
    }

    /**
     * @param steps the steps to set
     */
    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    /**
     * @return the via_waypoint
     */
    public List<Object> getVia_waypoint() {
        return via_waypoint;
    }

    /**
     * @param via_waypoint the via_waypoint to set
     */
    public void setVia_waypoint(List<Object> via_waypoint) {
        this.via_waypoint = via_waypoint;
    }
}
