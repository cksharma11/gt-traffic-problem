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
}
