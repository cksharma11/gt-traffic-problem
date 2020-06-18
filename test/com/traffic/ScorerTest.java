package com.traffic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScorerTest {
    Orbit orbit1 = new Orbit(10, 0, 10, "ORBIT1");
    Orbit orbit2 = new Orbit(10, 0, 20, "ORBIT2");
    List<Orbit> orbits = Arrays.asList(orbit1, orbit2);

    Car car = new Car(20, 3, Arrays.asList(Weather.RAINY, Weather.WINDY, Weather.SUNNY));
    Bike bike = new Bike(10, 2, Arrays.asList(Weather.SUNNY, Weather.WINDY));
    TukTuk tukTuk = new TukTuk(12, 1, Arrays.asList(Weather.SUNNY, Weather.RAINY));
    List<Vehicle> vehicles = Arrays.asList(bike, tukTuk, car);

    WeatherFactory weatherFactory = new WeatherFactory();


    @Test
    void shouldReturnMinimumTimeRecord() {
        Scorer scorer = new Scorer();
        TravelRecord record = scorer.getWinnerForOrbit(orbit1, vehicles, weatherFactory.getWeather("rainy"));

        TravelRecord expected = new TravelRecord("TukTuk", 60.0, "ORBIT1");
        assertEquals(expected, record);
    }

    @Test
    void shouldReturnMessageWithVehicleAndOrbitNameOfWhichCanBeTraveledInMinimumTimeForRainyWeather() {
        Scorer scorer = new Scorer();
        String record = scorer.getWinner(orbits, vehicles, weatherFactory.getWeather("rainy"));

        assertEquals("Car ORBIT2", record);
    }

    @Test
    void shouldReturnMessageWithVehicleAndOrbitNameOfWhichCanBeTraveledInMinimumTimeForSunnyWeather() {
        Orbit orbit1 = new Orbit(18, 20, 14, "ORBIT1");
        Orbit orbit2 = new Orbit(20, 10, 14, "ORBIT2");
        List<Orbit> orbits = Arrays.asList(orbit1, orbit2);

        Scorer scorer = new Scorer();
        String record = scorer.getWinner(orbits, vehicles, weatherFactory.getWeather("sunny"));

        assertEquals("TukTuk ORBIT1", record);
    }

    @Test
    void shouldReturnOverallWinner3() {
        Orbit orbit1 = new Orbit(18, 20, 22, "ORBIT1");
        Orbit orbit2 = new Orbit(20, 10, 12, "ORBIT2");
        List<Orbit> orbits = Arrays.asList(orbit1, orbit2);

        Scorer scorer = new Scorer();
        String record = scorer.getWinner(orbits, vehicles, weatherFactory.getWeather("windy"));

        assertEquals("Car ORBIT1", record);
    }
}