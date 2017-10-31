/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Lenovo
 */
import DAO.DAOEvent;
import DAO.DAOPerjalanan;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Fadhil-PC
 */

//@WebServlet("/addEvent")
@WebServlet("/addEvent")
public class ControllerEvent extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)                  //doget:menampilkan
            throws ServletException, IOException {
        
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-event")){
            response.sendRedirect("/Login/Data/addEvent.jsp");
            return;
        }else if(proses.equals("edit-event")){
            response.sendRedirect("edit_event.jsp?kd_event="+request.getParameter("kd_event"));
            return;
        }else if(proses.equals("hapus-event")){
            DAOEvent ev=new DAOEvent();
            ev.setKdEvent(request.getParameter("kd_event"));
            ev.hapus();
            response.sendRedirect("indexEvent.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)                 //dopost: mengambil
            throws ServletException, IOException {
        
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        //SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh.mm");
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
        
        //===================================
        //    GET KODE TRANSPORTASI
        //===================================
        String kdTransportasiPublik,kdTransportasiPribadi;
        if(request.getParameter("jenis_moda").equalsIgnoreCase("umum")){
            kdTransportasiPribadi = null;
            kdTransportasiPublik = request.getParameter("kd_tranportasi_publik");
        }
        else{
            kdTransportasiPublik = null;
            kdTransportasiPribadi = request.getParameter("kd_tranportasi_pribadi");
            
        }
        //===================================
        //    GET KODE PERJALANAN
        //===================================
        DAOPerjalanan dPj = new DAOPerjalanan();
        
        String kdPerjalanan = dPj.getKdPerjalanan(request.getParameter("kd_lokasi_awal"),request.getParameter("kd_lokasi_akhir"),kdTransportasiPublik,kdTransportasiPribadi);
        if (data != null){
            if(data.equals("event")){
                DAOEvent ev = new DAOEvent();
                
                ev.setKdEvent(request.getParameter("kd_event"));
                ev.setNameEvent(request.getParameter("nama_event"));
                try {
                    ev.setStartTime(format.parse(request.getParameter("waktu_mulai")));
                    ev.setEndTime(format.parse(request.getParameter("waktu_selesai")));
                } catch (ParseException ex) {
                    response.sendRedirect("");
                }
                ev.setKdTraveller("TR0001");
                ev.setKdPerjalanan(kdPerjalanan);
                ev.setKeterangan(request.getParameter("keterangan"));
                
                if (proses.equals("input-event")){
                    try {
                        ev.setKdEvent(ev.getNewId());
                        ev.simpan();
                    } catch (SQLException ex) {
                      response.sendRedirect("tambah_event.jsp");
                    }
                }else if (proses.equals("update-event")){
                    ev.update();
                } else if(proses.equals("hapus-event")){
                    ev.hapus();
                }
                response.sendRedirect("indexEvent.jsp");
            }
        }
    }
}
