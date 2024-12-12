package com.example.shilpakala;

import javafx.event.ActionEvent;

import java.io.IOException;

public class ResourcesController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void Backbuttononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"VisitorDashboard.fxml");
    }
}