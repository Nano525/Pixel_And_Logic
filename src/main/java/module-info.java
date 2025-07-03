module main.resources.pixelsandlogic {
    requires javafx.controls;
    requires javafx.fxml;


    opens mx.edu.utez.pixelsandlogic to javafx.fxml;
    exports mx.edu.utez.pixelsandlogic;
}