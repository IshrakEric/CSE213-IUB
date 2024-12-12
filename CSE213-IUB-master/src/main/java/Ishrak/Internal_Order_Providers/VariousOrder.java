package Ishrak.Internal_Order_Providers;

import javax.swing.table.TableColumn;

public class VariousOrder {


    @javafx.fxml.FXML
    private TableColumn download;
    @javafx.fxml.FXML
    private TableColumn issue;
    @javafx.fxml.FXML
    private TableColumn serial;
    @javafx.fxml.FXML
    private TableColumn publishdate;
    @javafx.fxml.FXML
    private TableColumn branch;
    @javafx.fxml.FXML
    private TableColumn content;

    public VariousOrder(TableColumn download, TableColumn issue, TableColumn serial, TableColumn publishdate, TableColumn branch, TableColumn content) {
        this.download = download;
        this.issue = issue;
        this.serial = serial;
        this.publishdate = publishdate;
        this.branch = branch;
        this.content = content;
    }

    public TableColumn getDownload() {
        return download;
    }

    public void setDownload(TableColumn download) {
        this.download = download;
    }

    public TableColumn getIssue() {
        return issue;
    }

    public void setIssue(TableColumn issue) {
        this.issue = issue;
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

    public TableColumn getBranch() {
        return branch;
    }

    public void setBranch(TableColumn branch) {
        this.branch = branch;
    }

    public TableColumn getContent() {
        return content;
    }

    public void setContent(TableColumn content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "VariousOrder{" +
                "download=" + download +
                ", issue=" + issue +
                ", serial=" + serial +
                ", publishdate=" + publishdate +
                ", branch=" + branch +
                ", content=" + content +
                '}';
    }


}
