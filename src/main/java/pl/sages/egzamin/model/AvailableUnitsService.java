package pl.sages.egzamin.model;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sages.egzamin.persistence.UnitEntityMapper;
import pl.sages.egzamin.persistence.UnitRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AvailableUnitsService {

    private final UnitRepository unitRepository;
    private final UnitEntityMapper mapper;

    public List<AvailableUnit> getAvailableUnitsWithResources(int wood, int food, int stone, int gold) {
        Cost availableResources = new Cost(wood,food,stone,gold);
        return unitRepository.findAll().stream()
                .map(mapper::toUnit)
                .filter(unit -> numberOfAvailableUnits(unit, availableResources)>0)
                .map(unit -> new AvailableUnit(unit.getName(), numberOfAvailableUnits(unit,availableResources)))
                .collect(Collectors.toList());
    }

    private int numberOfAvailableUnits (Unit unit, Cost availableResources) {
        Map<String, Integer> availabilityByResources = new HashMap<>();
        if (unit.getCost().getWood()>0) {
            availabilityByResources.put("wood", subtractOrZero(availableResources.getWood(), unit.getCost().getWood()));
        }
        if (unit.getCost().getFood()>0) {
            availabilityByResources.put("food", subtractOrZero(availableResources.getFood(), unit.getCost().getFood()));
        }
        if (unit.getCost().getGold()>0) {
            availabilityByResources.put("gold", subtractOrZero(availableResources.getGold(), unit.getCost().getGold()));
        }
        if (unit.getCost().getStone()>0) {
            availabilityByResources.put("stone", subtractOrZero(availableResources.getStone(), unit.getCost().getStone()));
        }

        Optional<Integer> min = availabilityByResources.values().stream().min(Integer::compareTo);
        return min.orElse(0);

    }

    private int subtractOrZero(int available, int required) {
        try {
            return available/required;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}

