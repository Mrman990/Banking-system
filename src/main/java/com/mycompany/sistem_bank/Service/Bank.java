/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_bank.Service;

import java.util.ArrayList;
import com.mycompany.sistem_bank.Model.Nasabah;
import com.mycompany.sistem_bank.Model.Transaksi;

public class Bank {
    
    private ArrayList<Nasabah> daftarNasabah;
    private ArrayList<Transaksi> daftarTransaksi;
    
    public Bank(){
        daftarNasabah = new ArrayList<>();
        daftarTransaksi = new ArrayList<>();
    }
        
    public void tambahNasabah(Nasabah nasabah){
        daftarNasabah.add(nasabah);
    }
    
    public Nasabah cariNasabah(String username){
        for(Nasabah nasabah : daftarNasabah){
            if(nasabah.getUsername().equals(username)){
                return nasabah;
            }
        }
        return null;
    }
    
    public void tambahTransaksi(Transaksi transaksi){
        daftarTransaksi.add(transaksi);
    }
    public ArrayList<Nasabah> getDaftarNasabah(){
        return daftarNasabah;
    }
    public ArrayList<Transaksi> getDaftarTransaksi(){
        return daftarTransaksi;
    }
}
