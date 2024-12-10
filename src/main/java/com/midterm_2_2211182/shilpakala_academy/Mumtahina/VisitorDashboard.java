package com.midterm_2_2211182.shilpakala_academy.Mumtahina;

import javafx.event.ActionEvent;

import java.io.IOException;

public class VisitorDashboard
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void Suggestions(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"OnlineBooking.fxml");
    }

    @javafx.fxml.FXML
    public void Payment(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"OnlineBooking.fxml");
    }

    @javafx.fxml.FXML
    public void OnlineBooking(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"OnlineBooking.fxml");
    }

    @javafx.fxml.FXML
    public void AuditoriumPolicy(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void EventsAndExhibition(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"EventsAndExhibition.fxml");
    }

    @javafx.fxml.FXML
    public void Back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"hello-view.fxml");
    }

    @javafx.fxml.FXML
    public void Courses(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"CourseOfferings.fxml");
    }

    @javafx.fxml.FXML
    public void Resources(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void NewsAndAnnoucements(ActionEvent actionEvent) {
    }
}