package com.midterm_2_2211182.shilpakala_academy.Mumtahina;

import javafx.event.ActionEvent;
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
        RegisteredUsers newUser = new RegisteredUsers(
                NameField.getText(),
                PhoneField.getText(),
                AddressField.getText()
        );

        label.setText(newUser.print());

    }
    @javafx.fxml.FXML
    public void BackButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"VisitorDashboard.fxml");
    }
}


