package pl.sages.egzamin.persistence;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Setter
@Getter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class CostEntity {

    private int wood;
    private int food;
    private int stone;
    private int gold;
}
