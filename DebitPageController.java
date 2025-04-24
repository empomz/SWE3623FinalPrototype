package com.example.swe3623prototype;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;

public class DebitPageController {



    @FXML private Button mainButton;
    @FXML private Button profileButton;
    @FXML private Button SDSButton;
    @FXML private Button advisorButton;
    @FXML private Button logOutButton;
    @FXML private Button submit;

    @FXML private TextField fullName;
    @FXML private TextField cardNumber;
    @FXML private TextField expiration;
    @FXML private TextField CVC;






    @FXML private void goToMain() { switchScene("MainPage.fxml"); }
    @FXML private void goToProfile() { switchScene("Profile.fxml"); }
    @FXML private void goToSchedule() { switchScene("StudentSchedulePage.fxml"); }
    @FXML private void goToAdvisor() { switchScene("AcademicAdvisorScreen.fxml"); }
    @FXML private void goToEnrollment(){ switchScene("EnrollmentPage.fxml");}
    @FXML private void goToRecommended(){ switchScene("RecommendedPage.fxml");}
    @FXML private void goToPayment(){ switchScene("PaymentPage.fxml");}
    @FXML private void goToDebit(){ switchScene("DebitPage.fxml");}
    @FXML private void goToCheck(){ switchScene("CheckPage.fxml");}
    @FXML private void logout() { switchScene("LoginPage.fxml"); }




    @FXML private void submit(){

        System.out.println("Payment Submitted!");
        goToMain();

    }

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