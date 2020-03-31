package ru.netology;

public class Condition {
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private int increaseCurrentTemperature;
    private int decreaseCurrentTemperature;


    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public int getIncreaseCurrentTemperature() {
        return increaseCurrentTemperature;
    }

    public void setIncreaseCurrentTemperature() {
        currentTemperature += 1;
        if (currentTemperature > maxTemperature) {
            return;
        }
        else this.increaseCurrentTemperature = currentTemperature;
    }

    public int getDecreaseCurrentTemperature() {
        return decreaseCurrentTemperature;
    }

    public void setDecreaseCurrentTemperature() {
        currentTemperature -= 1;
        if (currentTemperature < minTemperature) {
            return;
        }
        else this.decreaseCurrentTemperature = currentTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }
}
