package com.example.recommended;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxListCell;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class pageCSController  {
    @FXML
    public VBox vbox;
    @FXML
    public ImageView screen;

    @FXML
    public Button enrollButton;
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
    public CheckBox one;
    @FXML
    public CheckBox two;
    @FXML
    public CheckBox three;
    @FXML
    public CheckBox four;
    @FXML
    public CheckBox five;
@FXML
    public Button back;
@FXML
    protected void goBack() throws IOException {
    Stage stage = new Stage();
    FXMLLoader fxmlLoader = new FXMLLoader(EnrollmentApplication.class.getResource("EnrollmentPage.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 283, 618);
    stage.setTitle("Enrollment");
    stage.setScene(scene);
    stage.show();
}
    @FXML
    protected void enrollClasses() {
        enrollButton.setOnAction(en -> enrollment(one, two, three, four, five));

    }
    private void enrollment(CheckBox one, CheckBox two, CheckBox three, CheckBox four, CheckBox five) {
        String s = "Successfully enrolled in: \n";
        if(one.isSelected()) {
            s += "3001 Computer Science I\n";
        }
        if(two.isSelected()) {
            s+= "3002 Computer Science II\n";
        }
        if(three.isSelected()) {
            s+= "2209 Technical Writing\n";
        }
        if(four.isSelected()) {
            s+= "3503 Data Structures\n";
        }
        if(five.isSelected()) {
            s+= "3113 Intro to SWE\n";
        }
        System.out.println(s);
    }

}


