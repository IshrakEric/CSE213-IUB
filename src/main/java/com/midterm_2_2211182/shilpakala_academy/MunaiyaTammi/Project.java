package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

public class Project {
    private int id;
    private String name;
    private String description;
    private Double budget;
    private boolean isCompleted;

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Project{" +
                "budget=" + budget +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }

    public Project(Double budget, String description, int id, boolean isCompleted, String name) {
        this.budget = budget;
        this.description = description;
        this.id = id;
        this.isCompleted = isCompleted;
        this.name = name;
    }
}
