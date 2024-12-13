package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SupportProjectsController {

    @FXML
    private RadioButton bankTransferRadioButton;

    @FXML
    private RadioButton creditCardRadioButton;

    @FXML
    private TextField donationAmountField;

    @FXML
    private TextArea messageArea;

    @FXML
    private RadioButton mobilePaymentRadioButton;

    @FXML
    private ToggleGroup paymentToggleGroup;

    @FXML
    private ComboBox<?> projectComboBox;

    @FXML
    private Button submitDonationButton;

}
