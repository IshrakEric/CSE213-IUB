package com.example.shilpakala;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RegistrationController
{
    @javafx.fxml.FXML
    private TextField AddressField;
    @javafx.fxml.FXML
    private TextField NameField;
    @javafx.fxml.FXML
    private TextField PhoneField;
    @javafx.fxml.FXML
    private Label label;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void RegisterButtonOnClick(ActionEvent actionEvent) {
        label.setText(
                "Name: " + NameField.getText() + "\n" +
                        "Phone: " + PhoneField.getText() + "\n" +
                        "Address: " + AddressField.getText()
        );

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registration Successful");
        alert.setHeaderText(null);
        alert.setContentText("User has been successfully registered!");
        alert.showAndWait();

    }
    @javafx.fxml.FXML
    public void BackButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"PhotographerDashboard.fxml");
    }
}


