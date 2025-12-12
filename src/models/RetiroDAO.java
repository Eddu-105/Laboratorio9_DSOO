package models;
import models.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class RetiroDAO {
    public static boolean registrarRetiro(String numeroCuenta, String idCliente, String idEmpleado, double monto) {
        try {
            Connection cn = Conector.getConexion();
            String sql = "INSERT INTO depositos (numero, id_cliente, id_empleado, monto) " + "VALUES (?, ?, ?, ?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, numeroCuenta);
            ps.setString(2, idCliente);
            ps.setString(3, idEmpleado);
            ps.setDouble(4, monto);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error guardando depósito: " + e.getMessage());
            return false;
        }
    }
}
