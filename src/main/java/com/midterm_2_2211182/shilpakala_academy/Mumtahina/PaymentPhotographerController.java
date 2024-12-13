package com.example.shilpakala;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

import java.io.IOException;

public class PaymentPhotographerController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"PhotographerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void payButtonOnClick(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Selection Confirmation");
        alert.setHeaderText("Successfully Paid");
        alert.setContentText(
                "Thanks For The Payment"
        );
        alert.showAndWait();
    }
}