package com.example.recommended;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class EnrollmentController implements Initializable {
    @FXML
    public VBox vbox;
@FXML
    public ImageView screen;
@FXML
    public ChoiceBox<String> selectMajor = new ChoiceBox<>();
    @FXML
    public ChoiceBox<String> selectTerm = new ChoiceBox<>();
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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        selectMajor.getItems().addAll("Art History", "Computer Science");

        selectTerm.getItems().addAll("Fall 2024", "Spring 2025");
    }
    @FXML
    protected void continueButton() throws IOException {
        String majorChoice = selectMajor.getValue();
        String termChoice = selectTerm.getValue();
if(majorChoice.matches("Art History")) {
    Stage stage = new Stage();
    FXMLLoader fxmlLoader = new FXMLLoader(EnrollmentApplication.class.getResource("pageAH.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 283, 618);
    stage.setTitle("Enrollment");
    stage.setScene(scene);
    stage.show();
}
        if(majorChoice.matches("Computer Science")) {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(EnrollmentApplication.class.getResource("pageCS.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 283, 618);
            stage.setTitle("Enrollment");
            stage.setScene(scene);
            stage.show();
        }

    }

}