package com.example.shilpakala;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.io.IOException;

public class CoursesPhotographerController {
    @javafx.fxml.FXML
    private ComboBox<String> coursesCombobox;
    @javafx.fxml.FXML
    private Label label;

    @javafx.fxml.FXML
    public void initialize() {

        ObservableList<String> courses = FXCollections.observableArrayList(
                "Portrait Photography",
                "Landscape Photography",
                "Wildlife Photography",
                "Wedding Photography",
                "Fashion Photography"
        );
        coursesCombobox.setItems(courses);
    }

    @javafx.fxml.FXML
    public void BackButtononClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "PhotographerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void enrollButtonOnClick(ActionEvent actionEvent) {

        String selectedCourse = coursesCombobox.getValue();

        if (selectedCourse != null) {

            label.setText("You have enrolled in: " + selectedCourse);
        } else {

            label.setText("Please select a course to enroll.");
        }
    }
}
