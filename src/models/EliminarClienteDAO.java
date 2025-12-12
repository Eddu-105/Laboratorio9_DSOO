package models;

import com.mycompany.laboratorio9.models.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EliminarClienteDAO {
    
    private Connection conexion;

    public EliminarClienteDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public boolean eliminarCliente(String idCliente) {
        String sql = "DELETE FROM cliente WHERE idCliente = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, idCliente);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
