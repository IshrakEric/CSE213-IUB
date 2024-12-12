package com.example.shilpakala;

import javafx.event.ActionEvent;

import java.io.IOException;

public class CoursesPhotographerController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButtononClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"PhotographerDashboard.fxml");
    }
}