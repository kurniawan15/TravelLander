/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author Dewi Roaza
 */
public class Traveller {
    
    public String kdTraveller;
    public String namaTraveller;
    public String username;
    public String password; 
    public String email;

    /**
     * @return the Kd_Traveller
     */
    public String getKdTraveller() {
        return kdTraveller;
    }

    /**
     * @param kdTraveller the Kd_Traveller to set
     */
    public void setKdTraveller(String kdTraveller) {
        this.kdTraveller = kdTraveller;
    }

    /**
     * @return the Nama_Traveller
     */
    public String getNamaTraveller() {
        return namaTraveller;
    }

    /**
     * @param namaTraveller the Nama_Traveller to set
     */
    public void setNamaTraveller(String namaTraveller) {
        this.namaTraveller = namaTraveller;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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

