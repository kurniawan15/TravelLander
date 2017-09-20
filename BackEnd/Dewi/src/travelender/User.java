/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelender;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dewi Roaza
 */
public class User {
    
    private String idUser;
    private String nameUser;
    private String email; 


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
}

