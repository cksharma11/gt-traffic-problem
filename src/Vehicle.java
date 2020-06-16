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

    public double calculateCratersCrossTime(int numberOfCreator) {
        return this.cratersCrossTime * numberOfCreator;
    }

    public double maxTravelSpeed(double speedLimit) {
        return Math.min(this.speed, speedLimit);
    }

    private double getCratersTime(double count) {
        double minutes =  count * this.cratersCrossTime;
        return minutes / 60;
    }

    private double getTravelTime(double distance, double speed) {
        return distance / speed;
    }

    public double calculateTotalTravelTime(Orbit orbit, Weather weather) {
        double craterCount = weather.reducedCraterCount(orbit.getNumberOfCreators());
        double travelSpeed = this.maxTravelSpeed(orbit.getSpeedLimit());

        double cratersTime = this.getCratersTime(craterCount);
        double travelTime = this.getTravelTime(orbit.getDistance(), travelSpeed);

        return cratersTime + travelTime;
    }
}
