import java.util.List;

public abstract class Vehicle {
    double speed;
    double cratersCrossTime;
    List<WeatherType> weatherTypes;

    public Vehicle(double speed, double cratersCrossTime, List<WeatherType> weatherTypes) {
        this.speed = speed;
        this.cratersCrossTime = cratersCrossTime;
        this.weatherTypes = weatherTypes;
    }

    public boolean canTravelIn(WeatherType weatherType) {
        return this.weatherTypes.contains(weatherType);
    }

    public double calculateCratersCrossTime(int numberOfCreator) {
        return this.cratersCrossTime * numberOfCreator;
    }

    public double maxTravelSpeed(double speedLimit) {
        return Math.min(this.speed, speedLimit);
    }
}
