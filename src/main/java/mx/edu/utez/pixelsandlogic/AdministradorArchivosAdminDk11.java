package mx.edu.utez.pixelsandlogic;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

public class AdministradorArchivosAdminDk11 {
    
    @FXML
    private TextField matriculaField;
    
    @FXML
    private Button registroAlumnosButton;
    @FXML
    private Button salirButton;
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

    private void toggleMenu() {
        if (sideMenu != null) {
            sideMenu.setVisible(!sideMenu.isVisible());
        }
    }

    @FXML
    public void onRegistroAlumnosClicked() {
        // Acción para el botón de registro de alumnos
        System.out.println("Botón de registro de alumnos clickeado");
    }
    @FXML
    public void onSalirClicked() {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) salirButton.getScene().getWindow();
            currentStage.close();
            
            // Cargar la pantalla de inicio de sesión
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InicioDeSesionDk1.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Crear nueva ventana
            Stage newStage = new Stage();
            newStage.setTitle("Inicio de Sesión");
            newStage.setScene(scene);
            
            // Hacer la ventana de pantalla completa
            newStage.setMaximized(true);
            
            // Mostrar la nueva ventana
            newStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error al cargar la pantalla de inicio de sesión");
            alert.setContentText("No se pudo abrir la pantalla de inicio de sesión.");
            alert.showAndWait();
        }
    }
} 