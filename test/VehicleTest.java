import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MockVehicle extends Vehicle {
    public MockVehicle(double speed, double creatorCrossTime, List<WeatherType> supportedWeatherTypes) {
        super(speed, creatorCrossTime, supportedWeatherTypes);
    }
}

class VehicleTest {
    @Test
    void ShouldReturnTrueIfCanTravelInWeather() {
        List<WeatherType> weatherTypes = Arrays.asList(WeatherType.WINDY, WeatherType.SUNNY);
        MockVehicle mockVehicle = new MockVehicle(20, 3, weatherTypes);

        assertTrue(mockVehicle.canTravelIn(WeatherType.WINDY));
        assertTrue(mockVehicle.canTravelIn(WeatherType.SUNNY));
    }

    @Test
    void ShouldReturnFalseIfCannotTravelInWeather() {
        List<WeatherType> weatherTypes = Arrays.asList(WeatherType.WINDY, WeatherType.SUNNY);
        MockVehicle mockVehicle = new MockVehicle(20, 3, weatherTypes);

        assertFalse(mockVehicle.canTravelIn(WeatherType.RAINY));
    }

    @Test
    void shouldReturnTimeItWillTakeToCrossNNumbersCreators() {
        List<WeatherType> weatherTypes = Arrays.asList(WeatherType.WINDY, WeatherType.SUNNY, WeatherType.RAINY);
        MockVehicle mockVehicle = new MockVehicle(20, 3, weatherTypes);

        assertEquals(3, mockVehicle.calculateCratersCrossTime(1));
        assertEquals(6, mockVehicle.calculateCratersCrossTime(2));
    }

    @Test
    void shouldReturnMaxSpeedCanTravelGivenOrbitsSpeedLimit() {
        List<WeatherType> weatherTypes = Arrays.asList(WeatherType.WINDY, WeatherType.SUNNY, WeatherType.RAINY);
        MockVehicle mockVehicle = new MockVehicle(20, 3, weatherTypes);

        assertEquals(20, mockVehicle.maxTravelSpeed(25));
        assertEquals(12, mockVehicle.maxTravelSpeed(12));
    }
}