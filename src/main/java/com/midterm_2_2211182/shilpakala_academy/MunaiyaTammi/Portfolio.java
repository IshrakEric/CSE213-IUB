package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

public class Portfolio {
    private int id;
    public Byte images;
    public Byte videos;
    public Byte audioFiles;

    public Portfolio(Byte audioFiles, int id, Byte images, Byte videos) {
        this.audioFiles = audioFiles;
        this.id = id;
        this.images = images;
        this.videos = videos;
    }

    public Byte getAudioFiles() {
        return audioFiles;
    }

    public void setAudioFiles(Byte audioFiles) {
        this.audioFiles = audioFiles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Byte getImages() {
        return images;
    }

    public void setImages(Byte images) {
        this.images = images;
    }

    public Byte getVideos() {
        return videos;
    }

    public void setVideos(Byte videos) {
        this.videos = videos;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "audioFiles=" + audioFiles +
                ", id=" + id +
                ", images=" + images +
                ", videos=" + videos +
                '}';
    }
}
