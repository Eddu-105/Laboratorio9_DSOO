package com.mycompany.laboratorio9.ui;

import com.mycompany.laboratorio9.services.Banco;
import javax.swing.JFrame;
import ui.Administrador.ConsultarMovimientos;
import ui.Empleado.ConsultarCliente;
import ui.Empleado.DepositarCliente;
import ui.Empleado.CrearCuentaCliente;
import ui.Empleado.RetirarCliente;
import ui.Empleado.TransferirCliente;

public class InterfazEmpleadox extends javax.swing.JPanel {
    
    private Banco banco;
    
    public InterfazEmpleadox(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        btnConsultarC = new javax.swing.JButton();
        btnConsultarM = new javax.swing.JButton();
        btnTransferirC = new javax.swing.JButton();
        btnRetirarC = new javax.swing.JButton();
        btnDepositarC = new javax.swing.JButton();
        btnCrearCuC = new javax.swing.JButton();
        txtOpcionE = new javax.swing.JLabel();
        txtBienvenidoE = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton7.setBackground(new java.awt.Color(0, 134, 190));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Salir");
        jButton7.setBorder(null);
        jButton7.addActionListener(this::jButton7ActionPerformed);

        btnConsultarC.setBackground(new java.awt.Color(0, 134, 190));
        btnConsultarC.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarC.setText("Consultar Clientes");
        btnConsultarC.setBorder(null);
        btnConsultarC.addActionListener(this::btnConsultarCActionPerformed);

        btnConsultarM.setBackground(new java.awt.Color(0, 134, 190));
        btnConsultarM.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarM.setText("Consultar movimientos");
        btnConsultarM.setBorder(null);
        btnConsultarM.addActionListener(this::btnConsultarMActionPerformed);

        btnTransferirC.setBackground(new java.awt.Color(0, 134, 190));
        btnTransferirC.setForeground(new java.awt.Color(255, 255, 255));
        btnTransferirC.setText("Transferir para cliente");
        btnTransferirC.setBorder(null);
        btnTransferirC.addActionListener(this::btnTransferirCActionPerformed);

        btnRetirarC.setBackground(new java.awt.Color(0, 134, 190));
        btnRetirarC.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirarC.setText("Retirar para cliente");
        btnRetirarC.setBorder(null);
        btnRetirarC.addActionListener(this::btnRetirarCActionPerformed);

        btnDepositarC.setBackground(new java.awt.Color(0, 134, 190));
        btnDepositarC.setForeground(new java.awt.Color(255, 255, 255));
        btnDepositarC.setText("Depositar para cliente");
        btnDepositarC.setBorder(null);
        btnDepositarC.addActionListener(this::btnDepositarCActionPerformed);

        btnCrearCuC.setBackground(new java.awt.Color(0, 134, 190));
        btnCrearCuC.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuC.setText("Crear cuenta a cliente");
        btnCrearCuC.setBorder(null);
        btnCrearCuC.addActionListener(this::btnCrearCuCActionPerformed);

        txtOpcionE.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtOpcionE.setForeground(new java.awt.Color(0, 0, 0));
        txtOpcionE.setText("Seleccione una opción");

        txtBienvenidoE.setBackground(new java.awt.Color(0, 0, 0));
        txtBienvenidoE.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtBienvenidoE.setForeground(new java.awt.Color(0, 0, 0));
        txtBienvenidoE.setText("Bienvenido Empleado");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/city.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/favicon.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtBienvenidoE)
                                    .addComponent(txtOpcionE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDepositarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTransferirC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRetirarC, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCrearCuC, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnConsultarM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnConsultarC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBienvenidoE)
                                .addGap(18, 18, 18)
                                .addComponent(txtOpcionE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDepositarC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultarM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRetirarC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultarC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTransferirC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearCuC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnCrearCuCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuCActionPerformed
        CrearCuentaCliente crearccli = new CrearCuentaCliente(banco);
        JFrame c = new JFrame();
        c.add(crearccli);
        c.pack();
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }//GEN-LAST:event_btnCrearCuCActionPerformed

    private void btnDepositarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarCActionPerformed
        DepositarCliente depositarc = new DepositarCliente(banco);
        JFrame m = new JFrame();
        m.add(depositarc);
        m.pack();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }//GEN-LAST:event_btnDepositarCActionPerformed

    private void btnRetirarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarCActionPerformed
        RetirarCliente retirarc = new RetirarCliente(banco);
        JFrame x = new JFrame();
        x.add(retirarc);
        x.pack();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
    }//GEN-LAST:event_btnRetirarCActionPerformed

    private void btnTransferirCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirCActionPerformed
        TransferirCliente transferirc = new TransferirCliente(banco);
        JFrame v = new JFrame();
        v.add(transferirc);
        v.pack();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_btnTransferirCActionPerformed

    private void btnConsultarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarMActionPerformed
        ConsultarMovimientos consultarm = new ConsultarMovimientos(banco);
        JFrame f = new JFrame();
        f.add(consultarm);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }//GEN-LAST:event_btnConsultarMActionPerformed

    private void btnConsultarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCActionPerformed
        ConsultarCliente consultarc = new ConsultarCliente(banco);
        JFrame g = new JFrame();
        g.add(consultarc);
        g.pack();
        g.setLocationRelativeTo(null);
        g.setVisible(true);
    }//GEN-LAST:event_btnConsultarCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarC;
    private javax.swing.JButton btnConsultarM;
    private javax.swing.JButton btnCrearCuC;
    private javax.swing.JButton btnDepositarC;
    private javax.swing.JButton btnRetirarC;
    private javax.swing.JButton btnTransferirC;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtBienvenidoE;
    private javax.swing.JLabel txtOpcionE;
    // End of variables declaration//GEN-END:variables
}
