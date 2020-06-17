import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // RAINY 40 20
        Orbit orbit1 = new Orbit(18, 20, Integer.parseInt(args[1]), "ORBIT1");
        Orbit orbit2 = new Orbit(10, 0, Integer.parseInt(args[2]), "ORBIT2");
        List<Orbit> orbits = Arrays.asList(orbit1, orbit2);

        Car car = new Car(20, 3, Arrays.asList(Weather.RAINY, Weather.WINDY, Weather.SUNNY));
        Bike bike = new Bike(10, 2, Arrays.asList(Weather.SUNNY, Weather.WINDY));
        TukTuk tukTuk = new TukTuk(12, 1, Arrays.asList(Weather.SUNNY, Weather.RAINY));
        List<Vehicle> vehicles = Arrays.asList(car, bike, tukTuk);

        WeatherFactory weatherFactory = new WeatherFactory();

        Scorer scorer = new Scorer();

        Weather weather = weatherFactory.getWeather(args[0]);

        String winner = scorer.getWinner(orbits, vehicles, weather);
        System.out.println(winner);
    }
}
