package com.alkemyicons.icons.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "continente")
@Setter
@Getter
public class ContinentEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)

    private Long id;
    private String imagen;
    private String denominacion;
}


