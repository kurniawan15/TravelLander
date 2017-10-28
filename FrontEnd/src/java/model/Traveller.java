/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Dewi Roaza
 * 
 */
public class Traveller {
    
    private String idUser;
    private String nameUser;
    private String username;
    private String email; 
    private List<Event> listEvent;
    private String Password;
    private String currentLocation;

    public Traveller (String idUser, String nameUser, String username, String email, String Password){
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.username = username;
        this.email = email;
        this.Password = Password;
    }
    /**
     * @return the ListAgenda
     */
    public List<Event> getListEvent() {
        return listEvent;
    }

    public void setListEvent(List<Event> ListEvent) {
        this.listEvent = ListEvent;
    }

    /**
     * @return the nameUser
     */
    public String getNameUser() {
        return nameUser;
    }

    /**
     * @param nameUser the nameUser to set
     */
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
    
    /**
     * @return the userName
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param userName the nameUser to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void printListEvent(){
        int size = this.listEvent.size();
        int i;
        for(i = 0; i < size  ; i++){
            this.listEvent.get(i).printEvent();
        }
        
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the currentLocation
     */
    public String getCurrentLocation() {
        return currentLocation;
    }

    /**
     * @param currentLocation the currentLocation to set
     */
    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

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
}

