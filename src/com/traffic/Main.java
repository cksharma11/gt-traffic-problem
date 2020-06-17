package com.traffic;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = args[0];
        Parser parser = new Parser();
        ParsedInput parsedInput = parser.parseInput(filePath);

        Orbit orbit1 = new Orbit(18, 20, parsedInput.getOrbit1SpeedLimit(), "ORBIT1");
        Orbit orbit2 = new Orbit(10, 0, parsedInput.getOrbit2SpeedLimit(), "ORBIT2");
        List<Orbit> orbits = Arrays.asList(orbit1, orbit2);

        Car car = new Car(20, 3, Arrays.asList(Weather.RAINY, Weather.WINDY, Weather.SUNNY));
        Bike bike = new Bike(10, 2, Arrays.asList(Weather.SUNNY, Weather.WINDY));
        TukTuk tukTuk = new TukTuk(12, 1, Arrays.asList(Weather.SUNNY, Weather.RAINY));
        List<Vehicle> vehicles = Arrays.asList(car, bike, tukTuk);

        WeatherFactory weatherFactory = new WeatherFactory();

        Scorer scorer = new Scorer();

        Weather weather = weatherFactory.getWeather(parsedInput.getWeatherString());

        String winner = scorer.getWinner(orbits, vehicles, weather);
        System.out.println(winner.toUpperCase());
    }
}
