/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOPerjalanan;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fajar Panca
 */
@WebServlet("/perjalanan")
public class ControllerPerjalanan extends HttpServlet{
     protected void doGet(HttpServletRequest request, HttpServletResponse response)                  //doget:menampilkan
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-perjalanan")){
            response.sendRedirect("tambah_moda_pribadi.jsp");
            return;
        }else if(proses.equals("edit-perjalanan")){
            response.sendRedirect("edit_pejalanan.jsp?Kd_Perjalanan="+request.getParameter("Kd_Perjalanan"));
            return;
        }else if(proses.equals("hapus-perjalanan")){
            DAOPerjalanan hm=new DAOPerjalanan();
            hm.setKdPerjalanan(request.getParameter("Kd_Perjalanan"));
            hm.hapus();
            response.sendRedirect("indexPerjalanan.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)                 //dopost: mengambil
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("perjalanan")){
                DAOPerjalanan um=new DAOPerjalanan();
                um.setKdPerjalanan(request.getParameter("Kd_Perjalanan"));
                um.setKdTransportasiPublik(request.getParameter("Kd_Transport_Publik"));
                um.setKdJarak(request.getParameter("Kd_Jarak"));
                um.setKdTransportasiPribadi(request.getParameter("Kd_Transportasi_Pribadi"));
                um.setWaktuTempuh(Integer.parseInt(request.getParameter("Waktu_tempuh")));
                if (proses.equals("input-perjalanan")){
                    try{
                        um.setKdPerjalanan(um.getNewId());
                        um.simpan();
                    }catch (SQLException ex) {
                        Logger.getLogger(ControllerPerjalanan.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if (proses.equals("update-perjalanan")){
                    um.update();
                } else if(proses.equals("hapus-perjalanan")){
                    um.hapus();
                }
                response.sendRedirect("indexPerjalanan.jsp");
            }
        }
    }
}
