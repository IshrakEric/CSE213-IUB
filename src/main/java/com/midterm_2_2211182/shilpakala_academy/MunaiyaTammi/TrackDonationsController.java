package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class TrackDonationsController {

    @FXML
    private ToggleGroup FilterGroup;

    @FXML
    private TableColumn<?, ?> amountColumn;

    @FXML
    private RadioButton artistRadioButton;

    @FXML
    private TableColumn<?, ?> dateColumn;

    @FXML
    private TableView<?> donationTable;

    @FXML
    private TableColumn<?, ?> donorNameColumn;

    @FXML
    private DatePicker endDatePicker;

    @FXML
    private RadioButton eventRadioButton;

    @FXML
    private TextArea impactHighlightsArea;

    @FXML
    private TableColumn<?, ?> purposeColumn;

    @FXML
    private DatePicker startDatePicker;

    @FXML
    private TextField totalDonationsField;

}
