package com.alkemyicons.icons;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "continente")
@Setter

public class ContinentEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)

    private Long id;
    private String imagen;
    private String denominacion;
}


