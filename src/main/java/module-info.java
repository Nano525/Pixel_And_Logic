module main.resources.pixelsandlogic {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.resources.pixelsandlogic to javafx.fxml;
    exports main.resources.pixelsandlogic;
}