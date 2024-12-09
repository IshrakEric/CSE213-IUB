package MunaiyaTammi;

import java.time.LocalDate;

public class Performance {
    private String performerName;
    private byte[] video;
    private LocalDate date;
    private String venue;

    public Performance(LocalDate date, String performerName, String venue, byte[] video) {
        this.date = date;
        this.performerName = performerName;
        this.venue = venue;
        this.video = video;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPerformerName() {
        return performerName;
    }

    public void setPerformerName(String performerName) {
        this.performerName = performerName;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public byte[] getVideo() {
        return video;
    }

    public void setVideo(byte[] video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "date=" + date +
                ", performerName='" + performerName + '\'' +
                ", video=" + java.util.Arrays.toString(video) +
                ", venue='" + venue + '\'' +
                '}';
    }
}
