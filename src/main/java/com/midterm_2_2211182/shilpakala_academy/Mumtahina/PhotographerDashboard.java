package com.example.shilpakala;

import javafx.event.ActionEvent;

import java.io.IOException;

public class PhotographerDashboard
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void EventsButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"EventsPhotographer.fxml");
    }

    @javafx.fxml.FXML
    public void Payment(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"PaymentPhotographer.fxml");

    }

    @javafx.fxml.FXML
    public void CoursesButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"CoursesPhotographer.fxml");
    }

    @javafx.fxml.FXML
    public void UpdateButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"ViewUpdates.fxml");

    }

    @javafx.fxml.FXML
    public void WorkshopButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"WorkshopOfferings.fxml");
    }

    @javafx.fxml.FXML
    public void BackButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"hello-view.fxml");
    }

    @javafx.fxml.FXML
    public void CourseDetailsButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"CourseDetails.fxml");
    }

    @javafx.fxml.FXML
    public void RegistrtionButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"Registration.fxml");
    }

    @javafx.fxml.FXML
    public void myCoursesButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"MyCourses.fxml");
    }
}