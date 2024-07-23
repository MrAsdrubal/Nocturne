package Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class ControladorRegistro {
    private Stage stage;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

}