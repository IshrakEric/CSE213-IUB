package com.example.shilpakala;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;

public class PaymentVisitorController {

    @FXML
    private RadioButton advancePaymentRB;
    @FXML
    private RadioButton fullPaymentRB;
    @FXML
    private Label label;
    @FXML
    private ComboBox<String> comboBox;

    private ToggleGroup paymentToggleGroup = new ToggleGroup();

    @FXML
    public void initialize() {
        comboBox.getItems().addAll("Bkash", "Nagad", "Bank");

        advancePaymentRB.setToggleGroup(paymentToggleGroup);
        fullPaymentRB.setToggleGroup(paymentToggleGroup);
    }

    @FXML
    public void BackButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "VisitorDashboard.fxml");
    }

    @FXML
    public void ConfirmButtonOnClick(ActionEvent actionEvent) {
        String selectedMethod = comboBox.getValue();

        RadioButton selectedRadioButton = (RadioButton) paymentToggleGroup.getSelectedToggle();
        if (selectedRadioButton == null) {
            label.setText("Please select a payment type.");
            return;
        }

        String paymentType = selectedRadioButton.getText();

        if (selectedMethod == null || selectedMethod.isEmpty()) {
            label.setText("Please select a payment method.");
            return;
        }

        label.setText(paymentType + " Done by " + selectedMethod + "\nPayment Successful");
    }
}
