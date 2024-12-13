package Ishrak.Internal_Order_Providers;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class FAQs_Tab {


    @javafx.fxml.FXML
    private Tab q3tab;
    @javafx.fxml.FXML
    private TabPane maintab;
    @javafx.fxml.FXML
    private Tab q2tab;
    @javafx.fxml.FXML
    private Tab q1tab;

    public Tab getQ3tab() {
        return q3tab;
    }

    public void setQ3tab(Tab q3tab) {
        this.q3tab = q3tab;
    }

    public TabPane getMaintab() {
        return maintab;
    }

    public void setMaintab(TabPane maintab) {
        this.maintab = maintab;
    }

    public Tab getQ2tab() {
        return q2tab;
    }

    public void setQ2tab(Tab q2tab) {
        this.q2tab = q2tab;
    }

    public Tab getQ1tab() {
        return q1tab;
    }

    public void setQ1tab(Tab q1tab) {
        this.q1tab = q1tab;
    }

    @Override
    public String toString() {
        return "FAQs_Tab{" +
                "q3tab=" + q3tab +
                ", maintab=" + maintab +
                ", q2tab=" + q2tab +
                ", q1tab=" + q1tab +
                '}';
    }

    public FAQs_Tab(Tab q3tab, TabPane maintab, Tab q2tab, Tab q1tab) {
        this.q3tab = q3tab;
        this.maintab = maintab;
        this.q2tab = q2tab;
        this.q1tab = q1tab;
    }
}
