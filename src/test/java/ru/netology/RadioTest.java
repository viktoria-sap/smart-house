package ru.netology;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class RadioTest {

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio(
            20,
            5,
            false,
            true
        );

        assertEquals(5, radio.getNumberCurrentStation());
        radio.setNextStation(6);
        assertEquals(0, radio.getNextStation());
    }

    @Test
    public void shouldNextStation1() {
        Radio radio = new Radio(
                30,
                30,
                true,
                false
        );

        assertEquals(30, radio.getNumberCurrentStation());
        radio.setNextStation(31);
        assertEquals(0, radio.getNextStation());
    }

    @Test
    public void shouldNextStation2() {
        Radio radio = new Radio(
                5,
                3,
                true,
                false
        );

        assertEquals(3, radio.getNumberCurrentStation());
        radio.setNextStation(4);
        assertEquals(4, radio.getNextStation());
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio(
                20,
                0,
                false,
                true
        );

        assertEquals(0, radio.getNumberCurrentStation());
        radio.setPrevStation(20);
        assertEquals(20, radio.getPrevStation());
    }

    @Test
    public void shouldPrevStation1() {
        Radio radio = new Radio(
                30,
                15,
                true,
                false
        );

        assertEquals(15, radio.getNumberCurrentStation());
        radio.setPrevStation(14);
        assertEquals(0, radio.getPrevStation());
    }

    @Test
    public void shouldPrevStation2() {
        Radio radio = new Radio(
                5,
                3,
                false,
                true
        );

        assertEquals(3, radio.getNumberCurrentStation());
        radio.setPrevStation(2);
        assertEquals(2, radio.getPrevStation());
    }

    @Test
    public void shouldIncreaseVolume(){
        Radio radio = new Radio(
                100,
                true,
                false
        );

        assertEquals( 100, radio.getCurrentVolume());
        radio.setIncreaseCurrentVolume(100);
        assertEquals( 100, radio.getIncreaseCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume1(){
        Radio radio = new Radio(
                100,
                false,
                true
        );

        assertEquals( 100, radio.getCurrentVolume());
        radio.setIncreaseCurrentVolume(100);
        assertEquals( 0, radio.getIncreaseCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume2(){
        Radio radio = new Radio(
                50,
                true,
                false
        );

        assertEquals( 50, radio.getCurrentVolume());
        radio.setIncreaseCurrentVolume(51);
        assertEquals( 51, radio.getIncreaseCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume(){
        Radio radio = new Radio(
                0,
                false,
                true
        );

        assertEquals( 0, radio.getCurrentVolume());
        radio.setDecreaseCurrentVolume(0);
        assertEquals( 0, radio.getDecreaseCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume1(){
        Radio radio = new Radio(
                0,
                true,
                false
        );

        assertEquals( 0, radio.getCurrentVolume());
        radio.setDecreaseCurrentVolume(0);
        assertEquals( 0, radio.getDecreaseCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume2(){
        Radio radio = new Radio(
                35,
                false,
                true
        );

        assertEquals( 35, radio.getCurrentVolume());
        radio.setDecreaseCurrentVolume(34);
        assertEquals( 34, radio.getDecreaseCurrentVolume());
    }
}

