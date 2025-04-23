package com.example.project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;

public class AcademicAdvisorScreenController {

    @FXML private ComboBox<String> appointmentTypeComboBox;
    @FXML private DatePicker datePicker;
    @FXML private Spinner<Integer> hourSpinner;
    @FXML private Spinner<Integer> minuteSpinner;
    @FXML private ComboBox<String> formatComboBox;

    @FXML
    public void initialize() {
        hourSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 12, 1));
        minuteSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, 0));
    }

    @FXML
    private void handleSubmit() {
        String appointmentType = appointmentTypeComboBox.getValue();
        String date = (datePicker.getValue() != null) ? datePicker.getValue().toString() : "Not selected";
        int hour = hourSpinner.getValue();
        int minute = minuteSpinner.getValue();
        String format = formatComboBox.getValue();

        System.out.println("Appointment: " + appointmentType + " on " + date +
                " at " + hour + ":" + String.format("%02d", minute) + " - " + format);
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
            Stage stage = (Stage) hourSpinner.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}