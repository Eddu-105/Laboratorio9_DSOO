package com.mycompany.laboratorio9.models;

import com.mycompany.laboratorio9.models.Cliente;
import java.time.LocalDateTime;
import javax.swing.*;
import models.TransferenciaDAO;

public class Transferencia extends Transaccion {
    private Cuenta cuentaDestino;

    public Transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, float monto, Cliente cliente, Empleado empleado) {
        super("T-" + System.currentTimeMillis(), LocalDateTime.now(), monto, empleado, cuentaOrigen, cliente);
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public void procesar() {
        cuenta.debitar(monto, this);
        cuentaDestino.acreditar(monto, this);
    }
    
    public boolean guardarEnBD() {
        TransferenciaDAO dao = new TransferenciaDAO();
        return dao.registrarTransferencia(
                cuenta.getNumero(),         
                cuentaDestino.getNumero(),  
                cliente.getIdCliente(),     
                empleado.getIdEmpleado(),   
                monto                       
        );
    }
}

