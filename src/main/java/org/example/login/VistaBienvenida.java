package org.example.login;

import Controlador.ControladorRegistro;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class VistaRegistro extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(VistaRegistro.class.getResource("InicioSesion.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 650, 450);
        stage.setScene(scene);
        ControladorRegistro controladorRegistro = fxmlLoader.getController();
        controladorRegistro.setStage(stage);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}