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
import model.Lokasi;
import Database.KoneksiDB;
import DAO.DAOProvinsi;

/**
 *
 * @author Pegasus Cyber
 */
@WebServlet(name = "provinsi", urlPatterns = {"/provinsi"})

public class ControllerProvinsi extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)                  //doget:menampilkan
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-provinsi")){
            response.sendRedirect("tambah_provinsi.jsp");
            return;
        }else if(proses.equals("edit-provinsi")){
            response.sendRedirect("edit_provinsi.jsp?id_provinsi="+request.getParameter("id_provinsi"));
            return;
        }else if(proses.equals("hapus-provinsi")){
            DAOProvinsi dl=new DAOProvinsi();
            dl.setIdProvinsi(request.getParameter("id_provinsi"));
            dl.hapus();
            response.sendRedirect("");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)                 //dopost: mengambil
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("provinsi")){
                DAOProvinsi dprov=new DAOProvinsi();
                dprov.setIdProvinsi(request.getParameter("id_provinsi"));
                dprov.setNamaProvinsi(request.getParameter("nama_provinsi"));
                dprov.setIbuKota(request.getParameter("ibu_kota"));
                
                if (proses.equals("input-provinsi")){
                    dprov.simpan();
                }else if (proses.equals("update-provinsi")){
                    dprov.update();
                } else if(proses.equals("hapus-provinsi")){
                    dprov.hapus();
                }
            response.sendRedirect("");
            }
        }
    }

}
