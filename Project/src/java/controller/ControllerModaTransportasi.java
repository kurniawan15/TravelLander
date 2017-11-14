/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOModaTransportasi;
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

@WebServlet ("/moda_transportasi")
public class ControllerModaTransportasi extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)                  //doget:menampilkan
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-moda")){
            response.sendRedirect("tambah_modaTransportasi.jsp");
            return;
        }else if(proses.equals("edit-moda")){
            response.sendRedirect("edit_moda.jsp?Kd_Moda="+request.getParameter("Kd_Moda"));
            return;
        }else if(proses.equals("hapus-moda")){
            DAOModaTransportasi hm=new DAOModaTransportasi();
            hm.setIdModa(request.getParameter("Kd_Moda"));
            hm.hapus();
            response.sendRedirect("indexModaTransportasi.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)                 //dopost: mengambil
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("moda_transportasi")){
                DAOModaTransportasi um=new DAOModaTransportasi();
                um.setIdModa(request.getParameter("Id_Moda"));
                um.setTipeModa(request.getParameter("Tipe_Moda"));
                if (proses.equals("input-moda")){
                    um.simpan();
                }else if (proses.equals("update-moda")){
                    um.update();
                } else if(proses.equals("hapus-moda")){
                    um.hapus();
                }
                response.sendRedirect("indexModaTransportasi.jsp");
            }
        }
    }
}
