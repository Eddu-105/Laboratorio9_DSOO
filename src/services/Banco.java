package com.mycompany.laboratorio9.services;

import com.mycompany.laboratorio9.models.Cuenta;
import com.mycompany.laboratorio9.models.Deposito;
import com.mycompany.laboratorio9.models.Empleado;
import com.mycompany.laboratorio9.models.Retiro;
import com.mycompany.laboratorio9.models.Transaccion;
import com.mycompany.laboratorio9.models.Transferencia;
import com.mycompany.laboratorio9.models.Usuario;
import com.mycompany.laboratorio9.models.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    // Listas principales
    private final ArrayList<Cliente> listaClientes = new ArrayList<>();
    private final ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    private final ArrayList<Cuenta> listaCuentas = new ArrayList<>();
    private final ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    // Constructor sin parámetros (para usar en GUI)
    public Banco() {
    }

    // ================= USUARIOS =================

    public void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public Usuario buscarUsuario(String nombreUsuario) {
        for (Usuario u : listaUsuarios) {
            if (u.getNombreUsuario().equals(nombreUsuario)) {
                return u;
            }
        }
        return null;
    }

    public ArrayList<Usuario> getUsuarios() {
        return listaUsuarios;
    }

    // ================= CLIENTES =================

    public ArrayList<Cliente> getClientes() {
        return listaClientes;
    }

    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public Cliente buscarClientePorIdODni(String idODni) {
        for (Cliente cliente : listaClientes) {
            if (equalsIgnoreCaseSafe(idODni, cliente.getIdCliente()) ||
                equalsIgnoreCaseSafe(idODni, cliente.getDni())) {
                return cliente;
            }
        }
        return null;
    }

    /**
     * Elimina un cliente por ID o DNI.
     * También elimina las cuentas donde sea titular.
     * Devuelve true si lo eliminó, false si no lo encontró.
     */
    public boolean eliminarClientePorIdODni(String idODni) {
        Cliente cliente = buscarClientePorIdODni(idODni);
        if (cliente == null) return false;

        // Eliminar cuentas donde es titular
        listaCuentas.removeIf(cuenta -> cuenta.getTitulares().contains(cliente));

        // Eliminar cliente de la lista
        return listaClientes.remove(cliente);
    }

    // ================= EMPLEADOS =================

    public ArrayList<Empleado> getEmpleados() {
        return listaEmpleados;
    }

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    public Empleado buscarEmpleadoPorIdODni(String idODni) {
        for (Empleado empleado : listaEmpleados) {
            if (equalsIgnoreCaseSafe(idODni, empleado.getIdEmpleado()) ||
                equalsIgnoreCaseSafe(idODni, empleado.getDni())) {
                return empleado;
            }
        }
        return null;
    }

    /**
     * Elimina un empleado por ID o DNI.
     * Devuelve true si lo eliminó, false si no lo encontró.
     */
    public boolean eliminarEmpleadoPorIdODni(String idODni) {
        Empleado emp = buscarEmpleadoPorIdODni(idODni);
        if (emp == null) return false;
        return listaEmpleados.remove(emp);
    }

    // ================= CUENTAS =================

    public ArrayList<Cuenta> getCuentas() {
        return listaCuentas;
    }

    public void agregarCuenta(Cuenta cuenta) {
        listaCuentas.add(cuenta);
    }

    /** Busca una cuenta por número (uso general). */
    public Cuenta buscarCuentaPorNumero(String numeroCuenta) {
        for (Cuenta cuenta : listaCuentas) {
            if (equalsIgnoreCaseSafe(numeroCuenta, cuenta.getNumero())) {
                return cuenta;
            }
        }
        return null;
    }

    /** Alias para GUI (ya lo usabas así). */
    public Cuenta buscarCuenta(String numeroCuenta) {
        return buscarCuentaPorNumero(numeroCuenta);
    }

    /**
     * Elimina una cuenta por número.
     * También la quita de la lista de cuentas de sus titulares.
     */
    public boolean eliminarCuentaPorNumero(String numeroCuenta) {
        Cuenta cuenta = buscarCuentaPorNumero(numeroCuenta);
        if (cuenta == null) return false;

        // Quitarla de los titulares
        for (Cliente titular : cuenta.getTitulares()) {
            titular.getCuentas().remove(cuenta);
        }

        return listaCuentas.remove(cuenta);
    }

    // ================= MOVIMIENTOS =================

    /**
     * Devuelve los movimientos de una cuenta dada su número.
     * Devuelve null si la cuenta no existe.
     */
    public List<Transaccion> obtenerMovimientosDeCuenta(String numeroCuenta) {
        Cuenta cuenta = buscarCuentaPorNumero(numeroCuenta);
        if (cuenta == null) {
            return null;
        }
        return cuenta.getMovimientos();
    }

    // ================= OPERACIONES A NIVEL MODELO (OPCIONAL) =================
    // Estas operaciones usan las clases Deposito / Retiro / Transferencia.
    // Tus formularios ya están creando estas transacciones, así que
    // estos métodos son opcionales. Puedes usarlos o ignorarlos.

    public Deposito registrarDeposito(Cuenta cuentaDestino,
                                      float monto,
                                      Cliente clienteDepositante,
                                      Empleado empleadoAtendedor) {
        Deposito deposito = empleadoAtendedor.registrarDeposito(
                cuentaDestino, monto, clienteDepositante
        );
        deposito.procesar();
        return deposito;
    }

    public Retiro registrarRetiro(Cuenta cuentaOrigen,
                                  float monto,
                                  Cliente clienteTitular,
                                  Empleado empleadoAtendedor) {
        Retiro retiro = empleadoAtendedor.registrarRetiro(
                cuentaOrigen, monto, clienteTitular
        );
        retiro.procesar();
        return retiro;
    }

    public Transferencia registrarTransferencia(Cuenta origen,
                                                Cuenta destino,
                                                float monto,
                                                Cliente clienteTitular,
                                                Empleado empleadoAtendedor) {
        Transferencia transferencia = new Transferencia(
                origen, destino, monto, clienteTitular, empleadoAtendedor
        );
        transferencia.procesar();
        return transferencia;
    }

    // ================= UTILIDAD =================

    public static boolean equalsIgnoreCaseSafe(String a, String b) {
        return a != null && b != null && a.equalsIgnoreCase(b);
    }
}