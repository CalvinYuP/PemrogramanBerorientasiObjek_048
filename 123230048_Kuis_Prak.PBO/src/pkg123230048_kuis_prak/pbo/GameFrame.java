/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230048_kuis_prak.pbo;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class GameFrame extends JFrame implements ActionListener{
		JLabel nameplayer1 = new JLabel("Nama:");
		JTextField player1 = new JTextField();
		JLabel serang1 = new JLabel("Serangan");
		JRadioButton btnBatu1 = new JRadioButton("Batu");
		JRadioButton btnGunting1 = new JRadioButton("Gunting");
		JRadioButton btnKertas1 = new JRadioButton("Kertas");
		
		JLabel nameplayer2 = new JLabel("Nama:");
		JTextField player2 = new JTextField();
		JLabel serang2 = new JLabel("Serangan");
		JRadioButton btnBatu2 = new JRadioButton("Batu");
		JRadioButton btnGunting2 = new JRadioButton("Gunting");
		JRadioButton btnKertas2 = new JRadioButton("Kertas");
		
		JButton btnBattle = new JButton("Battle");
	
	
	
	public GameFrame() {
		setVisible(true);
		setTitle("Game Batu-Gunting-Kertas");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		add(nameplayer1);
		add(player1);
		add(serang1);
		add(btnBatu1);
		add(btnGunting1);
		add(btnKertas1);
		add(nameplayer2);
		add(player2);
		add(serang2);
		add(btnBatu2);
		add(btnGunting2);
		add(btnKertas2);
		add(btnBattle);
		
		
		nameplayer1.setBounds(10, 20, 100, 25);
		nameplayer2.setBounds(210, 20, 120, 25);
		
		player1.setBounds(10, 45, 180, 20);
		player1.setBounds(210, 45, 180, 20);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	}

}
