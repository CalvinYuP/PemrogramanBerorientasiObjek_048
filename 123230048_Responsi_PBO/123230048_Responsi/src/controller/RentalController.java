/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Admin;
import model.Penyewa;
import database.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;

public class RentalController {
    private Admin admin = new Admin();
    
    public boolean login(String usernamne, String password) {
        return admin.login(usernamne, password);
    }
    
    public void tambahPenyewa(Penyewa penyewa) {
        try(Connection conn = DatabaseConnection.connect()) {
            String query = "INSERT INTO sewa (id, nama, kontak, jenis_mobil, durasi, total_biaya, status_pembayaran) VALUES (?,?,?,?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, penyewa.getID());
                ps.setString(2, penyewa.getNama());
                ps.setString(3, penyewa.getKontak());
                ps.setString(4, penyewa.getJenisMobil());
                ps.setInt(5, penyewa.getDurasi());
                ps.setInt(6, penyewa.getTotalBiaya());
                ps.setString(7, penyewa.getStatusPembayaran());
                ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updatePenyewa(int id, Penyewa penyewa) {
        try(Connection conn = DatabaseConnection.connect()) {
            String query = "UPDATE sewa SET nama=?, kontak=?, jenis_mobil=?, durasi=?, total_biaya=?, status_pembayaran=? WHERE id=?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, penyewa.getID());
                ps.setString(2, penyewa.getNama());
                ps.setString(3, penyewa.getKontak());
                ps.setString(4, penyewa.getJenisMobil());
                ps.setInt(5, penyewa.getDurasi());
                ps.setInt(6, penyewa.getTotalBiaya());
                ps.setString(7, penyewa.getStatusPembayaran());
                ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deletePenyewa(int id) {
        try(Connection conn = DatabaseConnection.connect()) {
            String query = "DELETE FROM sewa WHERE id=?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, id);
                ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Object[]>getAllPenyewa() {
        ArrayList<Object[]>list = new ArrayList<>();
        try(Connection conn = DatabaseConnection.connect()) {
            String query = "SELECT * FROM sewa";
            ResultSet rs = conn.createStatement().executeQuery(query);
            while (rs.next()) {
                Object[] row = {
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getString("kontak"),
                    rs.getString("jenis_mobil"),
                    rs.getInt("durasi"),
                    rs.getInt("total_biaya"),
                    rs.getString("status_pembayaran")
                };
                list.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }    
    
}
