package ru.netology;

public class Condition {
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature) {
            return;
        }
        currentTemperature += 1;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature < minTemperature) {
            return;
        }
        currentTemperature -= 1;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }
}
