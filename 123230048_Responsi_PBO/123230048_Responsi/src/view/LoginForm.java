/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.event.*;
import controller.RentalController;

public class LoginForm extends JFrame {
    private JTextField tfUsername;
    private JPasswordField pfPassword;
    private JButton btnLogin;
    
    public LoginForm() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        tfUsername = new JTextField();
        pfPassword = new JPasswordField();
        btnLogin = new JButton("Login");
        
        tfUsername.setBounds(80, 30, 120, 25);
        pfPassword.setBounds(80, 60, 120, 25);
        btnLogin.setBounds(100, 100, 80, 30);
        
        add(new JLabel("Username")).setBounds(10, 30, 70, 25);
        add(tfUsername);
        add(new JLabel("Password")).setBounds(10, 60, 70, 25);
        add(pfPassword);
        add(btnLogin);
        
        btnLogin.addActionListener(e-> {
            String user = tfUsername.getText();
            String pass = new String(pfPassword.getPassword());
            if(new RentalController().login(user, pass)) {
                new RentalForm().setVisible(true);
                this.dispose();
            } else {
            JOptionPane.showMessageDialog(this, "Login Gagal!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
    
}
