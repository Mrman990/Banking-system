/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistem_bank.View;

import com.mycompany.sistem_bank.Model.Nasabah;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

public class SetorFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SetorFrame.class.getName());
    private Nasabah nasabah;
    
    public SetorFrame(Nasabah nasabah) {
        initComponents();
        this.nasabah = nasabah;
        setTitle("Setor Tunai");
        NomorRekening.setEditable(false);
        NamaPemilik.setEditable(false);
        SaldoSaatini.setEditable(false);
        
        NomorRekening.setText(nasabah.getRekening().getNomorRekening());
        NamaPemilik.setText(nasabah.getRekening().getNamaPemilik());
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        rupiah.setMaximumFractionDigits(0);
        rupiah.setMinimumFractionDigits(0);
        SaldoSaatini.setText(rupiah.format(nasabah.getRekening().getSaldo()));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NomorRekening = new javax.swing.JTextField();
        NamaPemilik = new javax.swing.JTextField();
        JumlahSetoran = new javax.swing.JTextField();
        SaldoSaatini = new javax.swing.JTextField();
        Setor = new javax.swing.JButton();
        Batal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setText("Form Setoran");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel2.setText("Nomor rekening");

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel4.setText("Nama pemilik");

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel5.setText("Saldo saat ini");

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel6.setText("Jumlah setoran");

        JumlahSetoran.addActionListener(this::JumlahSetoranActionPerformed);

        SaldoSaatini.addActionListener(this::SaldoSaatiniActionPerformed);

        Setor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Setor.setText("Setor");
        Setor.addActionListener(this::SetorActionPerformed);

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
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(NomorRekening, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NamaPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(JumlahSetoran, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(SaldoSaatini, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(Setor)
                        .addGap(18, 18, 18)
                        .addComponent(Batal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomorRekening, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamaPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JumlahSetoran, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SaldoSaatini, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Setor)
                    .addComponent(Batal))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JumlahSetoranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahSetoranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahSetoranActionPerformed

    private void SaldoSaatiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaldoSaatiniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaldoSaatiniActionPerformed

    private void SetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetorActionPerformed
         try{
            double jumlah = Double.parseDouble(JumlahSetoran.getText());
            
            if(jumlah <=0){
                  JOptionPane.showMessageDialog(this,
                    "Jumlah setor harus lebih dari 0!",
                    "Peringatan",
                    JOptionPane.WARNING_MESSAGE);
            return;
            }
            nasabah.getRekening().setor(jumlah);
            JOptionPane.showMessageDialog(this,
                    "Setor berhasil!\nSaldo sekarang : Rp " +
                    nasabah.getRekening().getSaldo());
            
            DashboardFrame dashboard = new DashboardFrame(nasabah);
            dashboard.setLocationRelativeTo(null);
            dashboard.setVisible(true);
            
            this.dispose();
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,
                    "Masukkan jumlah berupa angaka",
                    "Input salah",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SetorActionPerformed

    private void BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalActionPerformed
        DashboardFrame dashboard = new DashboardFrame(nasabah);
        dashboard.setLocationRelativeTo(null);
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BatalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batal;
    private javax.swing.JTextField JumlahSetoran;
    private javax.swing.JTextField NamaPemilik;
    private javax.swing.JTextField NomorRekening;
    private javax.swing.JTextField SaldoSaatini;
    private javax.swing.JButton Setor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
