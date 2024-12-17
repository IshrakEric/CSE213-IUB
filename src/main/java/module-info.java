module com.midterm_2_2211182.shilpakala_academy {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;

    requires javafx.graphics;

    exports com.midterm_2_2211182.shilpakala_academy.Rafid;

    opens com.midterm_2_2211182.shilpakala_academy.Rafid to javafx.fxml;
    opens com.midterm_2_2211182.shilpakala_academy to javafx.fxml;
    exports com.midterm_2_2211182.shilpakala_academy;
}
