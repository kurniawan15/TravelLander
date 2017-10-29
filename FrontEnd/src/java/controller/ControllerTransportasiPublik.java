/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOTransportasiPribadi;
import DAO.DAOTransportasiPublik;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dewi Roaza
 */

@WebServlet ("/transportasi_publik")
public class ControllerTransportasiPublik extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)                  //doget:menampilkan
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-moda-publik")){
            response.sendRedirect("tambah_moda_publik.jsp");
            return;
        }else if(proses.equals("edit-moda-publik")){
            response.sendRedirect("edit_moda_publik.jsp?Kd_Transportasi_Publik="+request.getParameter("Kd_Transportasi_Publik"));
            return;
        }else if(proses.equals("hapus-moda-transport")){
            DAOTransportasiPublik hm=new DAOTransportasiPublik();
            hm.setkdTansportasiPublik(request.getParameter("Kd_Transportasi_Publik"));
            hm.hapus();
            response.sendRedirect("");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)                 //dopost: mengambil
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("transportasi_publik")){
                DAOTransportasiPublik um=new DAOTransportasiPublik();
                um.setkdTansportasiPublik(request.getParameter("Kd_Transportasi_Publik"));
                um.setkdModa(request.getParameter("Kd_Moda"));
                um.setnamaTransportasiPublik(request.getParameter("Nama_Transportasi_Publik"));
                um.setwaktuBerangkat(request.getParameter("Waktu_Berangkat"));
                um.setwaktuDatang(request.getParameter("Waktu_Datang"));
                if (proses.equals("input-moda-publik")){
                    um.simpan();
                }else if (proses.equals("update-moda-publik")){
                    um.update();
                } else if(proses.equals("hapus-moda-publik")){
                    um.hapus();
                }
                response.sendRedirect("");
            }
        }
    }
}
