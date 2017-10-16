/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class LokasiDAO  extends DAO {

    public LokasiDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        super(jdbcURL, jdbcUsername, jdbcPassword);
    }

    
  public List<Lokasi> listAll() throws SQLException {
        List<Lokasi> listData = new ArrayList();
        String sql = "SELECT * FROM lokasi";
        connect(); 
        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            String kdLokasi = resultSet.getString("kd_lokasi");
            String namaLokasi = resultSet.getString("nama_lokasi"); 
            String alamat = resultSet.getString("alamat");
            Lokasi lokasi = new Lokasi(kdLokasi,namaLokasi,alamat);
            listData.add(lokasi);
        } 
        resultSet.close();
        statement.close(); 
        disconnect(); 
        return listData;
    }

    
    public Lokasi getLocation(String id) throws SQLException {
		Lokasi location = null;
		String sql = "SELECT * FROM lokasi WHERE locationId = ?"; 
		connect(); 
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, id); 
		ResultSet resultSet = statement.executeQuery(); 
		if (resultSet.next()) {
			String locationName = resultSet.getString("locationName");
                        String address = resultSet.getString("address"); 
			location = new Lokasi(id, locationName,address);
		} 
		resultSet.close();
		statement.close(); 
		return location;
	}
    
      public boolean insert(Lokasi location) throws SQLException {
        String sql = "INSERT INTO location(locationName, address,description) VALUES (?, ?, ?)";
        connect(); 
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, location.getNamaLokasi());
        statement.setString(2, location.getAlamat()); 
        statement.setString(3, ""); 
        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }

}
