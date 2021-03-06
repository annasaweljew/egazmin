package pl.sages.egzamin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Embeddable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cost {

    @JsonProperty("Wood")
    private int wood;
    @JsonProperty("Food")
    private int food;
    @JsonProperty("Stone")
    private int stone;
    @JsonProperty("Gold")
    private int gold;

}
