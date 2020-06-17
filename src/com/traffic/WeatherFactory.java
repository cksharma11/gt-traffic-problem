package com.traffic;

public class WeatherFactory {
    public Weather getWeather(String weather) {
        switch (weather.toLowerCase()) {
            case "rainy":
                return Weather.RAINY;
            case "windy":
                return Weather.WINDY;
            case "sunny":
                return Weather.SUNNY;
            default:
                return null;
        }
    }
}
