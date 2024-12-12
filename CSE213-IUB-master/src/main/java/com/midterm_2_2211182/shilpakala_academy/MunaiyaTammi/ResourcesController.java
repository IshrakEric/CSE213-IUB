package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ResourcesController {

    @FXML
    private TableView<?> resourcesTable; // Replace '?' with your resource data model
    @FXML
    private TableView<?> workshopsTable; // Replace '?' with your workshop data model

    @FXML
    private void handleDownloadResource() {
        System.out.println("Downloading selected resource...");
    }

    @FXML
    private void handleViewWorkshopDetails() {
        System.out.println("Viewing workshop details...");
    }

    @FXML
    private void handleEnrollInWorkshop() {
        System.out.println("Enrolling in selected workshop...");
    }
}
