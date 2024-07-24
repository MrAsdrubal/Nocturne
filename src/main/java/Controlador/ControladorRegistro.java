package Controlador;

import Logica.Autenticacion;
import com.dlsc.formsfx.model.structure.PasswordField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControladorRegistro {
    @FXML
private Stage stage;
    @FXML
    private TextField nombresUsuario;

    @FXML
    private TextField apellidosUsuario;
    @FXML
    private PasswordField contrasena;
    @FXML
    private Label estadoContraseña;

    @FXML
    private PasswordField contrasenaConfirmada;

    @FXML
    void initialize() {
        // Añade un listener al campo de contraseña para evaluar la seguridad de la contraseña mientras se escribe
       // contrasena.idProperty().addListener((observable, oldValue, newValue) -> evaluarSeguridadContraseña(newValue));
    }

    private void evaluarSeguridadContraseña(String contraseña) {
//        if(Autenticacion.validarContrasena(contraseña)) {
//            estadoContraseña.setText("Contraseña segura");
//        } else {
//            estadoContraseña.setText("Contraseña insegura");
//        }
    }

    @FXML
    void validarContraseña(ActionEvent event) {
        // verificar que todos los campos estén llenos
//        if (nombresUsuario.getText().isEmpty() || apellidosUsuario.getText().isEmpty() || contrasena.getID().isEmpty() || contrasenaConfirmada.getID().isEmpty()) {
//            estadoContraseña.setText("Por favor, llene todos los campos");
//        }
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }


}
