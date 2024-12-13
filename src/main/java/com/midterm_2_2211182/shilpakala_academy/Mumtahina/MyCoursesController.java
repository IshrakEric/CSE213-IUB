package com.example.shilpakala;

import javafx.event.ActionEvent;

import java.io.IOException;

public class MyCoursesController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"PhotographerDashboard.fxml");
    }
}