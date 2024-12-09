package Rafid;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ViewVolunteersSceneController implements Initializable {
    @FXML
    private TableView<Volunteer> volunteerListTableView;
    @FXML
    private TableColumn<Volunteer, Integer> volunteerIDColumn;
    @FXML
    private TableColumn<Volunteer, String> volunteerNameColumn;
    @FXML
    private TableColumn<Volunteer, String> volunteerEmailColumn;
    @FXML
    private TableColumn<Volunteer, String> volunteerLocationColumn;
    @FXML
    private TableColumn<Volunteer, String> volunteerPrefDaysColumn;
    @FXML
    private Button goBackBtnFxID;

    private  ArrayList<Volunteer> volunteerList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // Dummy data in volunteer List as Admin is supposed to input the data there.
        // Admin Class missing.
        volunteerList = new ArrayList<>();

        volunteerListTableView.setItems(FXCollections.observableArrayList(volunteerList));

        volunteerIDColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        volunteerNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        volunteerEmailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        volunteerLocationColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        volunteerPrefDaysColumn.setCellValueFactory(new PropertyValueFactory<>("preferredDays"));

        readFromVolunteerObjectsFile();



    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) {
        Stage stage = (Stage) goBackBtnFxID.getScene().getWindow();
        SceneSwitcherClass.switchToScene(stage, "VolunteerScene.fxml");

    }

    public void readFromVolunteerObjectsFile() {
        try {

            System.out.println("Volunteer list size: " + volunteerList.size());

            volunteerList = new ArrayList<>();
            volunteerList = Volunteer.readAndReturnArrayList();

            // Clear the existing items in the TableView and then add the updated courseList
            volunteerListTableView.getItems().clear();
            volunteerListTableView.getItems().addAll(volunteerList);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
