package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.time.LocalDate;

public class TrackDonationsController {

    @FXML
    private ToggleGroup FilterGroup;

    @FXML
    private TableColumn<Donor, Integer> amountColumn;

    @FXML
    private RadioButton artistRadioButton;

    @FXML
    private TableColumn<Donor, LocalDate> dateColumn;

    @FXML
    private TableView<String> donationTable;

    @FXML
    private TableColumn<Donor, String > donorNameColumn;

    @FXML
    private DatePicker endDatePicker;

    @FXML
    private RadioButton eventRadioButton;

    @FXML
    private TextArea impactHighlightsArea;

    @FXML
    private TableColumn<Donor, String> purposeColumn;

    @FXML
    private DatePicker startDatePicker;

    @FXML
    private TextField totalDonationsField;

}
