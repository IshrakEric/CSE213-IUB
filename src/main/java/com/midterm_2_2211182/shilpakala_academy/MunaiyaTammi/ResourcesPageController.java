package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ResourcesPageController {

    @FXML
    private TableColumn<Artist, Integer> dateColumn;

    @FXML
    private Button downloadResourceButton;

    @FXML
    private Button enrollButton;

    @FXML
    private TableColumn<Artist, String> linkColumn;

    @FXML
    private TableColumn<Artist, String> registerLinkColumn;

    @FXML
    private TableView<String> resourcesTable;

    @FXML
    private TableColumn<Artist, String> titleColumn;

    @FXML
    private TableColumn<Artist, String> typeColumn;

    @FXML
    private Button viewDetailsButton;

    @FXML
    private TableColumn<Artist, String > workshopTitleColumn;

    @FXML
    private TableView<String> workshopsTable;

}
