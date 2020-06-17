package com.traffic;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

public abstract class Vehicle {
    private double speed;
    private double cratersCrossTime;
    private List<Weather> weathers;

    public Vehicle(double speed, double cratersCrossTime, List<Weather> weathers) {
        this.speed = speed;
        this.cratersCrossTime = cratersCrossTime;
        this.weathers = weathers;
    }

    public boolean canTravelIn(Weather weather) {
        return this.weathers.contains(weather);
    }

    public double calculateCratersCrossTime(double numberOfCreator) {
        return this.cratersCrossTime * numberOfCreator;
    }

    public double maxTravelSpeed(double speedLimit) {
        return Math.min(this.speed, speedLimit);
    }

    public double calculateTotalTravelTime(Orbit orbit, Weather weather) {
        if (!this.canTravelIn(weather)) return Double.POSITIVE_INFINITY;

        double craterCount = weather.reducedCraterCount(orbit.getNumberOfCreators());
        double travelSpeed = this.maxTravelSpeed(orbit.getSpeedLimit());

        double cratersTime = this.calculateCratersCrossTime(craterCount);
        double travelTime = (orbit.getDistance() / travelSpeed) * 60;

        return cratersTime + travelTime;
    }

    public abstract TravelRecord getTravelRecord(Orbit orbit, Weather weather);
}
