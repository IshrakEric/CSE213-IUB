package Rafid;

import com.example.oopproject2024.EventManager;
import com.example.oopproject2024.Volunteer;
import com.example.oopproject2024.Events;
import com.example.oopproject2024.Admin;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class EventManagerNearbyEventsController implements Initializable {
    @FXML
    private TableView<Events> nearbyEventsTableView;
    @FXML
    private Button viewMoreDetailsBtnFxID;
    @FXML
    private Button goBackBtnFxID;
    @FXML
    private TableColumn<Events, Integer> nearbyEventsID;
    @FXML
    private TableColumn<Events, String> nearbyEventsType;
    @FXML
    private TableColumn<Events, String> nearbyEventTime;
    @FXML
    private TableColumn<Events, Integer> nearbyVolunteersJoined;
    @FXML
    private TableColumn<Events, LocalDate> nearbyEventsDate;
    @FXML
    private TableColumn<Events, String> eventLocationColumn;

    private ArrayList<Events> nearbyEventsArrayList;

    private ArrayList<Events> filteredEvents = new ArrayList<>();

    private static EventManager storedEventManager;

    private Events selectedEvent;
    @FXML
    private Button participateInEventFxID;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            nearbyEventsArrayList = Admin.readAndReturnEventsArrayList();

            nearbyEventsID.setCellValueFactory(new PropertyValueFactory<>("eventId"));
            nearbyEventsType.setCellValueFactory(new PropertyValueFactory<>("eventType"));
            nearbyEventsDate.setCellValueFactory(new PropertyValueFactory<>("eventDate"));
            nearbyEventTime.setCellValueFactory(new PropertyValueFactory<>("eventTime"));
            eventLocationColumn.setCellValueFactory(new PropertyValueFactory<>("eventLocation"));
            nearbyVolunteersJoined.setCellValueFactory(new PropertyValueFactory<>("volunteerList"));

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(NearbyEventsSceneController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error Reading/Writing from Events File");
        }

        // Bind the disable property of the View Event Details button to the TableView's selectedItemProperty
        viewMoreDetailsBtnFxID.disableProperty().bind(nearbyEventsTableView.getSelectionModel().selectedItemProperty().isNull());

        // Bind the disable property of the Participate button to the TableView's selectedItemProperty
        participateInEventFxID.disableProperty().bind(nearbyEventsTableView.getSelectionModel().selectedItemProperty().isNull());

    }

    public void passCurrentEventManager(EventManager b) {
        storedEventManager = b;
    }

    @FXML
    private void participateInNearbyEventsOnClick(ActionEvent event) throws ClassNotFoundException {

        selectedEvent = nearbyEventsTableView.getSelectionModel().getSelectedItem();

        boolean hasParticipated = storedEventManager.getParticipatedEvents().stream()
                .anyMatch(myEvent -> Objects.equals(myEvent.getEventId(), selectedEvent.getEventId()));

        // Validate if Event is already completed, or has already been participated in. If neither: Let user participate.
        if (hasParticipated) {
            // Show alert for already participated event
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Already Participated");
            alert.setHeaderText(null);
            alert.setContentText("You have already participated in this event.");
            alert.showAndWait();
        } else {
            // Participate in the event
            storedEventManager.addEvent(selectedEvent);
            filteredEvents.remove(selectedEvent);
            nearbyEventsTableView.getItems().remove(selectedEvent);
            try {
                System.out.println("Successfully Added Event");
                EventManager.updateEventManagerInFile(storedEventManager);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @FXML
    private void viewMoreDetailsOnClick(ActionEvent event) {
        selectedEvent = nearbyEventsTableView.getSelectionModel().getSelectedItem();
        ViewEventDetailsSceneController.passCurrentEventManager(storedEventManager);
        ViewEventDetailsSceneController.passEvent("EventManagerNearbyEvents", selectedEvent);

        Stage stage = (Stage) viewMoreDetailsBtnFxID.getScene().getWindow();
        SceneSwitcherClass.switchToScene(stage, "ViewEventDetailsScene.fxml");
    }

    @FXML
    private void goBackBtnOnClick(ActionEvent event) {
        Stage stage = (Stage) goBackBtnFxID.getScene().getWindow();
        SceneSwitcherClass.switchToScene(stage, "EventManagerScene.fxml");
    }

    public static void passEventManager(EventManager benef) {
        storedEventManager = benef;
    }

    public void onShown() {
        updateFilteredEventsList();
    }

    // Load Events into TableView which have not been participated in and which also have the same location as Beneficiary.
    private void updateFilteredEventsList() {
        filteredEvents.clear();

        for (Events event : nearbyEventsArrayList) {
            boolean participated = storedEventManager.getParticipatedEvents().stream()
                    .anyMatch(participatedEvent -> participatedEvent.getEventId().equals(event.getEventId()));


            if (!participated && event.getEventLocation().equals(storedEventManager.getLocation())) {
                filteredEvents.add(event);
            }
        }

        nearbyEventsTableView.setItems(FXCollections.observableArrayList(filteredEvents));
    }

}
