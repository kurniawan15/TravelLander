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
public class Step {
    private Distance distance;
    private Duration duration;
    private EndLocation end_location;
    private String html_instructions;
    private Polyline polyline;
    private StartLocation start_location;
    private String travel_mode;
    private String maneuver;

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
     * @return the html_instructions
     */
    public String getHtml_instructions() {
        return html_instructions;
    }

    /**
     * @param html_instructions the html_instructions to set
     */
    public void setHtml_instructions(String html_instructions) {
        this.html_instructions = html_instructions;
    }

    /**
     * @return the polyline
     */
    public Polyline getPolyline() {
        return polyline;
    }

    /**
     * @param polyline the polyline to set
     */
    public void setPolyline(Polyline polyline) {
        this.polyline = polyline;
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
     * @return the travel_mode
     */
    public String getTravel_mode() {
        return travel_mode;
    }

    /**
     * @param travel_mode the travel_mode to set
     */
    public void setTravel_mode(String travel_mode) {
        this.travel_mode = travel_mode;
    }

    /**
     * @return the maneuver
     */
    public String getManeuver() {
        return maneuver;
    }

    /**
     * @param maneuver the maneuver to set
     */
    public void setManeuver(String maneuver) {
        this.maneuver = maneuver;
    }
}
