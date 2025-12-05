package ui.Administrador;

import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.models.Cuenta;
import com.mycompany.laboratorio9.models.Deposito;
import com.mycompany.laboratorio9.models.Empleado;
import com.mycompany.laboratorio9.services.Banco;
import javax.swing.JOptionPane;

public class Depositar extends javax.swing.JPanel {
    
    private Banco banco;
    
    public Depositar(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelIDDNIEmp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        labelIDDNICli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelNCuenta = new javax.swing.JTextField();
        labelMonto = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Depositar");

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(this::btnEnviarActionPerformed);

        jLabel2.setText("Monto a depositar:");

        jLabel3.setText("Nº de Cuenta (10-20 dígitos):");

        jLabel4.setText("ID/DNI del empleado:");

        jLabel5.setText("ID/DNI del cliente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1)
                .addContainerGap(217, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelNCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(labelMonto)
                                .addComponent(labelIDDNIEmp)
                                .addComponent(labelIDDNICli)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(115, 115, 115)))
                    .addGap(91, 91, 91)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelIDDNIEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelIDDNICli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGap(18, 18, 18)
                    .addComponent(btnEnviar)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
       if (banco == null) {
            JOptionPane.showMessageDialog(this, "Error: Banco no inicializado.");
            return;
        }

        String numCuenta = labelNCuenta.getText().trim();
        String montoStr = labelMonto.getText().trim();
        String idEmpleado = labelIDDNIEmp.getText().trim();
        String idCliente = labelIDDNICli.getText().trim();

        if (numCuenta.isEmpty() || montoStr.isEmpty() ||
            idEmpleado.isEmpty() || idCliente.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
            return;
        }
        
        if (!numCuenta.matches("\\d{10,20}")) {
            JOptionPane.showMessageDialog(this, "El número de cuenta debe tener entre 10 y 20 dígitos.");
        return;
        }

        double monto;
        try {
            monto = Double.parseDouble(montoStr);
            if (monto <= 0) {
                JOptionPane.showMessageDialog(this, "El monto debe ser mayor que cero.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Monto inválido.");
            return;
        }

        Cuenta cuentaDestino = null;
        for (Cuenta c : banco.getCuentas()) {
            if (numCuenta.equalsIgnoreCase(c.getNumero())) {
                cuentaDestino = c;
                break;
            }
        }

        if (cuentaDestino == null) {
            JOptionPane.showMessageDialog(this, "Cuenta no encontrada.");
            return;
        }

        Empleado empleadoAtendedor = null;
        for (Empleado e : banco.getEmpleados()) {
            if (idEmpleado.equalsIgnoreCase(e.getIdEmpleado()) ||
                idEmpleado.equalsIgnoreCase(e.getDni())) {
                empleadoAtendedor = e;
                break;
            }
        }

        if (empleadoAtendedor == null) {
            JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
            return;
        }

        // 5) Buscar cliente que deposita
        Cliente clienteDepositante = null;
        for (Cliente cli : banco.getClientes()) {
            if (idCliente.equalsIgnoreCase(cli.getIdCliente()) ||
                idCliente.equalsIgnoreCase(cli.getDni())) {
                clienteDepositante = cli;
                break;
            }
        }

        if (clienteDepositante == null) {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
            return;
        }

        // 6) Crear y procesar el Depósito usando la lógica del modelo
        Deposito deposito = empleadoAtendedor.registrarDeposito(
                cuentaDestino,
                (float) monto,
                clienteDepositante
        );
        deposito.procesar();

        JOptionPane.showMessageDialog(this,
                String.format("Depósito realizado.\nSaldo actual: S/ %.2f",
                        cuentaDestino.getSaldo()));

        labelNCuenta.setText("");
        labelMonto.setText("");
        labelIDDNIEmp.setText("");
        labelIDDNICli.setText(""); 
    }//GEN-LAST:event_btnEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField labelIDDNICli;
    private javax.swing.JTextField labelIDDNIEmp;
    private javax.swing.JTextField labelMonto;
    private javax.swing.JTextField labelNCuenta;
    // End of variables declaration//GEN-END:variables
}
