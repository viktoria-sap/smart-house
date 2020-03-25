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

    public void setIncreaseCurrentTemperature(int increaseCurrentTemperature) {
        if (increaseCurrentTemperature < currentTemperature) {
            return;
        }
        if (increaseCurrentTemperature > maxTemperature) {
            return;
        }
        currentTemperature += 1;
        this.increaseCurrentTemperature = currentTemperature;
    }

    public int getDecreaseCurrentTemperature() {
        return decreaseCurrentTemperature;
    }

    public void setDecreaseCurrentTemperature(int decreaseCurrentTemperature) {
        if (decreaseCurrentTemperature > currentTemperature) {
            return;
        }
        if (decreaseCurrentTemperature < minTemperature) {
            return;
        }
        currentTemperature -= 1;
        this.decreaseCurrentTemperature = currentTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }
}
