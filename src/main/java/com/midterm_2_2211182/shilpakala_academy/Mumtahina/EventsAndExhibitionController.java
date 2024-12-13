package com.example.shilpakala;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EventsAndExhibitionController
{

    @javafx.fxml.FXML
    private TextArea textField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void Event02ButtonOnClick(ActionEvent actionEvent) {
        String filePath = getClass().getResource("event02.txt").getPath();
        File selectedFile = new File(filePath);

        StringBuilder outputStr = new StringBuilder();


        try (Scanner sc = new Scanner(selectedFile)) {
            while (sc.hasNextLine()) {
                outputStr.append(sc.nextLine()).append("\n");
            }

            textField.setText(outputStr.toString());
        } catch (IOException e) {
            textField.setText("Error reading the file.");
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void Event01ButtonOnClick(ActionEvent actionEvent) {
        String filePath = getClass().getResource("event01.txt").getPath();
        File selectedFile = new File(filePath);

        StringBuilder outputStr = new StringBuilder();


        try (Scanner sc = new Scanner(selectedFile)) {
            while (sc.hasNextLine()) {
                outputStr.append(sc.nextLine()).append("\n");
            }

            textField.setText(outputStr.toString());
        } catch (IOException e) {
            textField.setText("Error reading the file.");
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void Event03ButtonOnClick(ActionEvent actionEvent) {
        String filePath = getClass().getResource("event03.txt").getPath();
        File selectedFile = new File(filePath);

        StringBuilder outputStr = new StringBuilder();


        try (Scanner sc = new Scanner(selectedFile)) {
            while (sc.hasNextLine()) {
                outputStr.append(sc.nextLine()).append("\n");
            }

            textField.setText(outputStr.toString());
        } catch (IOException e) {
            textField.setText("Error reading the file.");
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void BackButtonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"VisitorDashboard.fxml");

    }
    }
