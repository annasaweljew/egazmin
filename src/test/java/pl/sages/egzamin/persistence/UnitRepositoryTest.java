package pl.sages.egzamin.persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class UnitRepositoryTest {

    @Autowired
    private UnitRepository unitRepository;

    private final UnitEntity unit = new UnitEntity(
            1L,
            "test unit",
            "description is not important here",
            new CostEntity(9,10,4,11)
    );

    @Test
    void should_save_new_unit() {
        UnitEntity savedEntity = unitRepository.save(unit);
        assertEquals(unit.getId(), savedEntity.getId());
        assertEquals(unit.getName(), savedEntity.getName());
        assertEquals(unit.getCost().getGold(), savedEntity.getCost().getGold());
        assertEquals(1, unitRepository.findAll().size());
    }
}