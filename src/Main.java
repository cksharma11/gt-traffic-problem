import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Orbit orbit = new Orbit(18, 20, 15);
        Car car = new Car(20, 3, Arrays.asList(Weather.RAINY, Weather.WINDY, Weather.SUNNY));
        Bike bike = new Bike(10, 2, Arrays.asList(Weather.SUNNY, Weather.WINDY));
        TukTuk tukTuk = new TukTuk(12, 1, Arrays.asList(Weather.SUNNY, Weather.RAINY));

        List<Vehicle> vehicles = Arrays.asList(car, bike, tukTuk);

        Scorer scorer = new Scorer();
        String winner = scorer.getWinner(orbit, vehicles, Weather.WINDY);

        System.out.println(winner);
    }
}
