package Ishrak.Internal_Order_Providers;

import javax.swing.table.TableColumn;

public class OrderSubmission {


    @javafx.fxml.FXML
    private TableColumn download;
    @javafx.fxml.FXML
    private TableColumn serial;
    @javafx.fxml.FXML
    private TableColumn publishdate;
    @javafx.fxml.FXML
    private TableColumn title;

    public OrderSubmission(TableColumn download, TableColumn serial, TableColumn publishdate, TableColumn title) {
        this.download = download;
        this.serial = serial;
        this.publishdate = publishdate;
        this.title = title;
    }

    public TableColumn getDownload() {
        return download;
    }

    public void setDownload(TableColumn download) {
        this.download = download;
    }

    public TableColumn getSerial() {
        return serial;
    }

    public void setSerial(TableColumn serial) {
        this.serial = serial;
    }

    public TableColumn getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(TableColumn publishdate) {
        this.publishdate = publishdate;
    }

    public TableColumn getTitle() {
        return title;
    }

    public void setTitle(TableColumn title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "OrderSubmission{" +
                "download=" + download +
                ", serial=" + serial +
                ", publishdate=" + publishdate +
                ", title=" + title +
                '}';
    }
}
