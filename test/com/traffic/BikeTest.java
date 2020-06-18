package com.traffic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BikeTest {
    @Test
    void shouldGetTravelRecordForBike() {
        Bike bike = new Bike(10, 1, Arrays.asList(Weather.SUNNY, Weather.WINDY));
        Orbit orbit = new Orbit(20, 10, 15, "ORBIT1");
        TravelRecord record = bike.getTravelRecord(orbit, Weather.SUNNY);

        TravelRecord expected = new TravelRecord("Bike", 129.0, "ORBIT1");
        assertEquals(record, expected);
    }
}