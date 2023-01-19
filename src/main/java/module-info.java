module com.example.wheeloffortune {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires lombok;

    opens com.example.wheeloffortune to javafx.fxml;
    exports com.example.wheeloffortune;
    exports com.example.wheeloffortune.UI;
    opens com.example.wheeloffortune.UI to javafx.fxml;
}