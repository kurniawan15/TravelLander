/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelender;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dewi Roaza
 *         Mohammad Ridwan H D P
 */

public class Travelender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        User kartan = new User();
        
        List<Agenda> listAgenda = new ArrayList<Agenda>();
        
        Agenda agenda1 = new Agenda();
        
        agenda1.setNameAgenda("Rapat Kurikulum");
        agenda1.setNameLocation("DISDIK Kota");
        agenda1.setStartTime(Time.valueOf("08:00:00"));
        agenda1.setEndTime(Time.valueOf("10:00:00"));
        agenda1.setTransport("Mobil");
        
        listAgenda.add(agenda1);
        
        Agenda agenda2 = new Agenda();
        
        agenda2.setNameAgenda("Akreditasi SMA 1");
        agenda2.setNameLocation("SMA 1");
        agenda2.setStartTime(Time.valueOf("13:00:00"));
        agenda2.setEndTime(Time.valueOf("16:00:00"));
        agenda2.setTransport("Kereta");
        
        listAgenda.add(agenda2);
        
        Agenda agenda3 = new Agenda();
        
        agenda3.setNameAgenda("Ramah Tamah bersama Walikota");
        agenda3.setNameLocation("Pemkot");
        agenda3.setStartTime(Time.valueOf("18:30:00"));
        agenda3.setEndTime(Time.valueOf("20:00:00"));
        agenda3.setTransport("Mobil");
        
        listAgenda.add(agenda3);
        
        kartan.setListAgenda(listAgenda);
        
        kartan.printListAgenda();
    }    
}
