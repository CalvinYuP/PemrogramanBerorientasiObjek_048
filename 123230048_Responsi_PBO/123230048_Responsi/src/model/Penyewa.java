/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class Penyewa {
    private String nama, kontak, jenis_mobil, status_pembayaran;
    private int id, durasi, totalBiaya;
    
    public Penyewa(String nama, String kontak, String jenis_mobil, int durasi, String status_pembayaran) {
        this.nama = nama;
        this.kontak = kontak;
        this.jenis_mobil = jenis_mobil;
        this.durasi = durasi;
        this.status_pembayaran = status_pembayaran;
        this.totalBiaya = hitungTotalBiaya();
    }
    
    private int hitungTotalBiaya() {
        int hargaPerHari = 300000;
        return hargaPerHari * durasi;
    }
    
    // Getters
    public int getID() {
        return id;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getKontak() {
        return kontak;
    }
    
    public String getJenisMobil() {
        return jenis_mobil;
    }
    
    public int getDurasi() {
        return durasi;
    }
    
    public int getTotalBiaya() {
        return totalBiaya;
    }
    
    public String getStatusPembayaran() {
        return status_pembayaran;
    }
    
    // Setter

    public void setID(int id) {
        this.id = id;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setKontak(String Kontak) {
        this.kontak = kontak;
    }
    
    public void setJenisMobil(String jenis_mobil) {
        this.jenis_mobil = jenis_mobil;
    }
    
    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
    
    public void setTotalBiaya(int TotalBiaya) {
        this.totalBiaya = totalBiaya;
    }
    
    public void setStatusPembayaran(String status_pembayaran) {
        this.status_pembayaran = status_pembayaran;
    }
 
}
