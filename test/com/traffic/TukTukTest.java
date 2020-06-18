package com.traffic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TukTukTest {
    @Test
    void shouldGetTravelRecordForTukTuk() {
        TukTuk tukTuk = new TukTuk(10, 1, Arrays.asList(Weather.SUNNY, Weather.WINDY));
        Orbit orbit = new Orbit(20, 10, 15, "ORBIT1");
        TravelRecord record = tukTuk.getTravelRecord(orbit, Weather.SUNNY);

        TravelRecord expected = new TravelRecord("TukTuk", 129.0, "ORBIT1");
        assertEquals(record, expected);
    }
}