package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ResourcesPageController {

    @FXML
    private TableColumn<?, ?> dateColumn;

    @FXML
    private Button downloadResourceButton;

    @FXML
    private Button enrollButton;

    @FXML
    private TableColumn<?, ?> linkColumn;

    @FXML
    private TableColumn<?, ?> registerLinkColumn;

    @FXML
    private TableView<?> resourcesTable;

    @FXML
    private TableColumn<?, ?> titleColumn;

    @FXML
    private TableColumn<?, ?> typeColumn;

    @FXML
    private Button viewDetailsButton;

    @FXML
    private TableColumn<?, ?> workshopTitleColumn;

    @FXML
    private TableView<?> workshopsTable;

}
