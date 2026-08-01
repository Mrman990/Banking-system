/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_bank.Model;


public class RekeningGiro extends Rekening {
    private double batasOverdraft;
    
     public RekeningGiro(String nomorRekening, String namaPemilik, double saldo, double batasOverdraft){
        super(nomorRekening, namaPemilik, saldo);
        this.batasOverdraft = batasOverdraft;
    }
    public double getBatasOverdraft(){
        return batasOverdraft;
    }
    public void setBatasOverdraft(double batasOverdraft){
        this.batasOverdraft = batasOverdraft;
    }
    @Override
    public double hitungBunga(){
        return getSaldo() * 1/100;
    }
}
