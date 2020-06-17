import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TukTukTest {
    @Test
    void shouldGetTravelRecord() {
        TukTuk tukTuk = new TukTuk(10, 1, Arrays.asList(Weather.SUNNY, Weather.WINDY));
        Orbit orbit = new Orbit(20, 10, 15, "ORBIT1");
        TravelRecord record = tukTuk.getTravelRecord(orbit, Weather.SUNNY);

        TravelRecord expected = new TravelRecord("TukTuk", 2.15, "ORBIT1");
        assertEquals(record, expected);
    }
}