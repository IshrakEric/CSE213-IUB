package com.midterm_2_2211182.shilpakala_academy.Mumtahina;

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
        BookedCustomer newCustomer = new BookedCustomer(
                nameField.getText(),
                designationField.getText(),
                numberField.getText()
        );

        label.setText(newCustomer.print());

    }

    @javafx.fxml.FXML
    public void BackButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"VisitorDashboard.fxml");
    }
}