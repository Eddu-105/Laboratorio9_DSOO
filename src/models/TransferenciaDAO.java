package models;

import models.Conector;
import java.sql.*;

public class TransferenciaDAO {
    
    public boolean registrarTransferencia(String cuentaOrigen, String cuentaDestino,
                                          String idCliente, String idEmpleado,
                                          double monto) {
        String sql = "INSERT INTO transferencias (numero_cuenta_origen, numero_cuenta_destino, idcliente, idempleado, monto) "
                   + "VALUES (?, ?, ?, ?, ?)";
        try (Connection con = Conector.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, cuentaOrigen);
            ps.setString(2, cuentaDestino);
            ps.setString(3, idCliente);
            ps.setString(4, idEmpleado);
            ps.setDouble(5, monto);

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("ERROR DAO Transferencia → registrarTransferencia(): " + e.getMessage());
            return false;
        }
    }
}
