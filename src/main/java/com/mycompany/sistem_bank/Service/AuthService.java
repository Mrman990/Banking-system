/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_bank.Service;

import com.mycompany.sistem_bank.Model.Nasabah;

public class AuthService {
    private Bank bank;
    
    public AuthService(Bank bank){
        this.bank = bank;
    }
    
    public Nasabah login(String username, String password){
        Nasabah nasabah = bank.cariNasabah(username);
        if(nasabah != null && nasabah.getPassword().equals(password)){
            return nasabah;
        }
        return null;
    }
}
