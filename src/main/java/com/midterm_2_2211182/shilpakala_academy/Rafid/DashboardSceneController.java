package com.midterm_2_2211182.shilpakala_academy.Rafid;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class DashboardSceneController implements Initializable {

    @FXML
    private BorderPane DashboardBorderPaneFx;

    private static String passedData;

    private static Volunteer passedVolunteer;

    private static EventManager passedEventManager;

@Override
public void initialize(URL url, ResourceBundle rb) {

    if (passedData != null && passedData.equals("Volunteer")) {
        Parent root;
        try {

            // Pass current Volunteer instance
            VolunteerSceneController.passedToVolunteerScene(passedVolunteer);
            System.out.println("Passing this Volunteer to Volunteer Scene:" + passedVolunteer.toString());

            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("VolunteerScene.fxml")));
            DashboardBorderPaneFx.setCenter(root);

        } catch (IOException ex) {
            Logger.getLogger(DashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error Switching to Volunteer Scene.");
        }

    }
    else if (passedData != null && passedData.equals("EventManager")) {

        Parent root;
        try {
            //Passing EventManager Instance
            EventManagerSceneController.passEventManagerToEventManagerDashboard(passedEventManager);

            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("EventManagerScene.fxml")));
            DashboardBorderPaneFx.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error Switching to EventManager Scene.");
        }

    }
    else if (passedData != null && passedData.equals("Admin (Event Creation)")) {

        Parent root;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AdminScene.fxml")));
            DashboardBorderPaneFx.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error Switching to Admin (Event Creation) Scene.");
        }

    } else if ((passedData != null && passedData.equals("Government Lawyer"))) {

        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml")); // Adjust the path
            root = loader.load();

            System.out.println("Switched to Government Lawyer Scene");

//            GovernmentLawyerController controller = loader.getController(); // Get the controller instance if needed

            DashboardBorderPaneFx.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error Switching to Government Lawyer Scene.");
        }
    } else if ((passedData != null && passedData.equals("Internal Order Provider"))) {
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml")); // Adjust the path
            root = loader.load();

            System.out.println("Switched to Internal Order Provider Scene");

//            BloodCollectorController controller = loader.getController(); // Get the controller instance if needed

            DashboardBorderPaneFx.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error Switching to Internal Order Provider Scene.");
        }
    } else if ((passedData != null && passedData.equals("Artist"))) {
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/redcresent_bloodbank_admin_patient/Admin_Dashboard.fxml")); // Adjust the path
            root = loader.load();

            System.out.println("Switched to Artist Scene");

//            Artist_DashboardController controller = loader.getController(); // Get the controller instance if needed

            DashboardBorderPaneFx.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error Switching to Artist Scene.");
        }
    } else if ((passedData != null && passedData.equals("Donor"))) {

        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml")); // Adjust the path
            root = loader.load();

            System.out.println("Switched to Donor Scene");

//            DonorDashboardController controller = loader.getController(); // Get the controller instance if needed

            DashboardBorderPaneFx.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error Switching to Donor Scene.");
        }
    }
}

    public static void passDataToDashboard(String data) {
        passedData = data;
    }

    public static void passVolunteerInstance(Volunteer volunteer) {
        passedVolunteer = volunteer;

    }

    public static void passEventManagerInstance(EventManager eventManager) {
        passedEventManager = eventManager;

    }

}
