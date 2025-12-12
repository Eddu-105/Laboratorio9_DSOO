package models;

import models.Conector;
import java.sql.*;

public class DepositoDAO {
    
    public boolean registrarDeposito(String numeroCuenta, String idCliente, String idEmpleado, double monto) {

        String sql = "INSERT INTO depositos (numero, id_cliente, id_empleado, monto) VALUES (?, ?, ?, ?)";

        try (Connection con = Conector.getConexion();
            PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, numeroCuenta);
            ps.setString(2, idCliente);
            ps.setString(3, idEmpleado);
            ps.setDouble(4, monto);

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("ERROR DAO Deposito → registrarDeposito(): " + e.getMessage());
            return false;
        }
    }
}
