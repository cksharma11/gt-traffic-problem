package com.traffic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {
    @Test
    void shouldGetTravelRecord() {
        Car car = new Car(10, 1, Arrays.asList(Weather.SUNNY, Weather.WINDY));
        Orbit orbit = new Orbit(20, 10, 15, "ORBIT1");
        TravelRecord record = car.getTravelRecord(orbit, Weather.SUNNY);

        TravelRecord expected = new TravelRecord("Car", 129.0, "ORBIT1");
        assertEquals(record, expected);
    }
}