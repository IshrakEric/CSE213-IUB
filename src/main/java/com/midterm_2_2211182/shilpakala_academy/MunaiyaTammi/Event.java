package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

import java.time.LocalDate;

public class Event {
    private int id;
    private String name;
    private LocalDate date;
    private int time;
    private String location;
    private String venue;

    public Event(LocalDate date, int id, String location, String name, int time, String venue) {
        this.date = date;
        this.id = id;
        this.location = location;
        this.name = name;
        this.time = time;
        this.venue = venue;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "Event{" +
                "date=" + date +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", location='" + location + '\'' +
                ", venue='" + venue + '\'' +
                '}';
    }
}

