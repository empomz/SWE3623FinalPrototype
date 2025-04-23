package com.example.project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.collections.*;

import java.io.IOException;

public class StudentSchedulePageController {

    @FXML private TableView<Course> scheduleTable;
    @FXML private TableColumn<Course, String> crnColumn;
    @FXML private TableColumn<Course, String> professorColumn;
    @FXML private TableColumn<Course, String> daysColumn;
    @FXML private TableColumn<Course, String> timeColumn;
    @FXML private TableColumn<Course, String> locationColumn;

    @FXML
    public void initialize() {
        crnColumn.setCellValueFactory(data -> data.getValue().crnProperty());
        professorColumn.setCellValueFactory(data -> data.getValue().professorProperty());
        daysColumn.setCellValueFactory(data -> data.getValue().daysProperty());
        timeColumn.setCellValueFactory(data -> data.getValue().timeProperty());
        locationColumn.setCellValueFactory(data -> data.getValue().locationProperty());

        scheduleTable.setItems(FXCollections.observableArrayList(
                new Course("123", "Garyah Fumbah", "Monday\nWednesday\nFriday", "1pm–2:30pm", "Math Building 987"),
                new Course("234", "Cole Myers", "Tuesday\nThursday", "3pm–5:15pm", "Science Building 876"),
                new Course("345", "Brianna Davis", "Monday\nWednesday\nFriday", "9am–10:30am", "English Building 765"),
                new Course("456", "Obipoku Obotette", "Tuesday\nThursday", "11am–12:45pm", "Engineering Building 654"),
                new Course("567", "Michael Franklin", "Monday\nWednesday", "4:30pm–6pm", "History Building 433")
        ));
    }

    @FXML private void goToMain() { switchScene("Main.fxml"); }
    @FXML private void goToProfile() { switchScene("Profile.fxml"); }
    @FXML private void goToSchedule() { switchScene("StudentSchedulePage.fxml"); }
    @FXML private void goToAdvisor() { switchScene("AcademicAdvisorScreen.fxml"); }
    @FXML private void logout() { switchScene("Login.fxml"); }

    private void switchScene(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();
            Stage stage = (Stage) scheduleTable.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}