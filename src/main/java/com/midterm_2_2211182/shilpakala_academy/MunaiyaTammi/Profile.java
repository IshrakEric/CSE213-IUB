package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

public class Profile {
    private int id;
    private Byte profilePicture;
    private String username;
    private String biography;
    private String nationality;
    private String privacySettings;

    public Profile(String biography, int id, String nationality, String privacySettings, Byte profilePicture, String username) {
        this.biography = biography;
        this.id = id;
        this.nationality = nationality;
        this.privacySettings = privacySettings;
        this.profilePicture = profilePicture;
        this.username = username;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPrivacySettings() {
        return privacySettings;
    }

    public void setPrivacySettings(String privacySettings) {
        this.privacySettings = privacySettings;
    }

    public Byte getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Byte profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "biography='" + biography + '\'' +
                ", id=" + id +
                ", profilePicture=" + profilePicture +
                ", username='" + username + '\'' +
                ", nationality='" + nationality + '\'' +
                ", privacySettings='" + privacySettings + '\'' +
                '}';
    }
}
