package com.midterm_2_2211182.shilpakala_academy.Mumtahina;

import javafx.event.ActionEvent;

import java.io.IOException;

public class PhotographerDashboard
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void EventsButtonOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Payment(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CoursesButtonOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void UpdateButtonOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void WorkshopButtonOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"hello-view.fxml");
    }

    @javafx.fxml.FXML
    public void CourseDetailsButtonOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RegistrtionButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"Registration.fxml");
    }
}