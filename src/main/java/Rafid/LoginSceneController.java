package Rafid;



import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class LoginSceneController implements Initializable {

    @FXML
    private ComboBox<String> userTypeComboBox;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private BorderPane borderPanefxId;

    private String selectedRole;
    @FXML
    private Button loginBtnFxID;
    @FXML
    private TextField IdTextField;

    private Event storeEvent;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        userTypeComboBox.getItems().addAll("Volunteer", "EventManager", "Government Lawyer", "Internal Order Provider", "Artist", "Donor", "Visitor", "Photographer");

    }

    private static boolean checkFileExists(String fileName) {
        return new java.io.File(fileName).exists();
    }

    private static boolean checkFileHasObjects(String fileName) {
        boolean hasObjects = false;

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            // Attempt to read an object from the file
            Object obj = inputStream.readObject();
            hasObjects = true;
        } catch (EOFException e) {
            // The end of file has been reached (no more objects)
        } catch (ClassNotFoundException | IOException e) {
            // Error reading the object or file
            e.printStackTrace();
        }

        return hasObjects;
    }

    @FXML
    private void loginBtnOnClick(ActionEvent event) throws IOException {

        if (selectedRole != null && selectedRole.equals("Volunteer")) {

            if (!(IdTextField.getText().isEmpty() && passwordTextField.getText().isEmpty())) {

                if (checkFileExists("Volunteer.bin") && checkFileHasObjects("Volunteer.bin")) {

                    // Check credentials for Volunteer
                    try {

                        Volunteer loggedInVolunteer = searchVolunteer(Integer.valueOf(IdTextField.getText()), passwordTextField.getText());

                        if (loggedInVolunteer != null) {
                            //Pass data, which switches to Volunteer Screen
                            DashboardSceneController.passDataToDashboard("Volunteer");
                            DashboardSceneController.passVolunteerInstance(loggedInVolunteer);
                            // Proceed to load the dashboard scene and pass the volunteer instance

                            switchToDashboardStage(event);

                        } else {

                            //Wrong credentials
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Error!");
                            alert.setHeaderText(null);
                            alert.setContentText("Volunteer verification failed.");

                            alert.showAndWait();

                        }
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace(); // Handle this appropriately
                    }

                } else {
                    // No Beneficiary File found / File has no Objects in it
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("No Volunteers detected");
                    alert.setHeaderText(null);
                    alert.setContentText("Please Register as a Volunteer to login");

                    alert.showAndWait();
                }

            } else {
                // Empty credentials fields
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("No input detected");
                alert.setHeaderText(null);
                alert.setContentText("Please fill out all fields to Login");

                alert.showAndWait();

            }

        } else if (selectedRole != null && selectedRole.equals("EventManager")) {

            //Pass data, which switches to Beneficiary Screen
            // Check credentials for Volunteer
            if (!(IdTextField.getText().isEmpty() && passwordTextField.getText().isEmpty())) {

                if (checkFileExists("EventManager.bin") && checkFileHasObjects("EventManager.bin")) {

                    try {
                        EventManager loggedInEventManager = searchEventManager(Integer.valueOf(IdTextField.getText()), passwordTextField.getText());

                        if (loggedInEventManager != null) {
                            //Pass data, which switches to Volunteer Screen
                            DashboardSceneController.passDataToDashboard("EventManager");
                            DashboardSceneController.passEventManagerInstance(loggedInEventManager);
                            // Proceed to load the dashboard scene and pass the volunteer instance

                            switchToDashboardStage(event);

                        } else {

                            //Wrong credentials
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Error!");
                            alert.setHeaderText(null);
                            alert.setContentText("EventManager verification failed.");

                            alert.showAndWait();

                        }
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace(); // Handle this appropriately
                    }

                } else {
                    // No Beneficiary File found/ File has no Objects in it
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("No EventManager detected");
                    alert.setHeaderText(null);
                    alert.setContentText("Please Register as a EventManager to login");

                    alert.showAndWait();
                }

            } else {
                // Empty credentials fields
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("No input detected");
                alert.setHeaderText(null);
                alert.setContentText("Please fill out all fields to Login");

                alert.showAndWait();

            }

        } else if (selectedRole != null && selectedRole.equals("Admin (Event Creation)")) {

            //Pass data, which switches to Admin Screen
            DashboardSceneController.passDataToDashboard("Admin (Event Creation)");
            switchToDashboardStage(event);

        } else if (selectedRole != null && selectedRole.equals("Government Lawyer")) {

            //Pass data, which switches to Government Lawyer Screen
            DashboardSceneController.passDataToDashboard("Government Lawyer");
            switchToDashboardStage(event);

        } else if (selectedRole != null && selectedRole.equals("Internal Order Provider")) {

            //Pass data, which switches to Internal Order Provider Screen
            DashboardSceneController.passDataToDashboard("Internal Order Provider");
            switchToDashboardStage(event);
        } else if (selectedRole != null && selectedRole.equals("Artist")) {
            //Pass data, which switches to Artist Screen
            DashboardSceneController.passDataToDashboard("Artist");
            switchToDashboardStage(event);

        } else if (selectedRole != null && selectedRole.equals("Donor")) {
            //Pass data, which switches to Donor Screen
            DashboardSceneController.passDataToDashboard("Donor");
            switchToDashboardStage(event);

        }

    }

    public void switchToDashboardStage(Event storeEvent) throws IOException {

        //Dashboard in a different Stage
        Parent volScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("DashboardScene.fxml")));

        Scene scene = new Scene(volScene);
        Stage newStage = new Stage();

        newStage.setScene(scene);
        newStage.show();

        // Close the current stage (i.e., the stage associated with the button)
        Stage currentStage = (Stage) ((Node) storeEvent.getSource()).getScene().getWindow();
        currentStage.close();

    }

    @FXML
    private void registerBtnOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("registrationScene.fxml"));
        Parent root = loader.load();

        RegistrationSceneController registrationSceneController = loader.getController();
        registrationSceneController.setLoginSceneBorderPane(borderPanefxId);

        borderPanefxId.setCenter(root);

    }

    @FXML
    private void userTypeComboBoxOnClick(ActionEvent event) {
        selectedRole = userTypeComboBox.getSelectionModel().getSelectedItem();
        if (selectedRole != null && selectedRole.equals("EventManager") || Objects.equals(selectedRole, "Volunteer") || Objects.equals(selectedRole, "Admin (Event Creation)") || Objects.equals(selectedRole, "Blood Donor") || Objects.equals(selectedRole, "Blood Collector") || Objects.equals(selectedRole, "Admin") || Objects.equals(selectedRole, "Patient")) {
            loginBtnFxID.setDisable(false);
        }
    }

    private Volunteer searchVolunteer(Integer id, String password) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Volunteer.bin"))) {
            Volunteer volunteer;
            while (true) {
                try {
                    volunteer = (Volunteer) ois.readObject();
                    if (volunteer == null) {
                        break; // Reached end of file
                    }
                    if (Objects.equals(volunteer.getId(), id) && volunteer.getPassword().equals(password)) {
                        System.out.println(volunteer.toString());
                        return volunteer; // Found the volunteer
                    }
                } catch (EOFException e) {
                    break; // Reached end of file
                }
            }
        }
        return null; // Volunteer not found
    }

    private EventManager searchEventManager(Integer id, String password) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("EventManager.bin"))) {
            EventManager eventManager;
            while (true) {
                try {
                    eventManager = (EventManager) ois.readObject();
                    if (eventManager == null) {
                        break; // Reached end of file
                    }
                    if (Objects.equals(eventManager.getId(), id) && eventManager.getPassword().equals(password)) {
                        System.out.println("Logged in EventManager " + eventManager.toString());
                        return eventManager; // Found the EventManager
                    }
                } catch (EOFException e) {
                    break; // Reached end of file
                }
            }
        }
        return null; // EventManager not found
    }

}
