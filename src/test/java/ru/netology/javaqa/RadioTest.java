package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {   // Номер текущей радиостанции может принимать значения только в пределах от 0 до 9

    @Test
    public void currentStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void customRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.customStation();

        int actual = radio.getCurrentStation();
        int expected = 7;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void currentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolumе(7);

        int actual = radio.getCurrentVolum();
        int expected = 7;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void turnUpTheVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolumе(6);
        radio.increaseVolume();

        int actual = radio.getCurrentVolum();
        int expected = 7;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void turnDownTheVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolumе(5);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolum();
        int expected = 4;

        Assertions.assertEquals(actual, expected);
    }
}
