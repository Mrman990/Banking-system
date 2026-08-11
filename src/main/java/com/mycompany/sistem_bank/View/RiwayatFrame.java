/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistem_bank.View;

import com.mycompany.sistem_bank.Model.Nasabah;
import com.mycompany.sistem_bank.Model.Transaksi;
import com.mycompany.sistem_bank.Service.Bank;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

public class RiwayatFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RiwayatFrame.class.getName());
    private Bank bank;
    private Nasabah nasabah;
    
    public RiwayatFrame(Bank bank, Nasabah nasabah) {
        initComponents();
        this.bank = bank;
        this.nasabah = nasabah;
        setTitle("Riwayat Transaksi");
        tampilkanRiwayat();
    }
    private void tampilkanRiwayat(){
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        
        NumberFormat rupiah =  NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        rupiah.setMaximumFractionDigits(0);
        rupiah.setMinimumFractionDigits(0);

        for(Transaksi transaksi : bank.getDaftarTransaksi()){
            String tanggal = transaksi.getTanggalFormat();
            String jenis = transaksi.getJenis();
            String jumlah = rupiah.format(transaksi.getJumlah());
            model.addRow(new Object[]{
                tanggal, jenis, jumlah
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Judul = new javax.swing.JLabel();
        Kembali = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Judul.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        Judul.setText("Riwayat transaksi");

        Kembali.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Kembali.setText("Kembali");
        Kembali.addActionListener(this::KembaliActionPerformed);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tanggal", "jenis", "Jumlah"
            }
        ));
        jScrollPane2.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(Judul))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Judul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {
        DashboardFrame dashboard = new DashboardFrame(bank, nasabah);
        dashboard.setLocationRelativeTo(null);
        dashboard.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
    }

   
    private javax.swing.JLabel Judul;
    private javax.swing.JButton Kembali;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    
}
