package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

import java.time.LocalDate;

public class Campaign {
    private int id;
    private String name;
    private boolean isActive;
    public LocalDate startDate;
    public LocalDate endDate;

    public Campaign(LocalDate endDate, int id, boolean isActive, String name, LocalDate startDate) {
        this.endDate = endDate;
        this.id = id;
        this.isActive = isActive;
        this.name = name;
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "endDate=" + endDate +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                ", startDate=" + startDate +
                '}';
    }
}
