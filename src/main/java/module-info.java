module org.example.login {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.login to javafx.fxml;
    exports org.example.login;
    exports Controlador;
    opens Controlador to javafx.fxml;
}