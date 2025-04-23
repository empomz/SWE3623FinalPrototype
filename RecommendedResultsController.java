package com.example.recommended;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class RecommendedResultsController {
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
        public CheckBox one = new CheckBox("1111 College Algebra");
        @FXML
        public CheckBox two = new CheckBox("2201 Art History I");
        @FXML
        public CheckBox three = new CheckBox("1200 Science");
        @FXML
        public CheckBox four = new CheckBox("1400 Music");

        @FXML
        public Button back;
        @FXML
        protected void goBack() throws IOException {
                Stage stage = new Stage();
                FXMLLoader fxmlLoader = new FXMLLoader(EnrollmentApplication.class.getResource("RecommendedPage.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 283, 618);
                stage.setTitle("Enrollment");
                stage.setScene(scene);
                stage.show();

        }
        @FXML
        protected void enrollClasses() {
                enrollButton.setOnAction(en -> enrollment(one, two, three, four));

        }
        private void enrollment(CheckBox one, CheckBox two, CheckBox three, CheckBox four) {
                String s = "Successfully enrolled in: \n";
                if(one.isSelected()) {
                        s += "1111 College Algebra\n";
                }
                if(two.isSelected()) {
                        s+= "2201 Art History I\n";
                }
                if(three.isSelected()) {
                        s+= "1200 Science\n";
                }
                if(four.isSelected()) {
                        s+= "1400 Music\n";
                }
                System.out.println(s);
        }
}
