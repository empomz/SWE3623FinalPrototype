package com.example.swe3623prototype;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CRUDPageApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EnrollmentApplication.class.getResource("CRUDPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 283, 618);
        stage.setTitle("CRUDPage");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}