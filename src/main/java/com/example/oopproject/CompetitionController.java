package  com.example.oopproject;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CompetitionController {

    @FXML
    private TableView<String> competitionTable; // Replace <String> with your Competition model if needed
    @FXML
    private TextArea competitionDetailsArea;
    @FXML
    private TextField nameField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField portfolioLinkField;

    @FXML
    private void handleCompetitionSelection() {
        System.out.println("Displaying competition details...");
    }

    @FXML
    private void handleSubmitApplication() {
        System.out.println("Submitting application..."); .
    }
}
