package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {   // Номер текущей радиостанции может принимать значения только в пределах от 0 до 10
    Radio radio = new Radio();

    @Test
    void currentStationNumber() {
        radio.setCurrentStation(2);
        Assertions.assertEquals(2, radio.getCurrentStation());

    }

    @Test
    void currentStationNumber2() {
        radio.setCurrentStation(0);
        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    void currentStationNumber3() {
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    void nextStation() {
        radio.setCurrentStation(4);
        radio.setNextStation();
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void nextStation2() {

        radio.setCurrentStation(9);
        radio.setNextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void prevStation() {
        radio.setCurrentStation(5);
        radio.setPrevStation();
        Assertions.assertEquals(4, radio.getCurrentStation());

    }

    @Test
    void prevStation2() {
        radio.setCurrentStation(9);
        radio.setPrevStation();
        Assertions.assertEquals(8, radio.getCurrentStation());

    }

    @Test
    void prevStation3() {
        radio.setCurrentStation(0);
        radio.setPrevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void findCurrentVolume() {
        radio.setCurrentVolume(70);
        Assertions.assertEquals(70, radio.getCurrentVolume());
    }

    @Test
    void findCurrentVolume2() {
        radio.setCurrentVolume(5);
        Assertions.assertEquals(5, radio.getCurrentVolume());
    }


    @Test
    void turnUpTheVolume() {  // увеличение громкости
        radio.setCurrentVolumе(60);
        radio.setIncreaseVolume();
        Assertions.assertEquals(61, radio.getCurrentVolume());

    }

    @Test
    void turnUpTheVolume2() {
        radio.setCurrentVolumе(99);
        radio.setIncreaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    void turnUpTheVolume3() {
        radio.setCurrentVolumе(100);
        radio.setIncreaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    void turnDownTheVolume() {   // уменьшение громкости
        radio.setCurrentVolumе(1);
        radio.setDecreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void turnDownTheVolume2() {
        radio.setCurrentVolumе(100);
        radio.setDecreaseVolume();
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    void turnDownTheVolume3() {
        radio.setCurrentVolumе(0);
        radio.setDecreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}