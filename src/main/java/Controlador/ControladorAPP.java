package Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

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
 void mostrarChats(MouseEvent event) throws FileNotFoundException {
  for (int usuarios = 0; usuarios < 10; usuarios++) {
  crearChat("Usuario " + usuarios, "Mensaje " + usuarios);
   addMessageLeft("Hello! How are you?");
   addMessageRight("I'm good, thanks! How about you?");
   addMessageLeft("I'm doing well. What are you up to?");
   addMessageRight("Just working on a JavaFX project.");
  }
 }

 private void crearChat(String name, String message) {
  // todo: implementar creación de user utilizan la base de datos.
  SplitPane chatPane = new SplitPane();
  chatPane.setPrefWidth(200);
  chatPane.setPrefHeight(50);

  // Crear el panel izquierdo con la imagen
  ImageView imageView = new ImageView(new Image("https://static.vecteezy.com/system/resources/previews/019/879/198/original/user-icon-on-transparent-background-free-png.png"));
  imageView.setFitHeight(50);
  imageView.setFitWidth(50);

  // Crear el panel derecho con el nombre del chat
  HBox rightPane = new HBox();
  rightPane.setPrefHeight(50);
  rightPane.setPrefWidth(150);
  rightPane.getChildren().add(new Label(name));

  // Añadir los paneles al SplitPane
  chatPane.getItems().addAll(imageView, rightPane);

  // Añadir el SplitPane al VBox de usuarios
  usersBox.getChildren().add(chatPane);
 }

 public void setStage(Stage stage) {
  this.stage = stage;
 }

 @FXML
 void iniciarConversación(MouseEvent event) {

 }
 private void addMessageLeft(String message) {
  HBox hbox = new HBox();
  hbox.setAlignment(Pos.TOP_LEFT);
  Label label = new Label(message);
  label.setStyle("-fx-background-color: #e0e0e0; -fx-padding: 10; -fx-border-radius: 10; -fx-background-radius: 10;");
  hbox.getChildren().add(label);
  conversacionUsuario.getChildren().add(hbox);
 }

 private void addMessageRight(String message) {
  HBox hbox = new HBox();
  hbox.setAlignment(Pos.TOP_RIGHT);
  Label label = new Label(message);
  label.setStyle("-fx-background-color: #a0e0ff; -fx-padding: 10; -fx-border-radius: 10; -fx-background-radius: 10;");
  hbox.getChildren().add(label);
  conversacionUsuario.getChildren().add(hbox);
 }
}
