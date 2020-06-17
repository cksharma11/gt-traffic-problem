package com.traffic;

public class Orbit {
    private final String name;
    private double distance;
    private int numberOfCreators;
    private double speedLimit;

    public Orbit(double distance, int numberOfCreators, double speedLimit, String name) {
        this.distance = distance;
        this.numberOfCreators = numberOfCreators;
        this.speedLimit = speedLimit;
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public int getNumberOfCreators() {
        return numberOfCreators;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

    public String getName() {
        return this.name;
    }
}
