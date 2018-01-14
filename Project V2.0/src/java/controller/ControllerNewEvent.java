/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAONewEvent;
import DAO.DAONewLokasi;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dewi Roaza
 */
@WebServlet("/Event")
public class ControllerNewEvent extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)                  //doget:menampilkan
            throws ServletException, IOException {
        
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-event")){
            //response.sendRedirect("Login/Data/addEvent.jsp");
            return;
        }else if(proses.equals("edit-event")){
            response.sendRedirect("Login/Data/editEvent.jsp?Id_Event="+request.getParameter("Id_Event"));
            return;
        }else if(proses.equals("hapus-event")){
            DAONewEvent ev=new DAONewEvent();
            DAONewLokasi lok = new DAONewLokasi();
            ev.setKdEvent(request.getParameter("kd_event"));
            lok.setKdEvent(request.getParameter("kd_event"));
            lok.hapus();
            ev.hapus();
            response.sendRedirect("Login/Data/home.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)                 //dopost: mengambil
            throws ServletException, IOException {
        
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
       
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm");
        
        if (data != null){
            if(data.equals("event")){
                DAONewEvent ev = new DAONewEvent();
                String trans[] = request.getParameter("moda").split(",");
                String moda = trans[0];
                String toll = trans[1];
                
                ev.setKdTraveller(request.getSession(true).getAttribute("KdTraveller").toString());
                ev.setNamaEvent(request.getParameter("nama_event"));
                ev.setAvoidtolls(Integer.parseInt(toll));
                ev.setTravelMode(moda);
                ev.setKeterangan(request.getParameter("keterangan"));
                try {
                    ev.setWaktuMulai(format.parse(request.getParameter("waktu_mulai")));
                    ev.setWaktuSelesai(format.parse(request.getParameter("waktu_selesai")));
                } catch (ParseException ex) {
                    response.sendRedirect("");
                }
                
                String namaLokasiAwal[] = request.getParameter("from").split(",");
                String namaLokasiAkhir[] = request.getParameter("to").split(",");
                DAONewLokasi lokAwal = new DAONewLokasi();
                lokAwal.setNamaLokasi(namaLokasiAwal[0]);
                lokAwal.setLatitude(request.getParameter("latitude_awal"));
                lokAwal.setLongitude(request.getParameter("longitude_awal"));
                lokAwal.setAlamat(request.getParameter("from"));
                lokAwal.setKeterangan("AWAL");
                
                DAONewLokasi lokAkhir = new DAONewLokasi();
                lokAkhir.setNamaLokasi(namaLokasiAkhir[0]);
                lokAkhir.setLatitude(request.getParameter("latitude_akhir"));
                lokAkhir.setLongitude(request.getParameter("longitude_akhir"));
                lokAkhir.setAlamat(request.getParameter("to"));
                lokAkhir.setKeterangan("AKHIR");
                
                if (proses.equals("input-event")){
                    try {
                        String kd = ev.getNewId();
                        ev.setKdEvent(kd);
                        ev.simpan();
                        lokAwal.setKdEvent(kd);
                        lokAkhir.setKdEvent(kd);
                        lokAwal.simpan();
                        lokAkhir.simpan();
                        
                    } catch (SQLException ex) {
                      response.sendRedirect("addEvent.jsp");
                    }
                }else if (proses.equals("update-event")){
                    ev.update();
                } else if(proses.equals("hapus-event")){
                    ev.hapus();
                }
                response.sendRedirect("Login/Data/mylist.jsp");
            }
        }
    }
}
