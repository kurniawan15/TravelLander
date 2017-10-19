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

/**
 *
 * @author Dewi Roaza
 */
public class ModaTransportasiDAO extends DAO {
    
    public ModaTransportasiDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        super(jdbcURL, jdbcUsername, jdbcPassword);
    }
    
    public List<ModaTransportasi> listAll() throws SQLException {
        List<ModaTransportasi> listData =new ArrayList();
        String sql = "SELECT * FROM moda_transportasi";
        connect();
        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        
        while (resultSet.next()) {
            String kd = resultSet.getString("kd_moda");
            String tipeModa = resultSet.getString("tipe_moda");
//            ModaTransportasi moda_transportasi = new ModaTransportasi(kd, tipeModa);
//            listData.add(moda_transportasi);
        } 
        resultSet.close();
        statement.close(); 
        disconnect(); 
        return listData;
    }
    
    public ModaTransportasi getModaTransportasi(String kd) throws SQLException {
		ModaTransportasi moda = null;
		String sql = "SELECT * FROM moda_transportasi WHERE kd_moda = ?"; 
		connect(); 
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, kd); 
		ResultSet resultSet = statement.executeQuery(); 
		if (resultSet.next()) {
			String kdModa = resultSet.getString("kd_moda");
                        String tipeModa = resultSet.getString("tipe_moda"); 
//			moda = new ModaTransportasi(kdModa,tipeModa);
		} 
		resultSet.close();
		statement.close(); 
		return moda;
	}
    
      public boolean insert(ModaTransportasi modaTransportasi) throws SQLException {
        String sql = "INSERT INTO moda_transportasi(kd_moda, tipe_moda,nama_moda) VALUES (?, ?,'')";
        connect(); 
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
//        statement.setString(1, modaTransportasi.getKdModa());
//        statement.setString(2, modaTransportasi.getTipeModa()); 
        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }
      
      public String getNewKodeModa() throws SQLException{
            String kdModa = "KM00";
            int cnt;
            String sql = "SELECT MAX(kd_moda) FROM moda_transportasi"; 
            
            connect();
            Statement statement = jdbcConnection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                kdModa = resultSet.getString(1);
            } 
            
            cnt = Integer.parseInt(kdModa.substring(3));
            cnt++;
            if(cnt < 10){
                kdModa = "KMT0" + String.valueOf(cnt);
            }
            else{
                kdModa = "KMT" + String.valueOf(cnt);
            }
            
            
            resultSet.close();
            statement.close(); 
            disconnect(); 
            return kdModa;
         }
    
}
