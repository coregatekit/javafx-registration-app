module dev.coregate.registrationapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens dev.coregate.registrationapp to javafx.fxml;
    exports dev.coregate.registrationapp;
}