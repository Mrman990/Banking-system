/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_bank.Model;

import com.mycompany.sistem_bank.Interfaces.PenghitungBunga;

public abstract class Rekening implements PenghitungBunga{
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;
    
    public Rekening(String nomorRekening, String namaPemilik, double saldo){
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }
    
    public String getNomorRekening(){
        return nomorRekening;
    }
    public String getNamaPemilik(){
        return namaPemilik;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public void setNomorRekening(String nomorRekening){
        this.nomorRekening = nomorRekening;
    }
    public void setNamaPemilik(String namaPemilik){
        this.namaPemilik = namaPemilik;
    }
    protected void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void setor(double jumlah){
        if(jumlah > 0){
            saldo += jumlah;
        }
    }
    
    public boolean tarik(double jumlah){
        if(jumlah > 0 && saldo >= jumlah){
            saldo -= jumlah;
            return true;
        }
        return false;
    }
    
    public double lihatSaldo(){
        return saldo;
    }
    
    public void tampilkanInfo(){
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Nama Pemilik   : " + namaPemilik);
        System.out.printf("Saldo : Rp %,.2f%n",+ saldo);
    }
    @Override
    public abstract double hitungBunga();
}
