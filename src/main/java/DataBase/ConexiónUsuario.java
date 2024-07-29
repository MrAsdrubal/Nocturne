package DataBase;

import Logica.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConexiónUsuario extends ConexionBD{

    public List<Usuario> obtenerUsuario() {
        List<Usuario> clientes = new ArrayList<>();

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement statement = conexion.prepareStatement("SELECT  FROM Persona");
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String personaId = resultSet.getString("id");
                String personaNombre = resultSet.getString("nombre");
                String personaApellido = resultSet.getString("apellido");
                String personaEdad = resultSet.getString("edad");

                Usuario persona = new Usuario(personaId,personaNombre, personaApellido,personaEdad);
                clientes.add(persona);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener los datos de la persona: " + e.getMessage());
        }
        return clientes;
    }

}
