package com.mycompany.laboratorio9.models;

import com.mycompany.laboratorio9.models.Cliente;
import java.time.LocalDateTime;
import javax.swing.*;

public class Transferencia extends Transaccion {
    private Cuenta cuentaDestino;

    public Transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, float monto, Cliente cliente, Empleado empleado) {
        super("T-" + System.currentTimeMillis(), LocalDateTime.now(), monto, empleado, cuentaOrigen, cliente);
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public void procesar() {
        cuenta.debitar(monto, this);
        cuenta.acreditar(monto, this);
    }
}

