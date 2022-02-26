package pl.sages.egzamin.aoe2api;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.sages.egzamin.model.Unit;
import pl.sages.egzamin.model.UnitsList;

import java.net.URI;
import java.util.Collections;
import java.util.List;

@Service
public class UnitsCollector {

    private static final String AOE2_API_UNITS = "http://aoe2.devops.sages.pl/api/v1/units";

    private final RestTemplate restTemplate = new RestTemplate();
//    private final UnitRepository unitRepository;

    public List<Unit> getAllUnits () {
        UnitsList unitsList = restTemplate.getForObject(URI.create(AOE2_API_UNITS), UnitsList.class);
        if (unitsList==null) {
            return Collections.emptyList();
        }
        return unitsList.getUnits();
    }

    public void saveToDatabase(List<Unit> units) {

    }

}
