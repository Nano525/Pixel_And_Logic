package mx.edu.utez.pixelsandlogic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class InicioDeSesionDk1 {
    @FXML
    private TextField email;

    @FXML
    private PasswordField password;

    @FXML
    private Button onLoginButtonClicked;

    @FXML
    public void Botton(){
        String emailText = email.getText();
        String passwordText = password.getText();
        
        if(emailText.equals("Admin") && passwordText.equals("123")){
            // Cerrar la ventana actual
            Stage currentStage = (Stage) email.getScene().getWindow();
            currentStage.close();
            
            try {
                // Cargar la nueva ventana
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AdministradorArchivosAdminDk11.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                
                // Crear nueva ventana
                Stage newStage = new Stage();
                newStage.setTitle("Siguiente Pantalla");
                newStage.setScene(scene);
                
                // Hacer la ventana de pantalla completa
                newStage.setMaximized(true);
                
                // Mostrar la nueva ventana
                newStage.show();
                
            } catch (IOException e) {
                e.printStackTrace();
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Error al cargar la siguiente pantalla");
                alert.setContentText("No se pudo abrir la siguiente ventana.");
                alert.showAndWait();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error de inicio de sesión");
            alert.setHeaderText("Credenciales incorrectas");
            alert.setContentText("El email o la contraseña son incorrectos.");
            alert.showAndWait();
        }
    }

    //Tiene errores
     public void abrirOlvidasteContraseña (ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader (Main.class.getResource("RecuperarContrasenaDk12.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage newStage = new Stage();
            newStage.setTitle("Desktop 12");
            newStage.setScene(scene);
            newStage.setMaximized(true);
            newStage.showAndWait();

        }catch (IOException e){
            e.printStackTrace();
        }
     }
}