package mx.edu.utez.pixelsandlogic;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class AdministradorArchivosAdminDk11 {
    
    @FXML
    private TextField matriculaField;
    
    @FXML
    private Button registroAlumnosButton;
    
    @FXML
    private Button menuButton;
    @FXML
    private VBox sideMenu;

    @FXML
    public void initialize() {
        // Inicialización del controlador
        // Asegurarse de que el menú esté oculto al iniciar
        if (sideMenu != null) {
            sideMenu.setVisible(false);
        }
        if (menuButton != null) {
            menuButton.setOnAction(event -> toggleMenu());
        }
    }
    
    @FXML
    public void onRegistroAlumnosClicked() {
        // Acción para el botón de registro de alumnos
        System.out.println("Botón de registro de alumnos clickeado");
    }

    private void toggleMenu() {
        if (sideMenu != null) {
            sideMenu.setVisible(!sideMenu.isVisible());
        }
    }
} 