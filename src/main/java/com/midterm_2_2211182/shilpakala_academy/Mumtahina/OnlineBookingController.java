package com.example.shilpakala;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;


public class OnlineBookingController
{
    @javafx.fxml.FXML
    private TextField numberField;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private TextField designationField;
    @javafx.fxml.FXML
    private Label label;



    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void bookButtonOnClick(ActionEvent actionEvent) {
        label.setText(
                "Booked for Name: " + nameField.getText() + "\n" +
                        "Designation: " + designationField.getText() +
                        " Number: " + numberField.getText()
        );
    }

    @javafx.fxml.FXML
    public void BackButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"VisitorDashboard.fxml");
    }
}