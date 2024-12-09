package MunaiyaTammi;

import java.time.LocalDate;

public class Award {
    private String awardType;
    private LocalDate date;
    private String presentedToName;
    private String greetings;

    public Award(String awardType, LocalDate date, String greetings, String presentedToName) {
        this.awardType = awardType;
        this.date = date;
        this.greetings = greetings;
        this.presentedToName = presentedToName;
    }

    public String getAwardType() {
        return awardType;
    }

    public void setAwardType(String awardType) {
        this.awardType = awardType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

    public String getPresentedToName() {
        return presentedToName;
    }

    public void setPresentedToName(String presentedToName) {
        this.presentedToName = presentedToName;
    }

    @Override
    public String toString() {
        return "Award{" +
                "awardType='" + awardType + '\'' +
                ", date=" + date +
                ", presentedToName='" + presentedToName + '\'' +
                ", greetings='" + greetings + '\'' +
                '}';
    }
}
