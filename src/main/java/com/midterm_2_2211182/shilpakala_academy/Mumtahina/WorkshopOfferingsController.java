package com.example.shilpakala;

import javafx.event.ActionEvent;

import java.io.IOException;

public class WorkshopOfferingsController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void BackButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"PhotographerDashboard.fxml");
    }
}