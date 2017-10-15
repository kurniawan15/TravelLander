/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Event;
import model.Lokasi;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
import repository.EventDAO;
import repository.LocationDAO;

/**
 *
 * @author Zulkifli Arsyad
 */
@WebServlet("/event")
public class EventController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private EventDAO eventDAO;
    private LocationDAO locationDAO;

    @Override
    public void init() {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL"); 
        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername"); 
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword"); 
//        String jdbcURL = "jdbc:mysql://localhost:3306/travlendar";
//        String jdbcUsername = "root";
//        String jdbcPassword = "";
        eventDAO = new EventDAO(jdbcURL, jdbcUsername, jdbcPassword);
        locationDAO = new LocationDAO(jdbcURL, jdbcUsername, jdbcPassword);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        try {
            listEvent(request, response);
        } catch (SQLException ex) {
            throw new ServletException(ex);
      //  } catch (JSONException ex) {
      //      Logger.getLogger(EventController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(EventController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void listEvent(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException, ParseException {
   
        List<Event> listEvent = eventDAO.listAllEvent(); 
 
        
//        JSONArray array = new JSONArray();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        
        for (int i = 0; i < listEvent.size(); i++) {
            Lokasi locations =   locationDAO.getLocation(listEvent.get(i).getLokasi());
//            JSONObject json = new JSONObject();
//            json.put("title", listEvent.get(i).getEventName());
//            json.put("start", sdf.format(listEvent.get(i).getDepartureTime()));
//            json.put("end", sdf.format(listEvent.get(i).getArrivalTime()));
//            json.put("location",locations.getLocationName());
//            json.put("backgroundColor", "#0073b7");
//            array.put(json); 
        }
        
 //       String jsonEvent = array.toString().replaceAll("\\[(.*?)\\]", "$1"); 
       
        
        
        
        
        request.setAttribute("listEvent", listEvent);
 //       request.setAttribute("listEventJson", jsonEvent);
        request.setAttribute("module", "dashboard");
        request.setAttribute("content", "calendar");
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

}
