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
    
    public String kd_Traveller;
    public String nama_Traveller;
    public String username;
    public String password; 
    public String email;

    /**
     * @return the Kd_Traveller
     */
    public String getKd_Traveller() {
        return kd_Traveller;
    }

    /**
     * @param kd_Traveller the Kd_Traveller to set
     */
    public void setKd_Traveller(String kd_Traveller) {
        this.kd_Traveller = kd_Traveller;
    }

    /**
     * @return the Nama_Traveller
     */
    public String getNama_Traveller() {
        return nama_Traveller;
    }

    /**
     * @param nama_Traveller the Nama_Traveller to set
     */
    public void setNama_Traveller(String nama_Traveller) {
        this.nama_Traveller = nama_Traveller;
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

