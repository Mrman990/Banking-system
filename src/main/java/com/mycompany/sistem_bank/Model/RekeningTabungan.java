/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_bank.Model;


public class RekeningTabungan extends Rekening {
    private double sukuBunga;
    
    public RekeningTabungan(String nomorRekening, String namaPemilik, double saldo, double sukuBunga){
        super(nomorRekening, namaPemilik, saldo);
        this.sukuBunga = sukuBunga;
    }
    public double getSukuBunga(){
        return sukuBunga;
    }
    public void setSukuBunga(double sukuBunga){
        this.sukuBunga = sukuBunga;
    }
    @Override
    public double hitungBunga(){
        return getSaldo() * sukuBunga / 100;
    }
}
