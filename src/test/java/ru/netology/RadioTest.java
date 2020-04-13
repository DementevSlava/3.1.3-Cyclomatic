package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource(
            value= {
                    "1,2",
                    // "0,1",
                    // "10,0",
                    // "20,0",
                    "9,0",
                    // "-3,1"
            }
    )

    public void nextNumberStation(int setRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setNumberStation(setRadioStation);
        radio.increaseNumberStation();
        assertEquals(expected, radio.getNumberStation());
    }

    @ParameterizedTest
    @CsvSource(
            value= {
                    "1,0",
                    "0,9",
                    //"10,8",
                    //"20,8",
                    //"9,8"
            }
    )

    public void prevNumberStation(int setRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setNumberStation(setRadioStation);
        radio.decreaseNumberStation();
        assertEquals(expected, radio.getNumberStation());
    }

    @ParameterizedTest
    @CsvSource(
            value= {
                    "1,1",
                    "5,5",
                    "9,9",
                    "-3,0",
                    "15,9"
            }
    )

    public void setNumberStationManual(int setRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setNumberStation(setRadioStation);
        assertEquals(expected, radio.getNumberStation());
    }

    @ParameterizedTest
    @CsvSource(
            value= {
                    "0,1",
                    "5,6",
                    "10,10",
                    "-3,1",
                    "20,10"
            }
    )

    public void upVolume(int setVolume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(setVolume);
        radio.increaseVolume();
        assertEquals(expected, radio.getVolume());
    }

    @ParameterizedTest
    @CsvSource(
            value= {
                    "0,0",
                    "5,4",
                    "10,9",
                    "-3,0",
                    "20,9"
            }
    )

    public void downVolume(int setVolume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(setVolume);
        radio.decreaseVolume();
        assertEquals(expected, radio.getVolume());
    }

}
