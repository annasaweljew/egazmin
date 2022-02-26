package pl.sages.egzamin.aoe2api;

import org.junit.jupiter.api.Test;
import pl.sages.egzamin.model.Unit;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UnitsCollectorTest {

    private final UnitsCollector unitsCollector = new UnitsCollector();

    @Test
    void shouldGetAllUnitsFromAoe2Api() {
        List<Unit> units = unitsCollector.getAllUnits();

        assertNotNull(units);
        assertTrue(units.size()>0);
    }
}