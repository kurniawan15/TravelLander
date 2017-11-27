/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAONewEvent;
import model.NewLokasi;
import java.io.IOException;
import static java.lang.String.format;
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
            ev.setIdEvent(request.getParameter("Id_Event"));
            ev.hapus();
            response.sendRedirect("indexEvent.jsp");
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
                ev.setIdEvent(request.getParameter("Id_Event"));
                ev.setKdTraveller(request.getParameter("Kd_Traveller"));
                ev.setKdTransportasiTidakTerjadwal(request.getParameter("Kd_Transportasi_Tidak_Terjadwal"));
                ev.setKdTransportasiTerjadwal(request.getParameter("Kd_Transportasi_Terjadwal"));
                ev.setNamaEvent(request.getParameter("nama_Event"));
                try {
                    ev.setWaktuMulai(format.parse(request.getParameter("Waktu_Mulai")));
                    ev.setWaktuSelesai(format.parse(request.getParameter("Waktu_Selesai")));
                } catch (ParseException ex) {
                    response.sendRedirect("");
                }
                ev.setKet(request.getParameter("Keterangan"));
                
//                DAONewLokasi lok = new DAONewLokasi();
                NewLokasi lokAwal = new NewLokasi();
                lokAwal.setIdEvent(request.getParameter("Id_Event"));
                lokAwal.setNamaLokasi(request.getParameter("nama_lokasi_awal"));
                lokAwal.setLatitude(request.getParameter("latitude_awal"));
                lokAwal.setLongitute(request.getParameter("latitude_awal"));
                lokAwal.setAlamat(request.getParameter("alamat_awal"));
                lokAwal.setKet("START");
                
                NewLokasi lokAkhir = new NewLokasi();
                lokAwal.setIdEvent(request.getParameter("Id_Event"));
                lokAwal.setNamaLokasi(request.getParameter("nama_lokasi_akhir"));
                lokAwal.setLatitude(request.getParameter("latitude_akhir"));
                lokAwal.setLongitute(request.getParameter("latitude_akhir"));
                lokAwal.setAlamat(request.getParameter("alamat_akhir"));
                lokAwal.setKet("END");
                
                if (proses.equals("input-event")){
                    try {
                        ev.setIdEvent(ev.getNewId());
                        ev.simpan();
//                        lokAwal.simpan();
//                        lokAkhir.simpan();
                    } catch (SQLException ex) {
                      response.sendRedirect("tambah_event.jsp");
                    }
                }else if (proses.equals("update-event")){
                    ev.update();
                } else if(proses.equals("hapus-event")){
                    ev.hapus();
                }
                response.sendRedirect("Login/Data/listData.jsp");
            }
        }
    }
}
