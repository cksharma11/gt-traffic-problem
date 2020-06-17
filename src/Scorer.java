import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Scorer {
    public TravelRecord getWinnerForOrbit(Orbit orbit, List<Vehicle> vehicles, Weather weather) {
        Stream<TravelRecord> travelRecords = vehicles.stream().map(vehicle -> vehicle.getTravelRecord(orbit, weather));
        return travelRecords.min(Comparator.comparingDouble(TravelRecord::getTravelTime)).get();
    }

    public String getWinner(List<Orbit> orbits, List<Vehicle> vehicles, Weather weather){
        Stream<TravelRecord> recordStream = orbits.stream().map(orbit -> getWinnerForOrbit(orbit, vehicles, weather));
        TravelRecord travelRecord = recordStream.min(Comparator.comparingDouble(TravelRecord::getTravelTime)).get();
        return travelRecord.getVehicleName() + " " + travelRecord.getOrbitName();
    }
}
