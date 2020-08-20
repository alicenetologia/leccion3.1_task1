package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldIncreaseCurrentTemperature1() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(18);
        conditioner.increaseCurrentTemperature();

        assertEquals(19, conditioner.getCurrentTemperature());

    }

    @Test
    public void shouldIncreaseCurrentTemperature2() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(35);
        conditioner.increaseCurrentTemperature();

        assertEquals(30, conditioner.getCurrentTemperature());

    }


    @Test
    public void shouldIncreaseCurrentTemperature3() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(10);
        conditioner.increaseCurrentTemperature();

        assertEquals(15, conditioner.getCurrentTemperature());

    }


    @Test
    public void shouldDecreaseCurrentTemperature1() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(18);
        conditioner.decreaseCurrentTemperature();

        assertEquals(17, conditioner.getCurrentTemperature());

    }

    @Test
    public void shouldDecreaseCurrentTemperature2() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(5);
        conditioner.decreaseCurrentTemperature();

        assertEquals(15, conditioner.getCurrentTemperature());

    }

    @Test
    public void shouldDecreaseCurrentTemperature3() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(35);
        conditioner.decreaseCurrentTemperature();

        assertEquals(30, conditioner.getCurrentTemperature());

    }


}