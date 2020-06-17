import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Scorer {
    public String getWinner(Orbit orbit, List<Vehicle> vehicles, Weather weather) {
        Stream<TravelRecord> travelRecords = vehicles.stream().map(vehicle -> vehicle.getTravelRecord(orbit, weather));
        TravelRecord winnerRecord = travelRecords.min(Comparator.comparingDouble(TravelRecord::getTravelTime)).get();
        return winnerRecord.getVehicleName();
    }
}
