/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistem_bank.View;

import com.mycompany.sistem_bank.Model.Nasabah;
import com.mycompany.sistem_bank.Service.Bank;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

public class TarikFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TarikFrame.class.getName());
    private Nasabah nasabah;
    private Bank bank;
    
    public TarikFrame(Bank bank, Nasabah nasabah) {
        initComponents();
        this.nasabah = nasabah;
        this.bank = bank;
        setTitle("Tarik Tunai");
        
        NomorRekening.setEditable(false);
        NomorPemilik.setEditable(false);
        SaldoSaatini.setEditable(false);
        
        NomorRekening.setText(nasabah.getRekening().getNomorRekening());
        NomorPemilik.setText(nasabah.getRekening().getNamaPemilik());
        SaldoSaatini.setText("Rp " + nasabah.getRekening().getSaldo());
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        SaldoSaatini.setText(rupiah.format(nasabah.getRekening().getSaldo()));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NomorRekening = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NomorPemilik = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SaldoSaatini = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JumlahTariktunai = new javax.swing.JTextField();
        Tarik = new javax.swing.JButton();
        Batal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setText("Form tarik tunai");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel2.setText("Nomor rekening");

        NomorRekening.addActionListener(this::NomorRekeningActionPerformed);

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel3.setText("Nomor pemilik");

        NomorPemilik.addActionListener(this::NomorPemilikActionPerformed);

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel4.setText("Saldo saat ini");

        SaldoSaatini.addActionListener(this::SaldoSaatiniActionPerformed);

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel5.setText("Jumlah tarik tunai");

        JumlahTariktunai.addActionListener(this::JumlahTariktunaiActionPerformed);

        Tarik.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Tarik.setText("Tarik");
        Tarik.addActionListener(this::TarikActionPerformed);

        Batal.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Batal.setText("Batal");
        Batal.addActionListener(this::BatalActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomorRekening, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(NomorPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(SaldoSaatini, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(JumlahTariktunai, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(Tarik)
                        .addGap(18, 18, 18)
                        .addComponent(Batal)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomorRekening, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomorPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SaldoSaatini, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JumlahTariktunai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tarik)
                    .addComponent(Batal))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TarikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarikActionPerformed
        try{
            double jumlah = Double.parseDouble(JumlahTariktunai.getText());
            
            if(jumlah <= 0){
                JOptionPane.showMessageDialog(this,
                        "Jumlah penerikan harus lebih dari 0 !",
                        "Peringatan",
                        JOptionPane.WARNING_MESSAGE);
                return;  
            }
            boolean berhasil = nasabah.getRekening().tarik(jumlah);
            
            if(berhasil){
                JOptionPane.showMessageDialog(this,
                        "Penarikan berhasil!\nSaldo sekarang : Rp "
                        + nasabah.getRekening().getSaldo());
                DashboardFrame dashboard = new DashboardFrame(bank, nasabah);
                dashboard.setLocationRelativeTo(null);
                dashboard.setVisible(true); 
            }else{
                JOptionPane.showMessageDialog(this,
                        "Saldo tidak mencukupi",
                        "Penarikan Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                    "Masukkan jumlah berupa angaka!",
                    "Input Salah",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_TarikActionPerformed

    private void BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalActionPerformed
        DashboardFrame dashboard = new DashboardFrame(bank, nasabah);
        dashboard.setLocationRelativeTo(null);
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BatalActionPerformed

    private void NomorRekeningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomorRekeningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomorRekeningActionPerformed

    private void NomorPemilikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomorPemilikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomorPemilikActionPerformed

    private void SaldoSaatiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaldoSaatiniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaldoSaatiniActionPerformed

    private void JumlahTariktunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahTariktunaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahTariktunaiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batal;
    private javax.swing.JTextField JumlahTariktunai;
    private javax.swing.JTextField NomorPemilik;
    private javax.swing.JTextField NomorRekening;
    private javax.swing.JTextField SaldoSaatini;
    private javax.swing.JButton Tarik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
