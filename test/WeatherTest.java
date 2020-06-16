import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherTest {
    @Test
    void shouldReturnReduceNumberOfCrater() {
        Weather rainy = Weather.SUNNY;
        assertEquals(9, rainy.reducedCraterCount(10));
        assertEquals(18, rainy.reducedCraterCount(20));
    }
}