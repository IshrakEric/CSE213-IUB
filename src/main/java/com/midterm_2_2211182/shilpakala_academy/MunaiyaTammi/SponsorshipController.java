package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SponsorshipController {

    @FXML
    private RadioButton artistSponsorRadioButton;

    @FXML
    private RadioButton bankTransferRadioButton;

    @FXML
    private Button cancelButton;

    @FXML
    private RadioButton creditCardRadioButton;

    @FXML
    private RadioButton eventSponsorRadioButton;

    @FXML
    private TextArea messageTextArea;

    @FXML
    private TextField sponsorshipAmountField;

    @FXML
    private ComboBox<?> sponsorshipOptionsBox;

    @FXML
    private Button submitSponsorshipButton;

}
