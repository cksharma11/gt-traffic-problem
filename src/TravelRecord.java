import java.util.Objects;

public class TravelRecord {
    private final String vehicleName;
    private final double travelTime;
    private String orbitName;

    public TravelRecord(String vehicleName, double travelTime, String orbitName) {
        this.vehicleName = vehicleName;
        this.travelTime = travelTime;
        this.orbitName = orbitName;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public String getOrbitName() {
        return this.orbitName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TravelRecord)) return false;
        TravelRecord record = (TravelRecord) o;
        return Double.compare(record.travelTime, travelTime) == 0 &&
                Objects.equals(vehicleName, record.vehicleName) &&
                Objects.equals(orbitName, record.orbitName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleName, travelTime, orbitName);
    }
}
