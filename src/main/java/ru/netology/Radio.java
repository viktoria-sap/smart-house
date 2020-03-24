package ru.netology;

public class Radio {

    private int maxStation;
    private int minStation;
    private int numberCurrentStation;
    private int nextStation;
    private int prevStation;
    boolean next;
    boolean prev;

    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private int increaseCurrentVolume;
    private int decreaseCurrentVolume;
    boolean increase;
    boolean decrease;

    public boolean isNext(boolean b) {
        return next;
    }

    public void setNext(boolean next) {
        this.next = next;
    }

    public boolean isPrev(boolean b) {
        return prev;
    }

    public void setPrev(boolean prev) {
        this.prev = prev;
    }

    public void setMaxStation ( int maxStation){
        this.maxStation = maxStation;
    }

    public void setMinStation ( int minStation){
        this.minStation = minStation;
    }

    public int getNumberCurrentStation () {
        return numberCurrentStation;
    }

    public void setNumberCurrentStation ( int numberCurrentStation){
        this.numberCurrentStation = numberCurrentStation;
    }

    public int getNextStation () {
        return nextStation;
    }

    public void setNextStation (int nextStation){
        if (isPrev(true)) {
            return;
        }
        numberCurrentStation += 1;
        if (numberCurrentStation > maxStation) {
            numberCurrentStation = 0;
        }
        this.nextStation = numberCurrentStation;
    }

    public  int getPrevStation () {
        return prevStation;
    }

    public void setPrevStation (int prevStation){
        if (isNext(true)) {
            return;
        }
        numberCurrentStation -= 1;
        if (numberCurrentStation < minStation) {
            numberCurrentStation = 9;
        }
        this.prevStation = numberCurrentStation;
    }

    public boolean isIncrease(boolean b) {
        return increase;
    }

    public void setIncrease(boolean increase) {
        this.increase = increase;
    }

    public boolean isDecrease(boolean b) {
        return decrease;
    }

    public void setDecrease(boolean decrease) {
        this.decrease = decrease;
    }

    public void setMaxVolume ( int maxVolume){
        this.maxVolume = maxVolume;
    }

    public void setMinVolume ( int minVolume){
        this.minVolume = minVolume;
    }

    public int getCurrentVolume () {
        return currentVolume;
    }

    public void setCurrentVolume ( int currentVolume){
        this.currentVolume = currentVolume;
    }

    public int getIncreaseCurrentVolume () {
        return increaseCurrentVolume;
    }

    public void setIncreaseCurrentVolume ( int increaseCurrentVolume){
        if (isDecrease(true)) {
            return;
        }
        currentVolume += 1;
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.increaseCurrentVolume = currentVolume;
    }

    public int getDecreaseCurrentVolume () {
        return decreaseCurrentVolume;
    }

    public void setDecreaseCurrentVolume ( int decreaseCurrentVolume){
        if (isIncrease(true)) {
            return;
        }
        currentVolume -= 1;
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.decreaseCurrentVolume = currentVolume;
    }
}