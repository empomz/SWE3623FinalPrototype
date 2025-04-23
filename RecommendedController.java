package com.example.recommended;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RecommendedController implements Initializable {
    @FXML
    public VBox vbox;
    @FXML
    public ImageView screen;
    @FXML
    public ChoiceBox<String> selectMajor = new ChoiceBox<>();
    @FXML
    public ChoiceBox<String> selectYear = new ChoiceBox<>();
    @FXML
    public Button button;
    @FXML
    public Label majorLabel;
    @FXML
    public Label yearLabel;
    @FXML
    public Button mainButton;
    @FXML
    public Button profileButton;
    @FXML
    public Button scheduleButton;
    @FXML
    public Button advisorButton;
    @FXML
    public Button logoutButton;
    @FXML
    public CheckBox morningClasses;
    @FXML
    public CheckBox afternoonClasses;
    @FXML
    public CheckBox eveningClasses;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        selectMajor.getItems().addAll("Art History");

        selectYear.getItems().addAll("Freshmen");
    }

    public void submitButton(ActionEvent actionEvent) throws IOException {
        String majorChoice = selectMajor.getValue();
        String yearChoice = selectYear.getValue();
        if (majorChoice.matches("Art History") && yearChoice.matches("Freshmen")) {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(EnrollmentApplication.class.getResource("RecommendedResults.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 283, 618);
            stage.setTitle("Enrollment");
            stage.setScene(scene);
            stage.show();
        }


    }
}
