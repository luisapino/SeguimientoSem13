package com.example.seguimientosem13;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        showWindow("Login.fxml");
    }

    public static void main(String[] args) {
        launch();
    }

    public static void showWindow(String fxml) throws IOException{

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(
                    HelloApplication.class.getResource(fxml));

            Parent node = fxmlLoader.load();// el parent es el node
            Scene scene = new Scene(node);
            Stage window = new Stage();
            window.setScene(scene);
            window.show();
        }catch (IOException ex){
            ex.printStackTrace();

        }
    }
}

