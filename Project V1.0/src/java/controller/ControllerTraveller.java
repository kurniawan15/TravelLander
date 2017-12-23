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
import model.Traveller;
import Database.KoneksiDB;
import DAO.DAOTraveller;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fadhil-PC
 */

@WebServlet("/traveller")
public class ControllerTraveller extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)                  //doget:menampilkan
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        DAOTraveller um=new DAOTraveller();
        
        if (proses.equals("input-traveller")){
            response.sendRedirect("tambah_traveller.jsp");
            return;
        }else if(proses.equals("edit-traveller")){
            response.sendRedirect("edit_traveller.jsp?Kd_Traveller="+request.getParameter("Kd_Traveller"));
            return;
        }else if(proses.equals("hapus-traveller")){
            DAOTraveller hm=new DAOTraveller();
            hm.setKdTraveller(request.getParameter("Kd_Traveller"));
            hm.hapus();
            response.sendRedirect("indexTraveller.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)                 //dopost: mengambil
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("traveller")){
                DAOTraveller um=new DAOTraveller();
                um.setKdTraveller(request.getParameter("Kd_Traveller"));
                um.setNamaTraveller(request.getParameter("Nama_Traveller"));
                um.setUsername(request.getParameter("Username"));
                um.setPassword(request.getParameter("Password"));
                um.setEmail(request.getParameter("Email"));
                if (proses.equals("input-traveller")){
                    um.simpan();
                }else if (proses.equals("update-traveller")){
                    um.update();
                } else if(proses.equals("hapus-traveller")){
                    um.hapus();
                }
                else if( proses.equals("cek-traveller")){
                try {
                    boolean login = um.cekLogin(request.getParameter("user"), request.getParameter("pass"));
                    System.out.println(login);
                    if (login == true){
                    System.out.println("Login sukses");
                    response.sendRedirect("Login/Data/home.jsp");
                    }
                    else{
                        System.out.println("Login gagal");
                        response.sendRedirect("Login/login.jsp");
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
