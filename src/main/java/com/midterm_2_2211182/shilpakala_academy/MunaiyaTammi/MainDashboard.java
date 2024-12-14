package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainDashboard {

    private Scene scene;
    private Stage stage;
    private Parent root;

    @javafx.fxml.FXML
    public void Artist_Button(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ArtistDashboard.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void Donor_Button(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("DonorDashboard.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
