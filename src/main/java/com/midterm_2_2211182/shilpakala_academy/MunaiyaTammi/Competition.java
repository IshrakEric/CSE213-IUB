package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

import java.time.LocalDate;

public class Competition {
    private int id;
    private String name;
    public LocalDate deadline;
    public String criteria;

    public Competition(String criteria, LocalDate deadline, int id, String name) {
        this.criteria = criteria;
        this.deadline = deadline;
        this.id = id;
        this.name = name;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Competition{" +
                "criteria='" + criteria + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
