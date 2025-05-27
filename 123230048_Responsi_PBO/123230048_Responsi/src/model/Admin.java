/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class Admin {
    private String username = "admin";
    private String password = "admin123";
    
    public boolean login(String user, String pass) {
        return username.equals(user) && password.equals(pass);
    }
}
