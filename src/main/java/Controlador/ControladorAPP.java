package Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControladorAPP {

    @FXML
    private VBox conversacionUsuario;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private VBox usersBox;

    @FXML
    private Stage stage;

    @FXML
    private void enviarMensaje(ActionEvent event) {
        // Implementar envío de mensaje
    }

    @FXML
    protected void seleccionChat(ActionEvent event) {
        // Implementar selección de chat
    }

    @FXML
    protected void abrirConfiguracion() {
        // Implementar apertura de configuración
    }

    @FXML
    protected void cerrarSesion(ActionEvent event) {
        // Implementar cierre de sesión
    }

    @FXML
    void mostrarChats(MouseEvent event) {
        for (int usuarios = 0; usuarios < 10; usuarios++) {
            crearChat("Usuario " + usuarios, "Mensaje " + usuarios);
            addMessageLeft("HOla como estás te quería preguntar como van todas las cosas por allá. Si está yendo bien entonces no tengo nada más porque preocuparme, nos vemos luego ");
            addMessageRight("I'm good, thanks! How about you?");
            addMessageLeft("I'm doing well. What are you up to?");
            addMessageRight("Just working on a JavaFX project.");
        }
    }

    private void crearChat(String name, String message) {
        HBox chatPane = new HBox();
        chatPane.setPrefWidth(334);
        chatPane.setPrefHeight(50);

        // Crear el panel izquierdo con la imagen
        ImageView imageView = new ImageView();
        try {
            imageView.setImage(new Image("https://static.vecteezy.com/system/resources/previews/019/879/198/original/user-icon-on-transparent-background-free-png.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        imageView.setFitHeight(50);
        imageView.setFitWidth(50);

        // Crear el panel derecho con el nombre del chat
        VBox rightPane = new VBox();
        rightPane.setPrefHeight(50);
        rightPane.setPrefWidth(150);
        rightPane.getChildren().add(new Label(name));

        // Añadir los paneles al HBox
        chatPane.getChildren().addAll(imageView, rightPane);

        // Añadir el HBox al VBox de usuarios
        usersBox.getChildren().add(chatPane);
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    void iniciarConversación(MouseEvent event) {
        // Implementar inicio de conversación
    }

    private void addMessageLeft(String message) {
        addMessage(message, Pos.TOP_LEFT, "10:30");
    }

    private void addMessageRight(String message) {
        addMessage(message, Pos.TOP_RIGHT, "10:31");
    }

    private void addMessage(String message, Pos alignment, String time) {
        VBox vbox = new VBox();
        vbox.maxHeight(200);
        vbox.maxWidth(338);
        vbox.setAlignment(alignment);

        Label texto = new Label("");
        texto.setPrefWidth(250); // Ajusta el ancho deseado
        texto.setMaxWidth(250); // Est
        System.out.println(texto.isWrapText());
        texto.setWrapText(true);
        System.out.println(texto.isWrapText());
        texto.setText(message);
        Label timeLabel = new Label(time);

        texto.setStyle("-fx-background-color: #ff7e5f, #feb47b; -fx-background-radius: 10px; -fx-padding: 10px;");

        vbox.getChildren().addAll(texto, timeLabel);

        conversacionUsuario.getChildren().add(vbox);
    }
}
