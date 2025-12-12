package ui.Administrador;

import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.models.Cuenta;
import com.mycompany.laboratorio9.services.Banco;
import java.awt.Color;
import javax.swing.JOptionPane;
import models.Conector;
import java.sql.Connection;
import java.sql.SQLException;
import models.EliminarClienteDAO;

public class EliminarCliente extends javax.swing.JPanel {
    
    private Banco banco;
    
    public EliminarCliente(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtEliminar = new javax.swing.JLabel();
        labelIDDNI = new javax.swing.JTextField();
        BtnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtEliminar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtEliminar.setForeground(new java.awt.Color(0, 0, 0));
        txtEliminar.setText("Eliminar Cliente");

        labelIDDNI.setBackground(new java.awt.Color(255, 255, 255));
        labelIDDNI.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelIDDNI.setForeground(new java.awt.Color(0, 0, 0));
        labelIDDNI.setBorder(null);

        BtnEliminar.setBackground(new java.awt.Color(0, 134, 190));
        BtnEliminar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setText("Eliminar");
        BtnEliminar.setBorder(null);
        BtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseExited(evt);
            }
        });
        BtnEliminar.addActionListener(this::BtnEliminarActionPerformed);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID/DNI del cliente:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/city.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/favicon.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Bienvenido ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(txtEliminar)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIDDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26)))
                .addComponent(txtEliminar)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(labelIDDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        if (banco == null) {
            JOptionPane.showMessageDialog(this, "Error: Banco no inicializado.");
            return;
        }

        String idODni = labelIDDNI.getText().trim();

        if (idODni.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el ID o DNI del cliente.");
            return;
        }

        Cliente clienteEncontrado = null;
        for (Cliente c : banco.getClientes()) {
            if (idODni.equalsIgnoreCase(c.getIdCliente()) ||
                idODni.equalsIgnoreCase(c.getDni())) {
                clienteEncontrado = c;
                break;
            }
        }

        if (clienteEncontrado == null) {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
            return;
        }

        java.util.Iterator<Cuenta> it = banco.getCuentas().iterator();
        while (it.hasNext()) {
            Cuenta cuenta = it.next();
            if (cuenta.getTitulares().contains(clienteEncontrado)) {
                it.remove();   
            }
        }

        banco.getClientes().remove(clienteEncontrado);
        
        // Actualizar en la base de datos
        try (Connection con = Conector.getConexion()) {
            EliminarClienteDAO clienteDAO = new EliminarClienteDAO(con);
            boolean eliminado = clienteDAO.eliminarCliente(clienteEncontrado.getIdCliente());

            if (!eliminado) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el cliente en la base de datos.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error de conexión con la base de datos.");
        }
    
        JOptionPane.showMessageDialog(this, 
                "Cliente eliminado correctamente junto con sus cuentas asociadas.");

        labelIDDNI.setText("");
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseExited
        BtnEliminar.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_BtnEliminarMouseExited

    private void BtnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseEntered
        BtnEliminar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_BtnEliminarMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField labelIDDNI;
    private javax.swing.JLabel txtEliminar;
    // End of variables declaration//GEN-END:variables
}
