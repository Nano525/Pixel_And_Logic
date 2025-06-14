package main.resources.pixelsandlogic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;

    @FXML
    protected void initialize() {
        // Puedes agregar inicializaciones si lo necesitas
    }

    @FXML
    protected void onLoginButtonClick(ActionEvent event) {
        String email = emailField.getText();
        String password = passwordField.getText();
        // Usuario y contraseña de ejemplo
        if (email.equals("profesor@utez.edu.mx") && password.equals("1234")) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/resources/pixelsandlogic/registro-profesores.fxml"));
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setTitle("Registro de profesores");
                stage.setScene(new Scene(root));
                stage.setMaximized(true);
                stage.show();
                // Cerrar la ventana de login
                ((Stage) emailField.getScene().getWindow()).close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error de inicio de sesión");
            alert.setHeaderText(null);
            alert.setContentText("Usuario o contraseña incorrectos");
            alert.showAndWait();
        }
    }
}