package com.example.javafx0312;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLExample extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FXMLExample.class.getResource("login_view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 300, 275);

        stage.setTitle("FXML Welcome");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}