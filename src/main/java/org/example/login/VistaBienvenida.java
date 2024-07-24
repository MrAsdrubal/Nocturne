package org.example.login;

import Controlador.ControladorBienvenida;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class VistaBienvenida extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(VistaBienvenida.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage.setScene(scene);
        ControladorBienvenida controladorRegistro = fxmlLoader.getController();
        controladorRegistro.setStage(stage);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}