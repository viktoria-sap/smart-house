package ru.netology;
import lombok.Data;
@Data
public class Radio {
    private int maxStation = 10;
    private int MIN_STATION = 0;
    private int currentStation;
    private int MAX_VOLUME = 100;
    private int MIN_VOLUME = 0;
    private int currentVolume;
    public Radio(int maxStation, int currentStation, int currentVolume) {
        this.maxStation = maxStation;
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }
    public void setCurrentStation(int station) {
        if (station >= MIN_STATION && station <= maxStation) {
            currentStation = station;
        }
    }
    public void next() {
        if (currentStation > maxStation) {
            currentStation = MIN_STATION;
        } else {
            currentStation++;
        }
    }
    public void prev() {
        if (currentStation < MIN_STATION) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }
    public void setCurrentVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            currentVolume = volume;
        }
    }
    public void increase() {
        if (currentVolume > MAX_VOLUME) {
            currentVolume = MAX_VOLUME;
        } else {
            currentVolume++;
        }
    }
    public void decrease() {
        if (currentVolume < MIN_VOLUME) {
            currentVolume = MIN_VOLUME;
        } else {
            currentVolume--;
        }
    }
}