package com.example.recommended;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EnrollmentApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EnrollmentApplication.class.getResource("EnrollmentPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 283, 618);
        stage.setTitle("Enrollment");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}