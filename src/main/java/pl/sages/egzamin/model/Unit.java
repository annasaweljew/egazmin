package pl.sages.egzamin.model;

import lombok.*;

import javax.persistence.Embedded;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Unit {

    private Long id;
    private String name;
    private String description;
    private Cost cost;

}
