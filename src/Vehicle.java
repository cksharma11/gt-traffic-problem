import java.util.List;

public abstract class Vehicle {
    double speed;
    double cratersCrossTime;
    List<Weather> weathers;

    public Vehicle(double speed, double cratersCrossTime, List<Weather> weathers) {
        this.speed = speed;
        this.cratersCrossTime = cratersCrossTime;
        this.weathers = weathers;
    }

    public boolean canTravelIn(Weather weather) {
        return this.weathers.contains(weather);
    }

    public double calculateCratersCrossTime(int numberOfCreator) {
        return this.cratersCrossTime * numberOfCreator;
    }

    public double maxTravelSpeed(double speedLimit) {
        return Math.min(this.speed, speedLimit);
    }
}
