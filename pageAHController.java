package com.example.recommended;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class pageAHController extends EnrollmentController {
    @FXML
    public VBox vbox;
    @FXML
    public ImageView screen;
    @FXML
    public Button enrollButton;
    @FXML
    public Label majorLabel;
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
    public CheckBox one = new CheckBox("2201 Art History I");
    @FXML
    public CheckBox two = new CheckBox("2202 Art History II");
    @FXML
    public CheckBox three = new CheckBox("2209 Digital Art I");
    @FXML
    public CheckBox four = new CheckBox("2210 Sculpture Art");
    @FXML
    public CheckBox five = new CheckBox("3001 Painting I");

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
            s += "2201 Art History I\n";
        }
        if(two.isSelected()) {
            s+= "2202 Art History II\n";
        }
        if(three.isSelected()) {
            s+= "2209 Digital Art I\n";
        }
        if(four.isSelected()) {
            s+= "2210 Sculpture Art\n";
        }
        if(five.isSelected()) {
            s+= "3001 Painting I\n";
        }
        System.out.println(s);
    }

}
