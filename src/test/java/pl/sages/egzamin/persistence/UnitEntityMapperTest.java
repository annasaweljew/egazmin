package pl.sages.egzamin.persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.sages.egzamin.model.Cost;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UnitEntityMapperTest {

    @Autowired
    private CostEntityMapper costEntityMapper;

    private static final Long ID = 1L;
    private static final String NAME = "Name";
    private static final int WOOD = 3;
    private static final int GOLD = 12;
    private static final int STONE = 10;
    private static final int FOOD = 7;


    @Test
    void toCostEntity() {
        Cost cost = new Cost();
        cost.setFood(FOOD);
        cost.setGold(GOLD);
        CostEntity costEntity = costEntityMapper.toCostEntity(cost);

        assertEquals(FOOD, costEntity.getFood());
        assertEquals(GOLD, costEntity.getGold());
    }

    @Test
    void toCost() {
    }

    @Test
    void toUnitEntity() {
    }

    @Test
    void toUnit() {
    }
}