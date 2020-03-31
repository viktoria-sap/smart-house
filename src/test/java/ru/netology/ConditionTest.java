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
        condition.setIncreaseCurrentTemperature();
        assertEquals( 21, condition.getIncreaseCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperature2() {
        Condition condition2 = new Condition();

        condition2.setMaxTemperature(30);
        condition2.setMinTemperature(15);

        condition2.setCurrentTemperature(30);

        assertEquals(30, condition2.getCurrentTemperature());
        condition2.setIncreaseCurrentTemperature();
        assertEquals(0, condition2.getIncreaseCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature(){
        Condition condition = new Condition();

        condition.setMaxTemperature(30);
        condition.setMinTemperature(15);

        condition.setCurrentTemperature(20);

        assertEquals( 20, condition.getCurrentTemperature());
        condition.setDecreaseCurrentTemperature();
        assertEquals( 19, condition.getDecreaseCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature2(){
        Condition condition2 = new Condition();

        condition2.setMaxTemperature(30);
        condition2.setMinTemperature(15);

        condition2.setCurrentTemperature(15);

        assertEquals( 15, condition2.getCurrentTemperature());
        condition2.setDecreaseCurrentTemperature();
        assertEquals( 0, condition2.getDecreaseCurrentTemperature());
    }

}