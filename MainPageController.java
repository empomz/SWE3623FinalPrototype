package com.example.swe3623prototype;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;

public class MainPageController {


    @FXML private Button recommendedCourses;
    @FXML private Button mainButton;
    @FXML private Button profileButton;
    @FXML private Button SDSButton;
    @FXML private Button advisorButton;
    @FXML private Button logOutButton;
    @FXML private Button paymentPortalButton;
    @FXML private Button classEnrollment;
    @FXML private Button SDS2Button;
    @FXML private Button advisor2Button;
    @FXML private Button account2Button;



    @FXML private void goToMain() { switchScene("MainPage.fxml"); }
    @FXML private void goToProfile() { switchScene("Profile.fxml"); }
    @FXML private void goToSchedule() { switchScene("StudentSchedulePage.fxml"); }
    @FXML private void goToAdvisor() { switchScene("AcademicAdvisorScreen.fxml"); }
    @FXML private void goToEnrollment(){ switchScene("EnrollmentPage.fxml");}
    @FXML private void goToRecommended(){ switchScene("RecommendedPage.fxml");}
    @FXML private void goToPayment(){ switchScene("com/example/swe3623prototype/PaymentPage.fxml");}
    @FXML private void logout() { switchScene("LoginPage.fxml"); }



    private void switchScene(String fxmlFile) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}