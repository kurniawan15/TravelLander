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
import DAO.DAOLokasi;

/**
 *
 * @author Pegasus Cyber
 */

@WebServlet("/location")
public class NewControllerLokasi extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)                  //doget:menampilkan
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-lokasi")){
            response.sendRedirect("tambah_lokasi.jsp");
            return;
        }else if(proses.equals("edit-lokasi")){
            response.sendRedirect("edit_lokasi.jsp?idLokasi="+request.getParameter("idLokasi"));
            return;
        }else if(proses.equals("hapus-lokasi")){
            DAOLokasi dl=new DAOLokasi();
            dl.setIdLokasi(request.getParameter("idLokasi"));
            dl.hapus();
            response.sendRedirect("");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)                 //dopost: mengambil
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("lokasi")){
                DAOLokasi dlok=new DAOLokasi();
                dlok.setIdLokasi(request.getParameter("idLokasi"));
                dlok.setNamaLokasi(request.getParameter("nama_lokasi"));
                dlok.setAlamat(request.getParameter("alamat"));
                if (proses.equals("input-lokasi")){
                    dlok.simpan();
                }else if (proses.equals("update-lokasi")){
                    dlok.update();
                } else if(proses.equals("hapus-lokasi")){
                    dlok.hapus();
                }
                response.sendRedirect("");
            }
        }
    }

}
