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
import java.util.List;
import model.Lokasi;

/**
 *
 * @author Lenovo
 */
public class PerjalananDAO extends DAO{

    public PerjalananDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        super(jdbcURL, jdbcUsername, jdbcPassword);
    }
    
    public List<Perjalanan> listAll() throws SQLException {
        List<Lokasi> listData = new ArrayList();
        String sql = "SELECT * FROM perjalanan";
        connect(); 
        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            String idPerjalanan;
            int waktuTempuh;
            int jarakTempuh;
            String kdLokasiAwal;
            String kdLokasiAkhir;
            String kdModa;
            Perjalanan per = new Perjalanan();
            listData.add(locations);
        } 
        resultSet.close();
        statement.close(); 
        disconnect(); 
        return listData;
    }
}
