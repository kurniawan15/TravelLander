/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Lokasi; 
import repository.LokasiDAO;

/**
 *
 * @author Zulkifli Arsyad
 */
@WebServlet("/location")
public class LocationController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private LokasiDAO locationDAO;

    @Override
    public void init() {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword"); 
        locationDAO = new LokasiDAO(jdbcURL, jdbcUsername, jdbcPassword);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        String act = request.getParameter("act");
        try {
            if ("new".equals(act)) {
                showNewForm(request, response);
            } else {
                listLocation(request, response);
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        } catch (ParseException ex) {
            Logger.getLogger(LocationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            save(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LocationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void listLocation(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException,  ParseException {

        List<Lokasi> listLocation = locationDAO.listAll();
        request.setAttribute("data", listLocation);
        request.setAttribute("title", "Daftar Lokasi");
        RequestDispatcher dispatcher = request.getRequestDispatcher("location.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          request.setAttribute("title", "Tambah Lokasi");
        RequestDispatcher dispatcher = request.getRequestDispatcher("locationForm.jsp");
        dispatcher.forward(request, response);
    }

    private void save(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String locationName = request.getParameter("locationName");
        String address = request.getParameter("address");
        Lokasi newLocation = new Lokasi(locationName, address);
        locationDAO.insert(newLocation);
        response.sendRedirect("location");
    }

}
