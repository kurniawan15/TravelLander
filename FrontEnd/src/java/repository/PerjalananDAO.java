/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Lokasi;
import model.ModaTransportasi;
import model.Perjalanan;

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
            Lokasi lokasiAkhir = new LokasiDAO(super.getJdbcURL(),super.getJdbcUsername(),super.getJdbcPassword()).getLocation(resultSet.getString("kd_lokasi_akhir"));
            
            ModaTransportasi modaTransportasi = new ModaTransportasiDAO(super.getJdbcURL(),super.getJdbcUsername(),super.getJdbcPassword()).getModaTransportasi("kd_moda");
            Perjalanan per = new Perjalanan(idPerjalanan,waktuTempuh,jarakTempuh,lokasiAwal,lokasiAkhir,modaTransportasi);
            listData.add(per);
        } 
        resultSet.close();
        statement.close(); 
        disconnect(); 
        return listData;
    }
    
    public Perjalanan getPerjalanan(String kd) throws SQLException {
		Perjalanan per = null;
		String sql = "SELECT * FROM perjalanan WHERE id_perjalanan = ?"; 
		connect(); 
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		
                statement.setString(1, kd); 
		ResultSet resultSet = statement.executeQuery(); 
		if (resultSet.next()) {
			String idPerjalanan = resultSet.getString("kd_moda");
                        int waktuTempuh = resultSet.getInt("waktu_tempuh"); 
			int jarakTempuh = resultSet.getInt("jarak_tempuh");
                        Lokasi lokasiAwal = new LokasiDAO(super.getJdbcURL(),super.getJdbcUsername(),super.getJdbcPassword()).getLocation(resultSet.getString("kd_lokasi_awal"));
                        Lokasi lokasiAkhir = new LokasiDAO(super.getJdbcURL(),super.getJdbcUsername(),super.getJdbcPassword()).getLocation(resultSet.getString("kd_lokasi_akhir"));
                        ModaTransportasi transportasi = new ModaTransportasiDAO(super.getJdbcURL(),super.getJdbcUsername(),super.getJdbcPassword()).getModaTransportasi("kd_moda");
                        
                        per = new Perjalanan(idPerjalanan, jarakTempuh, waktuTempuh, lokasiAwal, lokasiAkhir, transportasi);                        
		} 
		resultSet.close();
		statement.close(); 
		return per;
	}
    
      public boolean insert(Perjalanan perjalanan) throws SQLException {
        String sql = "INSERT INTO perjalanan (id_perjalanan,waktu_tempuh,jarak_tempuh,kode_lokasi_awal,kode_lokasi_akhir,kd_moda) VALUES (?,?,?,?,?,?)";
        connect(); 
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1,perjalanan.getIdPerjalanan());
        statement.setInt(2,perjalanan.getWaktuTempuh());
        statement.setInt(3,perjalanan.getJarakTempuh());
        statement.setString(4,perjalanan.getLokasiAwal().getKdLokasi());
        statement.setString(5,perjalanan.getLokasiAkhir().getKdLokasi());
        statement.setString(6,perjalanan.getTransport().getKdModa());
        
        boolean rowInserted = statement.executeUpdate() > 0;
        
        statement.close();
        disconnect();
        return rowInserted;
    }
      
      public String getNewIdPerjalanan() throws SQLException{
            String idPerjalanan = "IDP0000";
            int cnt;
            String sql = "SELECT MAX(id_perjalanan) FROM perjalanan"; 
            
            connect();
            Statement statement = jdbcConnection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                idPerjalanan = resultSet.getString(1);
            } 
            
            cnt = Integer.parseInt(idPerjalanan.substring(3));
            cnt++;
            if(cnt >= 1000){
                idPerjalanan = "IDP" + String.valueOf(cnt);
            }
            else if(cnt < 1000 && cnt >= 100){
                idPerjalanan = "IDP0" + String.valueOf(cnt);
            }
            else if(cnt < 100 && cnt >= 10){
                idPerjalanan = "IDP00" + String.valueOf(cnt);
            }
            else{
                idPerjalanan = "IDP000" + String.valueOf(cnt);
            }
            
            
            resultSet.close();
            statement.close(); 
            disconnect(); 
            return idPerjalanan;
         }
}
