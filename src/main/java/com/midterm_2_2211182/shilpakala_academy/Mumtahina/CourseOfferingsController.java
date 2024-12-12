package com.example.shilpakala;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class CourseOfferingsController
{
    @javafx.fxml.FXML
    private TableColumn<Course, String> date;
    @javafx.fxml.FXML
    private TableColumn<Course, String> price;
    @javafx.fxml.FXML
    private TableColumn<Course, String> name;
    @javafx.fxml.FXML
    private TableView<Course> CourseTable;
    private ObservableList<Course> CourseList;
    @javafx.fxml.FXML
    public void initialize() {
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        date.setCellValueFactory(new PropertyValueFactory<>("date"));
        price.setCellValueFactory(new PropertyValueFactory<>("price"));

        Course course1 = new Course("Course 1", "2024-12-01", "$100");
        Course course2 = new Course("Course 2", "2024-12-05", "$200");
        Course course3 = new Course("Course 3", "2024-12-10", "$150");


        CourseList = FXCollections.observableArrayList(course1, course2, course3);


        CourseTable.setItems(CourseList);
    }

    @javafx.fxml.FXML
    public void BackButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"VisitorDashboard.fxml");
    }
}