import java.util.List;

public abstract class Vehicle {
    double speed;
    double creatorCrossTime;
    List<Weather> weathers;

    public Vehicle(double speed, double creatorCrossTime, List<Weather> weathers) {
        this.speed = speed;
        this.creatorCrossTime = creatorCrossTime;
        this.weathers = weathers;
    }

    public boolean canTravelIn(Weather weather) {
        return this.weathers.contains(weather);
    }

    public double calculateCreatorCrossTime(int numberOfCreator) {
        return this.creatorCrossTime * numberOfCreator;
    }
}
