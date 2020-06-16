public class Orbit {
    private double distance;
    private int numberOfCreators;
    private double speedLimit;

    public Orbit(double distance, int numberOfCreators, double speedLimit) {
        this.distance = distance;
        this.numberOfCreators = numberOfCreators;
        this.speedLimit = speedLimit;
    }

    public double getDistance() {
        return distance;
    }

    public int getNumberOfCreators() {
        return numberOfCreators;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }
}
