package pl.sages.egzamin.persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.sages.egzamin.model.Cost;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CostEntityMapperTest {

    @Autowired
    private CostEntityMapper costEntityMapper;

    private static final int GOLD = 12;
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

}