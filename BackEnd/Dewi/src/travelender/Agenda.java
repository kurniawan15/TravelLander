/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelender;

import java.util.Date;

/**
 *
 * @author Dewi Roaza
 */
public class Agenda {
    private String idUser;
    private String idAgenda;
    private Date startTime;
    private Date endTime;
    private String nameLocation;
    private String nameAgenda;
    private String transport;

    /**
     * @return the idUser
     */
    public String getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the idAgenda
     */
    public String getIdAgenda() {
        return idAgenda;
    }

    /**
     * @param idAgenda the idAgenda to set
     */
    public void setIdAgenda(String idAgenda) {
        this.idAgenda = idAgenda;
    }

    /**
     * @return the startTime
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the nameLocation
     */
    public String getNameLocation() {
        return nameLocation;
    }

    /**
     * @param nameLocation the nameLocation to set
     */
    public void setNameLocation(String nameLocation) {
        this.nameLocation = nameLocation;
    }

    /**
     * @return the nameAgenda
     */
    public String getNameAgenda() {
        return nameAgenda;
    }

    /**
     * @param nameAgenda the nameAgenda to set
     */
    public void setNameAgenda(String nameAgenda) {
        this.nameAgenda = nameAgenda;
    }

    /**
     * @return the transport
     */
    public String getTransport() {
        return transport;
    }

    /**
     * @param transport the transport to set
     */
    public void setTransport(String transport) {
        this.transport = transport;
    }
    
    /**
     * Prosedur untuk menampilkan satu agenda
     */
    public void printAgenda() {
        System.out.println("Nama agenda \t : " + this.nameAgenda);
        System.out.println("Lokasi \t\t : " + this.nameLocation);
        System.out.println("Waktu mulai \t : " + this.startTime);
        System.out.println("Waktu selesai \t : " + this.endTime + "\n");
    }
}
