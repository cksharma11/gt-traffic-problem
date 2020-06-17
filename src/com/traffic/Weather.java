package com.traffic;

public enum Weather {
    SUNNY(10),
    WINDY(0),
    RAINY(20);

    double craterReducePercentage;

    Weather(double craterReducePercentage) {
        this.craterReducePercentage = craterReducePercentage;
    }

    public double reducedCraterCount(int craterCount) {
        double count = craterCount * (this.craterReducePercentage / 100);
        return craterCount - count;
    }
}
