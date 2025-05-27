/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controller.RentalController;
import model.Penyewa;

import java.awt.event.*;
import java.util.ArrayList;

public class RentalForm extends JFrame {
    private JTextField tfNama, tfKontak, tfJenisMobil, tfDurasi;
    private JComboBox<String> cbStatusPembayaran;
    private JButton btnTambah, btnUpdate, btnDelete, btnClear;
    private JTable table;
    private DefaultTableModel tableModel;
    private RentalController controller = new RentalController();
    
    public RentalForm() {
            setTitle("Manajemen Rental");
            setSize(700, 500);
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            JLabel lblNama = new JLabel("Nama:");
            JLabel lblKontak = new JLabel("Kontak:");
            JLabel lblJenisMobil = new JLabel("Jenis Mobil:");
            JLabel lblDurasi = new JLabel("Durasi:");
            JLabel lblStatusPembayaran = new JLabel("Status Pembayaran");
            
            tfNama = new JTextField();
            tfKontak = new JTextField();
            tfDurasi = new JTextField();
            cbStatusPembayaran = new JComboBox<>(new String[] {"Not Paid", "Paid"});
            
            btnTambah = new JButton("Tambah");
            btnUpdate = new JButton("Update");
            btnDelete = new JButton("Delete");
            btnClear = new JButton("Clear");
            
            tableModel = new DefaultTableModel(new String[] {"ID", "Nama", "Kontak", "Jenis Mobil", "Durasi", "Total Biaya", "Status"}, 0);
            table = new JTable(tableModel);
            JScrollPane scrollPane = new JScrollPane(table);
            
            lblNama.setBounds(20, 20, 100, 25); tfNama.setBounds(120, 20, 150, 25);
            lblKontak.setBounds(20, 50, 100, 25); tfKontak.setBounds(120, 50, 150, 25);
            lblJenisMobil.setBounds(20, 80, 100, 25); tfNama.setBounds(120, 80, 150, 25);
            lblDurasi.setBounds(20, 100, 100, 25); tfDurasi.setBounds(120, 110, 150, 25);
            lblStatusPembayaran.setBounds(20, 140, 100, 25); cbStatusPembayaran.setBounds(120, 140, 150, 25);
            
    }
}
