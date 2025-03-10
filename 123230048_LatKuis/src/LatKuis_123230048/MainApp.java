/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LatKuis_123230048;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Kelas utama untuk JFrame
public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginFrame());
    }
}

// Kelas untuk tampilan login
class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel statusLabel;
    
    public LoginFrame() {
        setTitle("Login - PT UKANG");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 5, 5));
        
        JLabel userLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        loginButton = new JButton("Masuk");
        statusLabel = new JLabel("", SwingConstants.CENTER);
        
        add(userLabel);
        add(usernameField);
        add(passLabel);
        add(passwordField);
        add(new JLabel());
        add(loginButton);
        add(statusLabel);
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                User user = new User("123"); // Ganti sesuai NIM terakhir
                
                if (user.login(username, password)) {
                    dispose(); // Tutup jendela login
                    new TriangleFrame(); // Buka frame kalkulator
                } else {
                    statusLabel.setText("Login gagal! Coba lagi.");
                    statusLabel.setForeground(Color.RED);
                }
            }
        });
        
        setVisible(true);
    }
}

// Kelas User untuk menangani login
class User {
    private String username;
    private String password;
    
    public User(String nimSuffix) {
        this.username = "tukang_" + nimSuffix;
        this.password = "tukang_" + nimSuffix;
    }
    
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }
}

// Kelas untuk tampilan perhitungan segitiga siku-siku
class TriangleFrame extends JFrame {
    private JTextField baseField;
    private JTextField heightField;
    private JButton calculateButton;
    private JLabel resultLabel;
    
    public TriangleFrame() {
        setTitle("Hitung Sisi Miring - PT UKANG");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 5, 5));
        
        JLabel baseLabel = new JLabel("Alas:");
        baseField = new JTextField();
        JLabel heightLabel = new JLabel("Tinggi:");
        heightField = new JTextField();
        calculateButton = new JButton("Hitung");
        resultLabel = new JLabel("", SwingConstants.CENTER);
        
        add(baseLabel);
        add(baseField);
        add(heightLabel);
        add(heightField);
        add(new JLabel());
        add(calculateButton);
        add(resultLabel);
        
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double base = Double.parseDouble(baseField.getText());
                    double height = Double.parseDouble(heightField.getText());
                    double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
                    resultLabel.setText("Sisi miring: " + String.format("%.5f", hypotenuse));
                    resultLabel.setForeground(Color.BLUE);
                } catch (Exception ex) {
                    resultLabel.setText("Input tidak valid!");
                    resultLabel.setForeground(Color.RED);
                }
            }
        });
        
        setVisible(true);
    }
}
