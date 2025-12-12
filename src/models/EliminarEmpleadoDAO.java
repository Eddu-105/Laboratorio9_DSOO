package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class EliminarEmpleadoDAO {
    
    private Connection conexion;

    public EliminarEmpleadoDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public boolean eliminarEmpleado(String idEmpleado) {
        String sql = "DELETE FROM empleado WHERE idEmpleado = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, idEmpleado);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
