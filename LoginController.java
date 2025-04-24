package com.example.swe3623prototype;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class LoginController implements Initializable {

    @FXML
    public Button loginButton;
    @FXML
    public TextField netID;
    @FXML
    public TextField password;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void checkLogin() throws IOException{

        if (netID.getText() == "001079988" && password.getText() == "1234"){

            System.out.println("Success!");


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Main.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();


        } else

            System.out.println("Sorry Incorrect! (For Prototype use 001079988 for NetID and 1234 for pass)");


    }


}