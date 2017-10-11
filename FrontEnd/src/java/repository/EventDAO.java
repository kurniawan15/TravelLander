/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Event;
import model.Lokasi;

/**
 *
 * @author Zulkifli Arsyad
 */
public class EventDAO extends DAO {

    public EventDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        super(jdbcURL, jdbcUsername, jdbcPassword);
    }
 
    public List<Event> listAllEvent() throws SQLException {
        List<Event> listEvent = new ArrayList();
        String sql = "SELECT * FROM events";
        connect();

        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int id = resultSet.getInt("eventId");
            String eventName = resultSet.getString("eventName");
            Date arrivalTime = resultSet.getDate("arrivalTime");
            Date departureTime = resultSet.getDate("departureTime");
         //   int state = resultSet.getInt("state");
         //   Date createdDate = resultSet.getDate("createdDate");
         //   String createdUser = resultSet.getString("createdUser");
            Integer location = resultSet.getInt("location");
      //      String transfort = resultSet.getString("transfortatin");
            Event events = new Event(id, eventName, arrivalTime, departureTime,location);
            listEvent.add(events);
        }

        resultSet.close();
        statement.close();

        disconnect();

        return listEvent;
    }

}
