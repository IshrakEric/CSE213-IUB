package com.midterm_2_2211182.shilpakala_academy;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Login_and_SignUp {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @javafx.fxml.FXML
    public void login_button_1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login_Data.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void signup_button_1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Sign_Up.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
