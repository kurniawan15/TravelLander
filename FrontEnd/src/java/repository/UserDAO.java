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
import model.User;


/**
 *
 * @author Delvin
 */
public class UserDAO extends DAO{

    public UserDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        super(jdbcURL, jdbcUsername, jdbcPassword);
    }
    
    public boolean insert(User user) throws SQLException {
        String sql = "INSERT INTO user(id_user, nama_user, username, email, password) VALUES (?, ?, ?, ?, ?)";
        connect(); 
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, user.getIdUser());
        statement.setString(2, user.getNameUser());
        statement.setString(3, user.getUsername());
        statement.setString(4, user.getEmail());
        statement.setString(5, user.getPassword());
        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }
      
      public String getNewIdUser() throws SQLException{
            String idUser = "TR0000";
            int cnt;
            String sql = "SELECT MAX(id_user) FROM user"; 
            
            connect();
            Statement statement = jdbcConnection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                idUser = resultSet.getString(1);
            } 
            
            cnt = Integer.parseInt(idUser.substring(2));
            cnt++;
            if(cnt >= 1000){
                idUser = "TR" + String.valueOf(cnt);
            }
            else if(cnt <1000 && cnt >=100){
                idUser = "TR0" + String.valueOf(cnt);
            }else if(cnt <100 && cnt>=10){
                idUser = "TR00" + String.valueOf(cnt);
            }else{
                idUser = "TR000" + String.valueOf(cnt);
            }
            
            
            resultSet.close();
            statement.close(); 
            disconnect(); 
            return idUser;
         }
    
}
