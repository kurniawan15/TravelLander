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
    
    private String idUser;
    private String nameUser;
    private String email; 
    private List<Event> listEvent;
    private String Password;
    private String currentLocation;


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
    
    public void printListEvent(List<Lookup> list){
        int size = this.listEvent.size();
        int i;
        for(i = 0; i < size  ; i++){
            this.listEvent.get(i).printEvent(list);
            
            if(i == 0){
                list.get(i).getModaTransportasi(list,this.listEvent.get(i));
            }
            else{
                list.get(i).getModaTransportasi(list,this.listEvent.get(i-1),this.listEvent.get(i));
            }
            System.out.println();
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

