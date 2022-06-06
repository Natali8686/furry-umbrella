package ru.netology.javaqa;

public class Radio {
    private int currentStation;
    private int amountStation = 10;
    private int minStation;

    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume;


    public int getAmountStation() {
        return amountStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public Radio(int minStation, int amountStation) {
        this.minStation = minStation;
        this.amountStation = amountStation;

    }

    public Radio() {

    }

    public void setCurrentStation(int currentStation) { // Номер текущей радиостанции только от 0 до 10
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > amountStation - 1) {
            return;
        }
        this.currentStation = currentStation;

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNextStation() {   // переключение на следующую станцию
        if (currentStation == amountStation - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void setPrevStation() {  // предыдущая станция
        if (currentStation == 0) {
            currentStation = amountStation - 1;
        } else {
            currentStation--;
        }
    }

    public void setCurrentVolumе(int currentVolumе) { // пределы громкости от 0 до 100
        if (currentVolumе < minVolume) {
            return;
        }
        if (currentVolumе > maxVolume) {
            return;
        }
        this.currentVolume = currentVolumе;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume() {  // достижение максимального уровня громкости
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }


    public void setDecreaseVolume() {  // достижение минимального уровня громкости
        if (currentVolume == 0) {
            return;
        }
        currentVolume--;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}






