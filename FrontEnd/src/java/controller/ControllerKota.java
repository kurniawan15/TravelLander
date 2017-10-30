/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import DAO.DAOKota;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            DAOKota dkt=new DAOKota();
            dkt.setIdKota(request.getParameter("id_kota"));
            dkt.hapus();
            response.sendRedirect("indexKota.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)                 //dopost: mengambil
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("kota")){
                DAOKota kt=new DAOKota();
                kt.setIdKota(request.getParameter("id_kota"));
                kt.setNamaKota(request.getParameter("nama_kota"));
                kt.setIdProvinsi(request.getParameter("id_provinsi"));
                
                if (proses.equals("input-kota")){
                    try {
                        kt.setIdKota(kt.getNewId());
                        kt.simpan();
                    } catch (SQLException ex) {
                        response.sendRedirect("tambah_kota.jsp");
                    }
                }else if (proses.equals("update-kota")){
                    kt.update();
                } else if(proses.equals("hapus-kota")){
                    kt.hapus();
                }
                response.sendRedirect("indexKota.jsp");
            }
        }
    }
}
