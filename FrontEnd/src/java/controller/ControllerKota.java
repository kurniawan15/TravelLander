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
import model.Kota;
import Database.KoneksiDB;
import DAO.DAOKota;

/**
 *
 * @author Fadhil-PC
 */

@WebServlet("/kota")
public class ControllerKota extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)                  //doget:menampilkan
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-kota")){
            response.sendRedirect("tambah_kota.jsp");
            return;
        }else if(proses.equals("edit-kota")){
            response.sendRedirect("edit_kota.jsp?id_kota="+request.getParameter("id_kota"));
            return;
        }else if(proses.equals("hapus-kota")){
            DAOKota hm=new DAOKota();
            hm.setIdKota(request.getParameter("id_kota"));
            hm.hapus();
            response.sendRedirect("");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)                 //dopost: mengambil
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("kota")){
                DAOKota um=new DAOKota();
                um.setIdKota(request.getParameter("id_kota"));
                um.setNamaKota(request.getParameter("nama_kota"));
                um.setIdProvinsi(request.getParameter("id_provinsi"));
                if (proses.equals("input-kota")){
                    um.simpan();
                }else if (proses.equals("update-kota")){
                    um.update();
                } else if(proses.equals("hapus-kota")){
                    um.hapus();
                }
                response.sendRedirect("");
            }
        }
    }
}
