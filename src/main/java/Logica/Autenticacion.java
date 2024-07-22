package Logica;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Autenticacion {
    public static boolean autenticar(String usuario, String contrasena) {
        return usuario.equals("admin") && contrasena.equals("admin");
    }

    public static boolean validarContrasena(String contrasena) {

        Pattern patron = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$#!%*?&])[A-Za-z\\d$@$#!%*?&]{8,}");

        // Compilar el patrón
        Matcher matcher = patron.matcher(contrasena);

        // Devolver true si la contraseña coincide con el patrón, false en caso contrario
        return matcher.matches();
    }
}
