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
        if (proses.equals("input-traveller")){
            response.sendRedirect("tambah_traveller.jsp");
            return;
        }else if(proses.equals("edit-traveller")){
            response.sendRedirect("edit_traveller.jsp?Kd_Traveller="+request.getParameter("Kd_Traveller"));
            return;
        }else if(proses.equals("hapus-traveller")){
            DAOTraveller hm=new DAOTraveller();
            hm.setKd_Traveller(request.getParameter("Kd_Traveller"));
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
                um.setKd_Traveller(request.getParameter("Kd_Traveller"));
                um.setNama_Traveller(request.getParameter("Nama_Traveller"));
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
                response.sendRedirect("indexTraveller.jsp");
            }
        }
    }
}
