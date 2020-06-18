package com.traffic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MockVehicle extends Vehicle {
    public MockVehicle(double speed, double creatorCrossTime, List<Weather> weathers) {
        super(speed, creatorCrossTime, weathers);
    }

    @Override
    public TravelRecord getTravelRecord(Orbit orbit, Weather weather) {
        return null;
    }
}

class VehicleTest {
    @Test
    void ShouldReturnTrueIfCanTravelInSUNNYWeather() {
        List<Weather> weatherTypes = Arrays.asList(Weather.WINDY, Weather.SUNNY);
        MockVehicle mockVehicle = new MockVehicle(20, 3, weatherTypes);

        assertTrue(mockVehicle.canTravelIn(Weather.SUNNY));
    }

    @Test
    void ShouldReturnFalseIfCannotTravelInSUNNYWeather() {
        List<Weather> weatherTypes = Arrays.asList(Weather.WINDY, Weather.RAINY);
        MockVehicle mockVehicle = new MockVehicle(20, 3, weatherTypes);

        assertFalse(mockVehicle.canTravelIn(Weather.SUNNY));
    }

    @Test
    void shouldReturnTimeTakenToCross2Craters() {
        List<Weather> weatherTypes = Arrays.asList(Weather.WINDY, Weather.SUNNY, Weather.RAINY);
        MockVehicle mockVehicle = new MockVehicle(20, 3, weatherTypes);

        assertEquals(6, mockVehicle.calculateCratersCrossTime(2));
    }

    @Test
    void shouldReturnMaximumTravelSpeedForOrbitGivenSpeedLimit() {
        List<Weather> weatherTypes = Arrays.asList(Weather.WINDY, Weather.SUNNY, Weather.RAINY);
        MockVehicle mockVehicle = new MockVehicle(20, 3, weatherTypes);

        assertEquals(12, mockVehicle.maxTravelSpeed(12));
    }

    @Test
    void shouldReturnTimeTakenForTravelingToOrbit() {
        List<Weather> weatherTypes = Arrays.asList(Weather.WINDY, Weather.SUNNY, Weather.RAINY);
        MockVehicle mockVehicle = new MockVehicle(20, 3, weatherTypes);

        Orbit orbit = new Orbit(20, 1, 40, "ORBIT1");
        Weather sunny = Weather.SUNNY;

        double result = mockVehicle.calculateTotalTravelTime(orbit, sunny);
        assertEquals(62.7, result);
    }
}