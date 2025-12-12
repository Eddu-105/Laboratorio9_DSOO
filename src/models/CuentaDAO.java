package models;

import com.mycompany.laboratorio9.models.Cuenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.Conector;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mycompany.laboratorio9.models.Cliente;

public class CuentaDAO {

   private Connection conexion;

    public CuentaDAO(Connection conexion) {
        this.conexion = conexion;
    }
    public Cuenta obtenerCuenta(String numero) {

        String sql = "SELECT * FROM cuenta WHERE numero = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, numero);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String tipo = rs.getString("tipo");
                double saldo = rs.getDouble("saldo");

                // Lista vacía porque no manejas titulares en SQL
                ArrayList<Cliente> titulares = new ArrayList<>();

                return new Cuenta(numero, tipo, saldo, titulares);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null; 
    }
    public boolean actualizarSaldo(String numero, double nuevoSaldo) {

        String sql = "UPDATE cuenta SET saldo = ? WHERE numero = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setDouble(1, nuevoSaldo);
            ps.setString(2, numero);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean eliminarCuenta(String numero) {
        String sql = "DELETE FROM cuenta WHERE numero = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, numero);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
