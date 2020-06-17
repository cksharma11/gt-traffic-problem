package com.traffic;

import java.util.List;

public class TukTuk extends Vehicle {
    public TukTuk(double speed, double cratersCrossTime, List<Weather> weathers) {
        super(speed, cratersCrossTime, weathers);
    }

    @Override
    public TravelRecord getTravelRecord(Orbit orbit, Weather weather) {
        return new TravelRecord("com.mission_impossible.TukTuk", this.calculateTotalTravelTime(orbit, weather), orbit.getName());
    }
}
