package com.traffic;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int orbit1SpeedLimit = Integer.parseInt(args[1]);
        int orbit2SpeedLimit = Integer.parseInt(args[2]);
        String weatherString = args[0];

        Orbit orbit1 = new Orbit(18, 20, orbit1SpeedLimit, "ORBIT1");
        Orbit orbit2 = new Orbit(10, 0, orbit2SpeedLimit, "ORBIT2");
        List<Orbit> orbits = Arrays.asList(orbit1, orbit2);

        Car car = new Car(20, 3, Arrays.asList(Weather.RAINY, Weather.WINDY, Weather.SUNNY));
        Bike bike = new Bike(10, 2, Arrays.asList(Weather.SUNNY, Weather.WINDY));
        TukTuk tukTuk = new TukTuk(12, 1, Arrays.asList(Weather.SUNNY, Weather.RAINY));
        List<Vehicle> vehicles = Arrays.asList(car, bike, tukTuk);

        WeatherFactory weatherFactory = new WeatherFactory();

        Scorer scorer = new Scorer();

        Weather weather = weatherFactory.getWeather(weatherString);

        String winner = scorer.getWinner(orbits, vehicles, weather);
        System.out.println(winner);
    }
}
