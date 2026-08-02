/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_bank.Model;


public class Nasabah {
   private String idNasabah;
   private String username;
   private String password;
   private Rekening rekening;
   
   public Nasabah(String idNasabah, String username, String password, Rekening rekening){
      this.idNasabah = idNasabah;
      this.username = username;
      this.password = password;
      this.rekening = rekening;
  }
  public String getIdNasabah(){
      return idNasabah;
  }
  public String getUsername(){
      return username;
  }
  public String getPassword(){
      return password;
  }
  public Rekening getRekening(){
      return rekening;
  }
  
  public void setUsername(String username){
      this.username = username;
  }
  public void setPassword(String password){
      this.password = password;
  }
  public void setRekening(Rekening rekening){
      this.rekening = rekening;
  }
}
