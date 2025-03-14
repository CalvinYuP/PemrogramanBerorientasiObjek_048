/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230048_kuis_prak.pbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoginPage extends JFrame implements ActionListener {
	JLabel usernameLabel = new JLabel("Username: ");
	JLabel passwordLabel = new JLabel("Password: ");
	JTextField usernameTextField = new JTextField();
	JPasswordField passwordTextField = new JPasswordField();
	JButton buttonLogin = new JButton("Login");
	JButton buttonReset = new JButton("Reset");
    
	public LoginPage() {
		setVisible(true);
		setSize(480,480);
		setTitle("Halaman Login");
		setLocationRelativeTo(null);
		setAlwaysOnTop(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		add(usernameLabel);
		add(passwordLabel);
		add(usernameTextField);
		add(passwordTextField);
		add(buttonLogin);
		add(buttonReset);

		usernameLabel.setBounds(20, 125, 300, 12);
		usernameTextField.setBounds(20, 141, 430, 32);
        
		passwordLabel.setBounds(20, 189, 440, 12);
		passwordTextField.setBounds(20, 205, 430, 32);
	
		buttonLogin.setBounds(20, 245, 340, 32);
		buttonLogin.addActionListener(this);

		buttonReset.setBounds(370, 245, 80, 32);
		buttonReset.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == buttonLogin) {
				String username = usernameTextField.getText();
				String password = new String(passwordTextField.getPassword());
				if (username.equals("Calvin") && password.equals("123230048")) {
					JOptionPane.showMessageDialog(this, "Login Berhasil!");
					SwingUtilities.invokeLater(() -> new GameFrame());
					this.dispose();
				} else {
					JOptionPane.showMessageDialog(this, "Login Gagal! Periksa kembali username dan password.", "Login Error", JOptionPane.ERROR_MESSAGE);
				}
			} else if(e.getSource() == buttonReset) {
				usernameTextField.setText("");
				passwordTextField.setText("");
			}
		} catch (Exception error) {
			JOptionPane.showMessageDialog(this, error.getMessage());
		}
	}
}


