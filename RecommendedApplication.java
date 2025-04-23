package com.example.recommended;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RecommendedApplication extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(EnrollmentApplication.class.getResource("RecommendedPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 283, 618);
        stage.setTitle("Enrollment");
        stage.setScene(scene);
        stage.show();
    }
}

