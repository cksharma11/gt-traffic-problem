package com.traffic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    @Test
    void shouldGetTravelRecord() {
        Bike bike = new Bike(10, 1, Arrays.asList(Weather.SUNNY, Weather.WINDY));
        Orbit orbit = new Orbit(20, 10, 15, "ORBIT1");
        TravelRecord record = bike.getTravelRecord(orbit, Weather.SUNNY);

        TravelRecord expected = new TravelRecord("Bike", 2.15, "ORBIT1");
        assertEquals(record, expected);
    }
}