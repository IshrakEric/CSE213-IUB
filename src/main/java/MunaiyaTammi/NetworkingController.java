package MunaiyaTammi;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class NetworkingController {
    @FXML
    private TextField searchField;

    @FXML
    private TableView<?> artistTable; // Replace '?' with your data model for Artist
    @FXML
    private TextArea collaborationMessageField;

    @FXML
    private void handleSearch() {
        String query = searchField.getText();
        System.out.println("Searching for: " + query);
    }

    @FXML
    private void handleViewProfile() {
        // Get the selected artist from the table
        System.out.println("View Profile button clicked.");
    }

    @FXML
    private void handleSendRequest() {
        String message = collaborationMessageField.getText();
        System.out.println("Collaboration Request Sent: " + message);
    }
}
