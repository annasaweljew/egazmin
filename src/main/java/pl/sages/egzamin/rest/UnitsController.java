package pl.sages.egzamin.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.sages.egzamin.model.AvailableUnit;
import pl.sages.egzamin.model.AvailableUnitsService;

import java.util.List;

@RestController
@RequestMapping(path = "/available-units")
@RequiredArgsConstructor
public class UnitsController {

    private final AvailableUnitsService availableUnitsService;

    @GetMapping
    public List<AvailableUnit> getUnitsAvailableForResources(
            @RequestParam int wood,
            @RequestParam int food,
            @RequestParam int stone,
            @RequestParam int gold
    ) {
        return availableUnitsService.getAvailableUnitsWithResources(wood,food,stone,gold);
    }


}
