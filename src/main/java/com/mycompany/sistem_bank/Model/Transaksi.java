/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_bank.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaksi {
    private String idTransaksi;
    private String jenis;
    private double jumlah;
    private Date tanggal;
    
    
    public Transaksi(String idTransaksi, String jenis, double jumlah){
        this.idTransaksi = idTransaksi;
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.tanggal = new Date();
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
    public Date getTanggal(){
        return tanggal;
    }
    public String getTanggalFormat() {
    SimpleDateFormat format =
            new SimpleDateFormat("dd/MM/yyyy HH:mm");

    return format.format(tanggal);
}
    
    public void tampilkanTransaksi() {
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Jenis        : " + jenis);
        System.out.println("Jumlah       : Rp " + jumlah);
        System.out.println("Tanggal      : " + tanggal);
    }
}
