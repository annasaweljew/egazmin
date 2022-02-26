package pl.sages.egzamin.persistence;

import org.mapstruct.Mapper;
import pl.sages.egzamin.model.Cost;
import pl.sages.egzamin.model.Unit;

import java.util.List;

@Mapper(componentModel = "spring",uses = {CostEntityMapper.class})
public interface UnitEntityMapper {

    UnitEntity toUnitEntity(Unit unit);

    Unit toUnit(UnitEntity unitEntity);

    List<Unit> toUnits(List<UnitEntity> unitEntities);

}
