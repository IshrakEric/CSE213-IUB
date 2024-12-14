package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class DonorEngagementController {

    @FXML
    private Button feedbackButton;

    @FXML
    private TableColumn<Donor, Integer> updateDateColumn;

    @FXML
    private TextArea updateDetailsArea;

    @FXML
    private TableColumn<Donor, String> updateTitleColumn;

    @FXML
    private TableColumn<Donor,String> updateTypeColumn;

    @FXML
    private TableView<String> updatesTable;

    @FXML
    void onfeedbackButtonClick(ActionEvent event) {

    }

}
