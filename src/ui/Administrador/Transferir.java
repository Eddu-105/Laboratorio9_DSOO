package ui.Administrador;

import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.models.Cuenta;
import com.mycompany.laboratorio9.models.Empleado;
import com.mycompany.laboratorio9.models.Transferencia;
import com.mycompany.laboratorio9.services.Banco;
import javax.swing.JOptionPane;

public class Transferir extends javax.swing.JPanel {
    
    private Banco banco;
    
    public Transferir(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRegistrarE = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelMonto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelIDDNIEmp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelNCuenta1 = new javax.swing.JTextField();
        labelNCuenta2 = new javax.swing.JTextField();
        labelIDDNICli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        txtRegistrarE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRegistrarE.setText("Transferencia");

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(this::btnEnviarActionPerformed);

        jLabel1.setText("N° de Cuenta que Recibe (10-20 dígitos):");

        jLabel2.setText("Nº de Cuenta que Transfiere (10-20 dígitos):");

        jLabel3.setText("Monto a transferir:");

        jLabel4.setText("ID/DNI del empleado:");

        jLabel5.setText("ID/DNI del cliente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNCuenta1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(labelNCuenta2)
                    .addComponent(labelMonto)
                    .addComponent(labelIDDNIEmp)
                    .addComponent(labelIDDNICli))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRegistrarE, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(217, 217, 217))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtRegistrarE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNCuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
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
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (banco == null) {
        JOptionPane.showMessageDialog(this, "Error: Banco no inicializado.");
        return;
    }

    String numCuentaOrigen  = labelNCuenta1.getText().trim();
    String numCuentaDestino = labelNCuenta2.getText().trim();
    String montoStr         = labelMonto.getText().trim();
    String idEmpleado       = labelIDDNIEmp.getText().trim();
    String idCliente        = labelIDDNICli.getText().trim();

    if (numCuentaOrigen.isEmpty() || numCuentaDestino.isEmpty() ||
        montoStr.isEmpty() || idEmpleado.isEmpty() || idCliente.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Complete todos los campos.");
        return;
    }

    if (!numCuentaOrigen.matches("\\d{10,20}") ||
        !numCuentaDestino.matches("\\d{10,20}")) {
        JOptionPane.showMessageDialog(this, "Las cuentas deben tener entre 10 y 20 dígitos.");
        return;
    }

    if (numCuentaOrigen.equals(numCuentaDestino)) {
        JOptionPane.showMessageDialog(this, "La cuenta origen y destino deben ser diferentes.");
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

    Cuenta cuentaOrigen = null;
    for (Cuenta c : banco.getCuentas()) {
        if (numCuentaOrigen.equalsIgnoreCase(c.getNumero())) {
            cuentaOrigen = c;
            break;
        }
    }
    if (cuentaOrigen == null) {
        JOptionPane.showMessageDialog(this, "Cuenta origen no encontrada.");
        return;
    }

    Cuenta cuentaDestino = null;
    for (Cuenta c : banco.getCuentas()) {
        if (numCuentaDestino.equalsIgnoreCase(c.getNumero())) {
            cuentaDestino = c;
            break;
        }
    }
    if (cuentaDestino == null) {
        JOptionPane.showMessageDialog(this, "Cuenta destino no encontrada.");
        return;
    }

    if (cuentaOrigen.getSaldo() < monto) {
        JOptionPane.showMessageDialog(this, "Saldo insuficiente en la cuenta origen.");
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

    Cliente clienteTitular = null;
    for (Cliente cli : banco.getClientes()) {
        if (idCliente.equalsIgnoreCase(cli.getIdCliente()) ||
            idCliente.equalsIgnoreCase(cli.getDni())) {
            clienteTitular = cli;
            break;
        }
    }
    if (clienteTitular == null) {
        JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
        return;
    }

    if (!cuentaOrigen.getTitulares().contains(clienteTitular)) {
        JOptionPane.showMessageDialog(this, "El cliente no es titular de la cuenta origen.");
        return;
    }

    Transferencia transferencia = new Transferencia(
            cuentaOrigen,
            cuentaDestino,
            (float) monto,
            clienteTitular,
            empleadoAtendedor
    );
    transferencia.procesar();

    JOptionPane.showMessageDialog(this,
            String.format("Transferencia realizada.\nSaldo origen: S/ %.2f\nSaldo destino: S/ %.2f",
                    cuentaOrigen.getSaldo(), cuentaDestino.getSaldo()));

    labelNCuenta1.setText("");
    labelNCuenta2.setText("");
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
    private javax.swing.JTextField labelNCuenta1;
    private javax.swing.JTextField labelNCuenta2;
    private javax.swing.JLabel txtRegistrarE;
    // End of variables declaration//GEN-END:variables
}
