public class TravelRecord {
    private final String vehicleName;
    private final double travelTime;

    public TravelRecord(String vehicleName, double travelTime) {
        this.vehicleName = vehicleName;
        this.travelTime = travelTime;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public double getTravelTime() {
        return travelTime;
    }
}
