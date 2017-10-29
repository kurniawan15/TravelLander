/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Lenovo
 */
import DAO.DAOEvent;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Kota;
import Database.KoneksiDB;
import DAO.DAOKota;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fadhil-PC
 */

@WebServlet("/addEvent")
public class ControllerEvent extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)                  //doget:menampilkan
            throws ServletException, IOException {
        
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-event")){
            response.sendRedirect("tambah_event.jsp");
            return;
        }else if(proses.equals("edit-event")){
            response.sendRedirect("edit_event.jsp?id_event="+request.getParameter("id_event"));
            return;
        }else if(proses.equals("hapus-event")){
            DAOEvent ev=new DAOEvent();
            ev.setIdEvent(request.getParameter("id_event"));
            ev.hapus();
            response.sendRedirect("");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)                 //dopost: mengambil
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("event")){
                DAOEvent ev = new DAOEvent();
                ev.setIdEvent(request.getParameter("id_event"));
                ev.setNameEvent(request.getParameter("nama_event"));
//                ev.setStartTime(request.getParameter("waktu_mulai"));
//                ev.setEndTime(request.getParameter("waktu_selesai"));
                ev.setKdTraveller(request.getParameter("kd_traveller"));
                ev.setIdPerjalanan(request.getParameter("id_perjalanan"));
                ev.setKeterangan(request.getParameter("keterangan"));
                if (proses.equals("input-kota")){
                    try {
                        ev.setIdEvent(ev.getNewId());
                        ev.simpan();
                    } catch (SQLException ex) {
                        Logger.getLogger(ControllerEvent.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if (proses.equals("update-kota")){
                    ev.update();
                } else if(proses.equals("hapus-kota")){
                    ev.hapus();
                }
                response.sendRedirect("");
            }
        }
    }
}
