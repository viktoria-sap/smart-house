package ru.netology;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class RadioTest {
    @Test
    public void shouldNextStation() {
        Radio radio = new Radio(
                20,
                5,
                0
        );
        radio.next();
        int newStation = radio.getCurrentStation();
        assertEquals(6, newStation);
    }
    @Test
    public void shouldNextStation1() {
        Radio radio = new Radio(
                30,
                30,
                0
        );
        radio.next();
        int newStation = radio.getCurrentStation();
        assertEquals(0, newStation);
    }
    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio(
                20,
                0,
                0
        );
        radio.prev();
        int newStation = radio.getCurrentStation();
        assertEquals(20, newStation);
    }
    @Test
    public void shouldPrevStation2() {
        Radio radio = new Radio(
                5,
                3,
                0
        );
        radio.prev();
        int newStation = radio.getCurrentStation();
        assertEquals(2, newStation);
    }
    @Test
    public void shouldIncreaseVolume(){
        Radio radio = new Radio(
                5,
                3,
                100
        );
        radio.increase();
        int newVolume = radio.getCurrentVolume();
        assertEquals(100, newVolume);
    }
    @Test
    public void shouldIncreaseVolume2(){
        Radio radio = new Radio(
                5,
                3,
                50
        );
        radio.increase();
        int newVolume = radio.getCurrentVolume();
        assertEquals(51, newVolume);
    }
    @Test
    public void shouldDecreaseVolume(){
        Radio radio = new Radio(
                5,
                3,
                0
        );
        radio.decrease();
        int newVolume = radio.getCurrentVolume();
        assertEquals(0, newVolume);
    }
    @Test
    public void shouldDecreaseVolume2(){
        Radio radio = new Radio(
                5,
                3,
                35
        );
        radio.decrease();
        int newVolume = radio.getCurrentVolume();
        assertEquals(34, newVolume);
    }
}
