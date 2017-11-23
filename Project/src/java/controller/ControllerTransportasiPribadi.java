/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOTransportasiPribadi;
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
@WebServlet ("/transportasi_pribadi")
public class ControllerTransportasiPribadi extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)                  //doget:menampilkan
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-moda-pribadi")){
            response.sendRedirect("tambah_moda_pribadi.jsp");
            return;
        }else if(proses.equals("edit-moda-pribadi")){
            response.sendRedirect("edit_moda_pribad.jsp?Kd_Transportasi_Pribadi="+request.getParameter("Kd_Transportasi_Pribadi"));
            return;
        }else if(proses.equals("hapus-moda-transport")){
            DAOTransportasiPribadi hm=new DAOTransportasiPribadi();
            hm.setKdTansportasiPribadi(request.getParameter("Kd_Transportasi_Pribadi"));
            hm.hapus();
            response.sendRedirect("indexTransportasiPribadi.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)                 //dopost: mengambil
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("transportasi_pribadi")){
                DAOTransportasiPribadi um=new DAOTransportasiPribadi();
                um.setKdTansportasiPribadi(request.getParameter("Kd_Transportasi_Pribadi"));
                um.setKdModa(request.getParameter("Kd_Moda"));
                um.setNamaTransportasiPribadi(request.getParameter("Nama_Transportasi_Pribadi"));
                if (proses.equals("input-moda-pribadi")){
                    um.simpan();
                }else if (proses.equals("update-moda-pribadi")){
                    um.update();
                } else if(proses.equals("hapus-moda-pribadi")){
                    um.hapus();
                }
                response.sendRedirect("indexTransportasiPribadi.jsp");
            }
        }
    }
}
