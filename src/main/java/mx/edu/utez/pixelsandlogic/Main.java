package mx.edu.utez.pixelsandlogic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("InicioDeSesionDk1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = new Stage();
        newStage.setTitle("Login");
        newStage.setScene(scene);

        // Hacer la ventana de pantalla completa
        newStage.setMaximized(true);
        // Mostrar la nueva ventana
        newStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}