/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOJarak;
import DAO.DAOLokasi;
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
 * @author Dewi Roaza
 */
@WebServlet("/jarak")
public class ControllerJarak extends HttpServlet{
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)                  //doget:menampilkan
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-jarak")){
            response.sendRedirect("tambah_jarak.jsp");
            return;
        }else if(proses.equals("edit-jarak")){
            response.sendRedirect("edit_jarak.jsp?Kd_Jarak="+request.getParameter("Kd_Jarak"));
            return;
        }else if(proses.equals("hapus-jarak")){
            DAOJarak hm=new DAOJarak();
            hm.setKdJarak(request.getParameter("Kd_Jarak"));
            hm.hapus();
            response.sendRedirect("indexJarak.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)                 //dopost: mengambil
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("jarak")){
                DAOJarak um=new DAOJarak();
                um.setKdJarak(request.getParameter("Kd_Jarak"));
                um.setKdLokasiAwal(request.getParameter("Kd_Lokasi_Awal"));
                um.setKdLokasiAkhir(request.getParameter("Kd_Lokasi_Akhir"));
                um.setJarak(Integer.parseInt(request.getParameter("Jarak")));
                if (proses.equals("input-jarak")){
                    try {
                        um.setKdJarak(um.getNewId());
                        um.simpan();
                    } catch (SQLException ex) {
                        Logger.getLogger(ControllerJarak.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if (proses.equals("update-jarak")){
                    um.update();
                } else if(proses.equals("hapus-jarak")){
                    um.setKdJarak(request.getParameter("Kd_Jarak"));
                    um.hapus();
                }
                response.sendRedirect("indexJarak.jsp");
            }
        }
    }
}
