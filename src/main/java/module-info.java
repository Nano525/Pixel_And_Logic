module main.resources.pixelsandlogic {
    requires javafx.controls;
    requires javafx.fxml;
    requires ucp;
    requires java.sql;


    opens mx.edu.utez.pixelsandlogic to javafx.fxml;
    exports mx.edu.utez.pixelsandlogic;
}