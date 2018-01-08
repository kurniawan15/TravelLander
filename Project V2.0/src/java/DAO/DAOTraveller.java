/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Traveller;
import Database.KoneksiDB;
import java.sql.SQLException;


/**
 *
 * @author Fadhil-PC
 */
public class DAOTraveller extends Traveller implements DAO {
    
    KoneksiDB db = null;


public DAOTraveller(){
     db = new KoneksiDB();
}

 public Traveller cekLogin(String username, String password)
        throws Exception {
        boolean isUser = false;       
        ResultSet rs = null;      
        Traveller t = null;
        try {
           // Connection con = DBConnection.getConnection();
            String sql = ("select * from traveller where USERNAME='" + username + "' and PASSWORD='" + password + "'");
            rs = db.ambilData(sql);
            if (rs.next()) {
                isUser = true;
                t = new Traveller();
                t.setEmail(rs.getString("email"));
                t.setNamaTraveller(rs.getString("nama_traveller"));
                t.setKdTraveller(rs.getString("kd_traveller"));
                System.out.println("User authenticated successfully");
            } else {
                t = null;
                System.out.println("Invalid username or password!");
            }
        } catch (SQLException e) {
            System.out.println("DB related Error");
        }
        return t;
    }

    public void simpan(){
        String sql = "INSERT into traveller( Kd_Traveller, Nama_Traveller, Username, Password, Email) values ('" + kdTraveller + "','" + namaTraveller + "','" + username + "','" + password + "','" + email + "')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE traveller SET Nama_Traveller='"+namaTraveller+"', Username='"+username+"', Password='"+password+"', Email='"+email+"' WHERE Kd_Traveller='"+ kdTraveller +"' ";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM traveller WHERE Kd_Traveller='"+kdTraveller+"'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<Traveller> data = new ArrayList<Traveller>();
        ResultSet rs = null;

        try {
            String sql = "select * from traveller order by Kd_Traveller asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Traveller um = new Traveller();
                um.setKdTraveller(rs.getString("Kd_Traveller"));
                um.setNamaTraveller(rs.getString("Nama_Traveller"));
                um.setUsername(rs.getString("Username"));
                um.setPassword(rs.getString("Password"));
                um.setEmail(rs.getString("Email"));
                data.add(um);
   }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
        public List cariID() {
        List<Traveller> data = new ArrayList<Traveller>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM traveller WHERE Kd_Traveller='"+kdTraveller+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Traveller m = new Traveller();
                m.setKdTraveller(rs.getString("Kd_Traveller"));
                m.setNamaTraveller(rs.getString("Nama_Traveller"));
                m.setUsername(rs.getString("Username"));
                m.setPassword(rs.getString("Password"));
                m.setEmail(rs.getString("Email"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;

    }
        
        
        public String getNewId() throws SQLException{
            
            String kdTraveller = "TR0000";
            
            int cnt = 0;
            String sql = "SELECT MAX(KD_TRAVELLER) FROM traveller"; 
            
            ResultSet resultSet = db.ambilData(sql);

            while (resultSet.next()) {
                kdTraveller = resultSet.getString(1);
            } 
            
            cnt = Integer.parseInt(kdTraveller.substring(2));
            cnt++;
            if(cnt >= 1000){
                kdTraveller = "TR" + String.valueOf(cnt);
            }
            else if(cnt < 1000 && cnt >= 100){
               kdTraveller = "TR" + "0" + String.valueOf(cnt);
            }
            else if(cnt < 100 && cnt >= 10){
               kdTraveller = "TR" + "00" + String.valueOf(cnt);
            }
            else{
               kdTraveller = "TR" + "000" + String.valueOf(cnt);
            }
            db.diskonek(resultSet);
            return kdTraveller;
         }
}
