package org.example.login;

import Controlador.ControladorAPP;
import Controlador.ControladorBienvenida;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class VistaBienvenida extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(VistaBienvenida.class.getResource("App.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 550);
        stage.setScene(scene);
        ControladorAPP controladorAPP = fxmlLoader.getController();
        controladorAPP.setStage(stage);
        stage.show();
//        ControladocorBienvenida controladorRegistro = fxmlLoader.getController();
//        controladorRegistro.setStage(stage);
//        stage.show();
   }

    public static void main(String[] args) {
        launch();


//            ConexiónUsuario personaDAO = new ConexiónUsuario();
//            List<Usuario> usuarios = personaDAO.obtenerUsuario();
//
//            if (((List<?>) usuarios).isEmpty()) {
//                System.out.println("No se encontraron personas.");
//            } else {
//                System.out.println("Lista de Hoteles:");
//                for (Usuario usuario : usuarios) {
//
//                    System.out.println("CodigoUnico:" + usuario.getCodigoUnico());
//                    System.out.println("Nombre: " + usuario.getNombre());
//                    System.out.println("Apellido:" + usuario.getApellido());
//                    System.out.println("Contraseña:" + usuario.getConstraseña());
//                    System.out.println("------------------------");


    }
}