package ui.Administrador;

import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.services.Banco;
import javax.swing.JOptionPane;

public class RegistrarCliente extends javax.swing.JPanel {
    
    private Banco banco;
    
    public RegistrarCliente(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDNI = new javax.swing.JTextField();
        labelNombreC = new javax.swing.JTextField();
        txtRegistrarE = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelID = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();

        txtRegistrarE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRegistrarE.setText("Registrar Cliente");

        jLabel1.setText("Nombre Completo:");

        jLabel2.setText("DNI:");

        jLabel3.setText("Teléfono");

        jLabel4.setText("Correo electrónico:");

        jLabel5.setText("ID cliente:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(labelNombreC)
                    .addComponent(labelTelefono)
                    .addComponent(labelCorreo)
                    .addComponent(labelID))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtRegistrarE)
                .addGap(200, 200, 200))
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(btnRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtRegistrarE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrar)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (banco == null) {
            JOptionPane.showMessageDialog(this, "Error: Banco no inicializado.");
            return;
        }

        String dni = labelDNI.getText().trim();
        String nombre = labelNombreC.getText().trim();
        String telefono = labelTelefono.getText().trim();
        String correo = labelCorreo.getText().trim();
        String idCliente = labelID.getText().trim();

        if (dni.isEmpty() || nombre.isEmpty() || telefono.isEmpty()
                || correo.isEmpty() || idCliente.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
            return;
        }

        if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(this, "El DNI debe tener 8 dígitos.");
            return;
        }

        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            JOptionPane.showMessageDialog(this, "El nombre solo puede contener letras y espacios.");
            return;
        }

        if (!idCliente.matches("[a-zA-Z0-9]+")) {
            JOptionPane.showMessageDialog(this, "El ID de cliente no puede contener símbolos.");
            return;
        }

        for (Cliente c : banco.getClientes()) {
            if (dni.equalsIgnoreCase(c.getDni())) {
                JOptionPane.showMessageDialog(this, "Ya existe un cliente con ese DNI.");
                return;
            }
            if (idCliente.equalsIgnoreCase(c.getIdCliente())) {
                JOptionPane.showMessageDialog(this, "Ya existe un cliente con ese ID.");
                return;
            }
        }

        if (!correo.matches(".+@.+\\..+")) {
            JOptionPane.showMessageDialog(this, "Correo electrónico no válido.");
            return;
        }

        String direccion = "-";

        Cliente nuevo = new Cliente(
                dni,
                nombre,
                direccion,
                telefono,
                correo,
                idCliente
        );

        banco.getClientes().add(nuevo);

        JOptionPane.showMessageDialog(this, "Cliente registrado correctamente.");

        labelDNI.setText("");
        labelNombreC.setText("");
        labelTelefono.setText("");
        labelCorreo.setText("");
        labelID.setText("");
    }//GEN-LAST:event_btnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField labelCorreo;
    private javax.swing.JTextField labelDNI;
    private javax.swing.JTextField labelID;
    private javax.swing.JTextField labelNombreC;
    private javax.swing.JTextField labelTelefono;
    private javax.swing.JLabel txtRegistrarE;
    // End of variables declaration//GEN-END:variables
}
