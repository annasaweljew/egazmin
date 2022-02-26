package pl.sages.egzamin;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.sages.egzamin.aoe2api.UnitsCollector;
import pl.sages.egzamin.model.Unit;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Startup implements CommandLineRunner {

    private final UnitsCollector unitsCollector;

    @Override
    public void run(String... args) throws Exception {
        List<Unit> allUnits = unitsCollector.getAllUnits();
        unitsCollector.saveToDatabase(allUnits);
    }
}
