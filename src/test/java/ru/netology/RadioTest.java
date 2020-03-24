package ru.netology;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class RadioTest {

    @Test
    public void shouldNextStation(){
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);

        radio.setNumberCurrentStation(6);
        radio.setNext(false);
        radio.setPrev(true);

        assertEquals( false, radio.isNext(false));
        assertEquals( true, radio.isPrev(true));
        assertEquals( 6, radio.getNumberCurrentStation());
        radio.setNextStation(7);
        assertEquals( 0, radio.getNextStation());
    }

    @Test
    public void shouldNextStation1(){
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);

        radio.setNumberCurrentStation(9);
        radio.setNext(true);
        radio.setPrev(false);

        assertEquals( true, radio.isNext(true));
        assertEquals( false, radio.isPrev(false));
        assertEquals( 9, radio.getNumberCurrentStation());
        radio.setNextStation(10);
        assertEquals( 0, radio.getNextStation());
    }

    @Test
    public void shouldNextStation2(){
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);

        radio.setNumberCurrentStation(7);
        radio.setNext(true);
        radio.setPrev(false);

        assertEquals( true, radio.isNext(true));
        assertEquals( false, radio.isPrev(false));
        assertEquals( 7, radio.getNumberCurrentStation());
        radio.setNextStation(8);
        assertEquals( 8, radio.getNextStation());
    }

    @Test
    public void shouldPrevStation(){
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);

        radio.setNumberCurrentStation(0);
        radio.setNext(false);
        radio.setPrev(true);

        assertEquals( false, radio.isNext(false));
        assertEquals( true, radio.isPrev(true));
        assertEquals( 0, radio.getNumberCurrentStation());
        radio.setPrevStation(9);
        assertEquals( 9, radio.getPrevStation());
    }

    @Test
    public void shouldPrevStation1(){
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);

        radio.setNumberCurrentStation(0);
        radio.setNext(true);
        radio.setPrev(false);

        assertEquals( true, radio.isNext(true));
        assertEquals( false, radio.isPrev(false));
        assertEquals( 0, radio.getNumberCurrentStation());
        radio.setPrevStation(9);
        assertEquals( 0, radio.getPrevStation());
    }

    @Test
    public void shouldPrevStation2(){
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);

        radio.setNumberCurrentStation(3);
        radio.setNext(false);
        radio.setPrev(true);

        assertEquals( false, radio.isNext(false));
        assertEquals( true, radio.isPrev(true));
        assertEquals( 3, radio.getNumberCurrentStation());
        radio.setPrevStation(2);
        assertEquals( 2, radio.getPrevStation());
    }

    @Test
    public void shouldIncreaseVolume(){
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurrentVolume(10);
        radio.setIncrease(true);
        radio.setDecrease(false);

        assertEquals( true, radio.isIncrease(true));
        assertEquals( false, radio.isDecrease(false));
        assertEquals( 10, radio.getCurrentVolume());
        radio.setIncreaseCurrentVolume(10);
        assertEquals( 10, radio.getIncreaseCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume1(){
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurrentVolume(10);
        radio.setIncrease(false);
        radio.setDecrease(true);

        assertEquals( false, radio.isIncrease(false));
        assertEquals( true, radio.isDecrease(true));
        assertEquals( 10, radio.getCurrentVolume());
        radio.setIncreaseCurrentVolume(10);
        assertEquals( 0, radio.getIncreaseCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume2(){
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurrentVolume(7);
        radio.setIncrease(true);
        radio.setDecrease(false);

        assertEquals( true, radio.isIncrease(true));
        assertEquals( false, radio.isDecrease(false));
        assertEquals( 7, radio.getCurrentVolume());
        radio.setIncreaseCurrentVolume(8);
        assertEquals( 8, radio.getIncreaseCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume(){
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurrentVolume(0);
        radio.setIncrease(false);
        radio.setDecrease(true);

        assertEquals( false, radio.isIncrease(false));
        assertEquals( true, radio.isDecrease(true));
        assertEquals( 0, radio.getCurrentVolume());
        radio.setDecreaseCurrentVolume(0);
        assertEquals( 0, radio.getDecreaseCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume1(){
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurrentVolume(0);
        radio.setIncrease(true);
        radio.setDecrease(false);

        assertEquals( true, radio.isIncrease(true));
        assertEquals( false, radio.isDecrease(false));
        assertEquals( 0, radio.getCurrentVolume());
        radio.setDecreaseCurrentVolume(0);
        assertEquals( 0, radio.getDecreaseCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume2(){
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurrentVolume(3);
        radio.setIncrease(false);
        radio.setDecrease(true);

        assertEquals( false, radio.isIncrease(false));
        assertEquals( true, radio.isDecrease(true));
        assertEquals( 3, radio.getCurrentVolume());
        radio.setDecreaseCurrentVolume(2);
        assertEquals( 2, radio.getDecreaseCurrentVolume());
    }

}
