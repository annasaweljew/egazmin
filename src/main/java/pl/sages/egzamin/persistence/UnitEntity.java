package pl.sages.egzamin.persistence;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "units")
public class UnitEntity {

    @Id
    Long id;
    private String name;
    private String description;
    @Embedded
    private CostEntity cost;

}
