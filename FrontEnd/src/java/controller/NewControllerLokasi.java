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
import repository.KoneksiDB;

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
            Lokasi hm=new Lokasi();
            hm.setIdLokasi(request.getParameter("idLokasi"));
            hm.hapus();
            response.sendRedirect("");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)                 //dopost: mengambil
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("lokasi")){
                Lokasi um=new Lokasi();
                um.setIdLokasi(request.getParameter("idLokasi"));
                um.setNamaLokasi(request.getParameter("nama_lokasi"));
                um.setAlamat(request.getParameter("alamat"));
                if (proses.equals("input-lokasi")){
                    um.simpan();
                }else if (proses.equals("update-lokasi")){
                    um.update();
                } else if(proses.equals("hapus-lokasi")){
                    um.hapus();
                }
                response.sendRedirect("");
            }
        }
    }

}
