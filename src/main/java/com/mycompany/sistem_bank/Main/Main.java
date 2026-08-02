/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sistem_bank.Main;

import com.mycompany.sistem_bank.Model.Nasabah;
import com.mycompany.sistem_bank.Model.Rekening;
import com.mycompany.sistem_bank.Model.RekeningTabungan;
import com.mycompany.sistem_bank.Service.AuthService;
import com.mycompany.sistem_bank.Service.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
    
        Rekening rekening = new RekeningTabungan("01", "Miku", 10000000, 3);
        Rekening rekening_2 = new RekeningTabungan("02", "Teto", 1000, 3);
    
        Nasabah nasabah = new Nasabah("N001", "Kurji Olie", "12345", rekening);
        Nasabah nasabah_2 = new Nasabah("N002", "Kobo", "1232", rekening_2);
    
        bank.tambahNasabah(nasabah);
        bank.tambahNasabah(nasabah_2);
        AuthService auth = new AuthService(bank);
        Nasabah hasil = auth.login("Kurji Olie", "12345");
        hasil = auth.login("Kobo", "1232");
    
        if(hasil != null){
            System.out.println("Login Berhasil");
            System.out.println("Selamat Datang " + hasil.getUsername());
            hasil.getRekening().tampilkanInfo();
        }else{
            System.out.println("Login Gagal");
        }
    }
}
