/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOPerjalanan;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fajar Panca
 */
@WebServlet("/kota")
public class ControllerPerjalanan extends HttpServlet{
     protected void doGet(HttpServletRequest request, HttpServletResponse response)                  //doget:menampilkan
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-perjalanan")){
            response.sendRedirect("tambah_moda_pribadi.jsp");
            return;
        }else if(proses.equals("edit-perjalanan")){
            response.sendRedirect("edit_pejalanan.jsp?id_perjalanan="+request.getParameter("id_perjalanan"));
            return;
        }else if(proses.equals("hapus-perjalanan")){
            DAOPerjalanan hm=new DAOPerjalanan();
            hm.setIdPerjalanan(request.getParameter("id_perjalanan"));
            hm.hapus();
            response.sendRedirect("");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)                 //dopost: mengambil
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("perjalanan")){
                DAOPerjalanan um=new DAOPerjalanan();
                um.setIdPerjalanan(request.getParameter("id_perjalanan"));
                um.setkdTransportasiPublik(request.getParameter("Kd_Transport_Publik"));
                um.setkdJarak(request.getParameter("Kd_Jarak"));
                um.setkdTransportasiPribadi(request.getParameter("Kd_Transportasi_Pribadi"));
                um.setwaktuTempuh(request.getParameter("Waktu_tempuh"));
                if (proses.equals("input-perjalanan")){
                    um.simpan();
                }else if (proses.equals("update-perjalanan")){
                    um.update();
                } else if(proses.equals("hapus-perjalanan")){
                    um.hapus();
                }
                response.sendRedirect("");
            }
        }
    }
}
