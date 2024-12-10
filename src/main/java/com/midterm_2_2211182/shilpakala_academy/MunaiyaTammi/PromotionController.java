package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PromotionController {

    @FXML
    private RadioButton showcaseEventOption;
    @FXML
    private RadioButton onlineStoreOption;
    @FXML
    private ComboBox<String> artworkSelection; // Replace <String> with your data model if needed
    @FXML
    private TextField priceField;
    @FXML
    private TextArea promotionDetailsArea;

    @FXML
    private void handleRetrieveDetails() {
        System.out.println("Retrieving details for selected item...");
    }

    @FXML
    private void handleValidateInformation() {
        System.out.println("Validating input...");
    }

    @FXML
    private void handleConfirmPublish() {
        System.out.println("Publishing listing...");
    }
}
