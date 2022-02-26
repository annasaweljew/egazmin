package pl.sages.egzamin.aoe2api;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.sages.egzamin.model.Unit;
import pl.sages.egzamin.persistence.UnitEntityMapper;
import pl.sages.egzamin.persistence.UnitRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UnitsCollectorTest {

    @Mock
    private UnitRepository unitRepository;
    @Mock
    private UnitEntityMapper unitEntityMapper;

    @InjectMocks
    private UnitsCollector unitsCollector;

    @Test
    void shouldGetAllUnitsFromAoe2Api() {
        List<Unit> units = unitsCollector.getAllUnits();

        assertNotNull(units);
        assertTrue(units.size()>0);
    }
}