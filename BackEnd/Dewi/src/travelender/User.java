/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelender;

import java.util.List;

/**
 *
 * @author Dewi Roaza
 * 
 */
public class User {
    
    
    private String nameUser;
    private String email; 
    private List<Agenda> listAgenda;
    private String Password;
    private String currentLocation;


    /**
     * @return the ListAgenda
     */
    public List<Agenda> getListAgenda() {
        return listAgenda;
    }

    /**
     * @param ListAgenda the ListAgenda to set
     */
    public void setListAgenda(List<Agenda> ListAgenda) {
        this.listAgenda = ListAgenda;
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
    
    public void printListAgenda(){
        int size = this.listAgenda.size();
        int i;
        for(i = 0; i < size  ; i++){
            this.listAgenda.get(i).printAgenda();
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
}

