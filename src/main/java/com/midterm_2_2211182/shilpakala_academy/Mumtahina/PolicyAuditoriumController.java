package com.example.shilpakala;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PolicyAuditoriumController
{
    @javafx.fxml.FXML
    private TextField textArea;

    @javafx.fxml.FXML
    public void initialize() {
        String filePath = getClass().getResource("PolicyAuditorium.txt").getPath();
        File selectedFile = new File(filePath);

        StringBuilder outputStr = new StringBuilder();


        try (Scanner sc = new Scanner(selectedFile)) {
            while (sc.hasNextLine()) {
                outputStr.append(sc.nextLine()).append("\n");
            }

            textArea.setText(outputStr.toString());
        } catch (IOException e) {
            textArea.setText("Error reading the file.");
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void BackButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"VisitorDashboard.fxml");
    }
}