package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class DonationController {

    @FXML
    private TextField amountField;

    @FXML
    private RadioButton artistRadioButton;

    @FXML
    private RadioButton bankTransferRadioButton;

    @FXML
    private ComboBox<String> contributionOptionsBox;

    @FXML
    private RadioButton creditCardRadioButton;

    @FXML
    private RadioButton eventRadioButton;

    @FXML
    private TextArea messageTextArea;

    @FXML
    private ToggleGroup paymentGroup;

    @FXML
    private Button submitDonationButton;

    @FXML
    private ToggleGroup toggleGroup;

    @FXML
    void onsubmitDonationButtonClick(ActionEvent event) {

    }

}
