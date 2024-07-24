package Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.example.login.VistaBienvenida;

import java.io.IOException;


public class ControladorBienvenida {
    private Stage stage;
    @FXML
    private Label welcomeText;

    @FXML
    protected void ejecutarLogin(ActionEvent event) throws IOException {
        // Se cierra la pantalla de bienvenida
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();

        // Se ejecuta el comando para abrir la ventana de Inicio de Sesion
        Stage stage2 = new Stage();
        FXMLLoader fxmlLoader  = new FXMLLoader(VistaBienvenida.class.getResource("InicioSesion.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage2.setScene(scene);
        ControladorInicioSesion controladorInicioSesion = fxmlLoader.getController();
        controladorInicioSesion.setStage(stage);
        stage2.show();
    }
    @FXML
    protected  void ejecutarRegistro(ActionEvent event ) throws IOException {
        // Se cierra la pantalla de bienvenida
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
        // Se ejecuta el comando para abrir la ventana de Registro
        Stage stage3 = new Stage();
        FXMLLoader fxmlLoader2  = new FXMLLoader(VistaBienvenida.class.getResource("register.fxml"));
        Scene scene2 = new Scene(fxmlLoader2.load(), 700, 500);
        stage3.setScene(scene2);
        ControladorRegistro controladorRegistro = fxmlLoader2.getController();
        controladorRegistro.setStage(stage);
        stage3.show();
    }

// Guarda el contenedor de la vista anterior (Vista de registro)
    public void setStage(Stage stage) {
        this.stage = stage;
    }

}