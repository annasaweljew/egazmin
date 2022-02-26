package pl.sages.egzamin.persistence;

import org.mapstruct.Mapper;
import pl.sages.egzamin.model.Cost;

@Mapper(componentModel = "spring")
public interface CostEntityMapper {

    CostEntity toCostEntity (Cost cost);

    Cost toCost (CostEntity costEntity);

}
