/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionEvent;
import model.Traveller;
import Database.KoneksiDB;
import DAO.DAOTraveller;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.Session;

/**
 *
 * @author Pegasus Cyber
 */
@WebServlet("/traveller")
public class ControllerTraveller extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) //doget:menampilkan
            throws ServletException, IOException {
        String proses = request.getParameter("proses");
        String action = request.getParameter("action");
     
        if (proses.equals("input-traveller")) {
        //    response.sendRedirect("tambah_traveller.jsp");
            return;
        } else if (proses.equals("edit-traveller")) {
        //    response.sendRedirect("edit_traveller.jsp?Kd_Traveller=" + request.getParameter("Kd_Traveller"));
            return;
        } else if (proses.equals("hapus-traveller")) {
            DAOTraveller hm = new DAOTraveller();
            hm.setKdTraveller(request.getParameter("Kd_Traveller"));
            hm.hapus();
            response.sendRedirect("indexTraveller.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) //dopost: mengambil
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");

        if (data != null) {
            if (data.equals("traveller")) {
               
                DAOTraveller dt = new DAOTraveller();
                dt.setKdTraveller(request.getParameter("KD_TRAVELLER"));
                dt.setNamaTraveller(request.getParameter("NAMA_TRAVELLER"));
                dt.setUsername(request.getParameter("USERNAME"));
                dt.setPassword(request.getParameter("PASSWORD"));
                dt.setEmail(request.getParameter("EMAIL"));
                if (proses.equals("input-traveller")) {
                    try {
                        String kd = dt.getNewId();
                        dt.setKdTraveller(kd);
                        dt.simpan();
                        response.sendRedirect("Login/Data/home.jsp");
                    } catch (SQLException ex) {
                        Logger.getLogger(ControllerTraveller.class.getName()).log(Level.SEVERE, null, ex);
                        response.sendRedirect("index.jsp");
                    }
                } else if (proses.equals("update-traveller")) {
                    dt.update();
                } else if (proses.equals("hapus-traveller")) {
                    dt.hapus();
                } else if (proses.equals("cek-traveller")) {
                    try {
                        Traveller t = dt.cekLogin(request.getParameter("USERNAME"), request.getParameter("PASSWORD"));
                        
                        if (t != null) {
                            System.out.println("Login sukses");
                            
                            request.getSession(false).invalidate();
                            request.getSession(true).setAttribute("USERNAME",t.getNamaTraveller());
                            request.getSession(true).setAttribute("KdTraveller",t.getKdTraveller());
                            response.sendRedirect("Login/Data/home.jsp");
                           
                        } else {
                            System.out.println("Login gagal");
                            response.sendRedirect("index.jsp");
                        }
                    } catch (Exception ex) {
                        System.out.println("ERROR LOGIN");
                        Logger.getLogger(ControllerTraveller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
}
