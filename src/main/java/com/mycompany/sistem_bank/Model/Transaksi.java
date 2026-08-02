/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_bank.Model;


public class Transaksi {
    private String idTransaksi;
    private String jenis;
    private double jumlah;
    private String tanggal;
    
    public Transaksi(String idTransaksi, String jenis, double jumlah, String tanggal){
        this.idTransaksi = idTransaksi;
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
    }
    
    public String getIdTransaksi(){
        return idTransaksi;
    }
    public String getJenis(){
        return jenis;
    }
    public double getJumlah(){
        return jumlah;
    }
    public String getTanggal(){
        return tanggal;
    }
    
    public void tampilkanTransaksi() {
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Jenis        : " + jenis);
        System.out.println("Jumlah       : Rp " + jumlah);
        System.out.println("Tanggal      : " + tanggal);
    }
}
