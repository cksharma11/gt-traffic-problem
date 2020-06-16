import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MockVehicle extends Vehicle {
    public MockVehicle(double speed, double creatorCrossTime, List<Weather> supportedWeathers) {
        super(speed, creatorCrossTime, supportedWeathers);
    }
}

class VehicleTest {
    @Test
    void ShouldReturnTrueIfCanTravelInWeather() {
        List<Weather> weathers = Arrays.asList(Weather.WINDY, Weather.SUNNY);
        MockVehicle mockVehicle = new MockVehicle(20, 3, weathers);

        assertTrue(mockVehicle.canTravelIn(Weather.WINDY));
        assertTrue(mockVehicle.canTravelIn(Weather.SUNNY));
    }

    @Test
    void ShouldReturnFalseIfCannotTravelInWeather() {
        List<Weather> weathers = Arrays.asList(Weather.WINDY, Weather.SUNNY);
        MockVehicle mockVehicle = new MockVehicle(20, 3, weathers);

        assertFalse(mockVehicle.canTravelIn(Weather.RAINY));
    }

    @Test
    void shouldReturnTimeItWillTakeToCrossNNumbersCreators() {
        List<Weather> weathers = Arrays.asList(Weather.WINDY, Weather.SUNNY, Weather.RAINY);
        MockVehicle mockVehicle = new MockVehicle(20, 3, weathers);

        assertEquals(3, mockVehicle.calculateCreatorCrossTime(1));
        assertEquals(6, mockVehicle.calculateCreatorCrossTime(2));
    }
}