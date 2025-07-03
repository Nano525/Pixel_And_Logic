package mx.edu.utez.pixelsandlogic;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class desktop11Controller {
    
    @FXML
    private TextField matriculaField;
    
    @FXML
    private Button registroAlumnosButton;
    
    @FXML
    public void initialize() {
        // Inicialización del controlador
    }
    
    @FXML
    public void onRegistroAlumnosClicked() {
        // Acción para el botón de registro de alumnos
        System.out.println("Botón de registro de alumnos clickeado");
    }
    
} 