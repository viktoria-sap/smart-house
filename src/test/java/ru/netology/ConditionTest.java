package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {

    @Test
    public void shouldIncreaseCurrentTemperature(){
        Condition condition = new Condition();

        condition.setMaxTemperature(30);
        condition.setMinTemperature(15);

        condition.setCurrentTemperature(20);

        assertEquals( 20, condition.getCurrentTemperature());
        condition.increaseCurrentTemperature();
        assertEquals( 21, condition.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperatureMax() {
        Condition condition2 = new Condition();

        condition2.setMaxTemperature(30);
        condition2.setMinTemperature(15);

        condition2.setCurrentTemperature(30);

        assertEquals(30, condition2.getCurrentTemperature());
        condition2.increaseCurrentTemperature();
        assertEquals(0, condition2.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature(){
        Condition condition = new Condition();

        condition.setMaxTemperature(30);
        condition.setMinTemperature(15);

        condition.setCurrentTemperature(20);

        assertEquals( 20, condition.getCurrentTemperature());
        condition.decreaseCurrentTemperature();
        assertEquals( 19, condition.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureMin(){
        Condition condition2 = new Condition();

        condition2.setMaxTemperature(30);
        condition2.setMinTemperature(15);

        condition2.setCurrentTemperature(15);

        assertEquals( 15, condition2.getCurrentTemperature());
        condition2.decreaseCurrentTemperature();
        assertEquals( 0, condition2.getCurrentTemperature());
    }

}