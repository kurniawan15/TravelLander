/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOJarak;
import DAO.DAOLokasi;
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
            response.sendRedirect("edit_jarak.jsp?kdJarak="+request.getParameter("kdJarak"));
            return;
        }else if(proses.equals("hapus-jarak")){
            DAOJarak hm=new DAOJarak();
            hm.setkdJarak(request.getParameter("kdJarak"));
            hm.hapus();
            response.sendRedirect("");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)                 //dopost: mengambil
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("jarak")){
                DAOJarak um=new DAOJarak();
                um.setkdJarak(request.getParameter("Kd_jarak"));
                um.setkdLokasiAwal(request.getParameter("Kd_Lokasi_Awal"));
                um.setkdLokasiAkhir(request.getParameter("Kd_Lokasi_Akhir"));
                um.setjarak(request.getParameter("Jarak"));
                if (proses.equals("input-jarak")){
                    um.simpan();
                }else if (proses.equals("update-jarak")){
                    um.update();
                } else if(proses.equals("hapus-jarak")){
                    um.hapus();
                }
                response.sendRedirect("");
            }
        }
    }
}
