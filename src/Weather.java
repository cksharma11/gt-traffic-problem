public class Weather {
    public static Weather SUNNY = new Weather(10);
    public static Weather WINDY = new Weather(0);
    public static Weather RAINY = new Weather(20);

    private double craterReducePercentage;
    private Weather(double craterReducePercentage) {
        this.craterReducePercentage = craterReducePercentage;
    }

    public double reducedCraterCount(int craterCount) {
        double count = craterCount * (this.craterReducePercentage / 100);
        return craterCount - count;
    }
}
