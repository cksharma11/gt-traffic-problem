import java.util.List;

public class Bike extends Vehicle {
    public Bike(double speed, double cratersCrossTime, List<Weather> weathers) {
        super(speed, cratersCrossTime, weathers);
    }

    @Override
    public TravelRecord getTravelRecord(Orbit orbit, Weather weather) {
        return new TravelRecord("Bike", this.calculateTotalTravelTime(orbit, weather));
    }
}
