/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Fachri_Holmes
 */
public class NewModelCalendar 
{
    private String titleEvent;
    // Time dikonversi  ke String dengan format yyyy-mm-dd untuk
    // dikirim ke JSON
    private String startTime;
    private String endTime;

    
    /**
     * @return the titleEvent
     */
    public String getTitleEvent() {
        return titleEvent;
    }

    /**
     * @param titleEvent the titleEvent to set
     */
    public void setTitleEvent(String titleEvent) {
        this.titleEvent = titleEvent;
    }

    /**
     * @return the startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
