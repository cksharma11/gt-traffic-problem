import java.util.List;

public class Car extends Vehicle {
    public Car(double speed, double cratersCrossTime, List<Weather> weathers) {
        super(speed, cratersCrossTime, weathers);
    }

    @Override
    public TravelRecord getTravelRecord(Orbit orbit, Weather weather) {
        return new TravelRecord("Car", this.calculateTotalTravelTime(orbit, weather));
    }
}
