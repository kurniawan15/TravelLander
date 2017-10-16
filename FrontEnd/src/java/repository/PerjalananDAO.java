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
import model.ModaTransportasi;
import model.Perjalanan;
import repository.ModaTransportasiDAO;
/**
 *
 * @author Lenovo
 */
public class PerjalananDAO extends DAO{

    public PerjalananDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        super(jdbcURL, jdbcUsername, jdbcPassword);
    }
    
    public List<Perjalanan> listAll() throws SQLException {
        List<Perjalanan> listData = new ArrayList();
        String sql = "SELECT * FROM perjalanan";
        connect(); 
        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            String idPerjalanan = resultSet.getString("id_perjalanan");
            int waktuTempuh = resultSet.getInt("waktu_tempuh");
            int jarakTempuh = resultSet.getInt("jarak_tempuh");
            Lokasi lokasiAwal = new LokasiDAO(super.getJdbcURL(),super.getJdbcUsername(),super.getJdbcPassword()).getLocation(resultSet.getString("kd_lokasi_awal"));
            Lokasi lokasiAkhir = new LokasiDAO(super.getJdbcURL(),super.getJdbcUsername(),super.getJdbcPassword()).getLocation(resultSet.getString("kd_lokasi_awal"));
            ModaTransportasi modaTransportasi = ModaTransportasi(super.getJdbcURL(),super.getJdbcUsername(),super.getJdbcPassword()).getLocation(resultSet.getString("kd_lokasi_awal"));;
            Perjalanan per = new Perjalanan(idPerjalanan,waktuTempuh,jarakTempuh,lokasiAwal,lokasiAkhir,modaTransportasi);
            listData.add(per);
        } 
        resultSet.close();
        statement.close(); 
        disconnect(); 
        return listData;
    }
}
