package Controlador;

import Logica.Autenticacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControladorInicioSesion {
    private Stage stage;
    @FXML
    private PasswordField contraseña;
    @FXML
    private Label errorMensaje;
    @FXML
    private TextField user;
    @FXML
    void initialize() {
        // Añade listeners para ocultar el mensaje de error cuando el usuario empieza a escribir
        user.textProperty().addListener((observable, oldValue, newValue) -> ocultarError());
        contraseña.textProperty().addListener((observable, oldValue, newValue) -> ocultarError());
    }
    @FXML
    void validarCuenta(ActionEvent event) {
        if (!Autenticacion.autenticar(user.getText(), contraseña.getText())) {
            user.clear();
            contraseña.clear();
            errorMensaje.setVisible(true);
        }
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    // Oculta el mensaje de error cuando se presiona requiere ingresar una acción de nuevo
    @FXML
    void ocultarError() {
        errorMensaje.setVisible(false);
    }
}


