package ru.netology.domain;

public class Conditioner {
    private String name;
    private int currentTemperature;
    private int maxTemperature = 30;
    private int minTemperature = 15;

    public void increaseCurrentTemperature() {
        if (currentTemperature >= minTemperature & currentTemperature < maxTemperature) {
            this.currentTemperature = currentTemperature + 1;
        }

        if (currentTemperature >= maxTemperature ) {
            this.currentTemperature = maxTemperature;
        }

        if (currentTemperature < minTemperature ) {
            this.currentTemperature = minTemperature;
        }

        this.currentTemperature = currentTemperature;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature > minTemperature & currentTemperature <= maxTemperature) {
            this.currentTemperature = currentTemperature - 1;
        }
        if (currentTemperature <= minTemperature) {
            this.currentTemperature = minTemperature;
        }

        if (currentTemperature > maxTemperature) {
            this.currentTemperature = maxTemperature;
        }

        this.currentTemperature = currentTemperature;

    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }
}

