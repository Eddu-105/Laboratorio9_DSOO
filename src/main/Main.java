package com.mycompany.laboratorio9;

import com.mycompany.laboratorio9.models.*;
import com.mycompany.laboratorio9.services.*;
import com.mycompany.laboratorio9.ui.VentanaLogin;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();

        inicializarDatos(banco);

        banco.agregarUsuario(new UsuarioAdministrador("admin", "adminpass"));
        banco.agregarUsuario(new UsuarioEmpleado("empleado01", "emppass01"));
        banco.agregarUsuario(new UsuarioCliente("cliente01", "clipass01"));

        VentanaLogin login = new VentanaLogin();
        login.setBanco(banco);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

    private static void inicializarDatos(Banco banco) {
        try {
            Empleado empleadoInicial = new Empleado(
                "12345678", "Carlos Ruiz", "-", "999888777", "carlos@banco.com",
                "EMP01", "Gerente"
            );

            Cliente clienteInicial = new Cliente(
                "87654321", "Ana Torres", "-", "987654321", "ana@correo.com", "CLI01"
            );

            banco.getEmpleados().add(empleadoInicial);
            banco.getClientes().add(clienteInicial);

        } catch (Exception e) {
            System.out.println("Error al cargar datos iniciales.");
        }
    }
}