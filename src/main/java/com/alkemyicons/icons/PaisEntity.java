package com.alkemyicons.icons;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pais")
@Getter
@Setter

public class PaisEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;

    private String denominacion;

    @Column(name = "cantidad_de_habitantes")
    private Long cantidadHabitantes;

    private Long superficie;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "continenteId", insertable = false, updatable = false )
    private ContinentEntity continente;

    @Column(name = "continentID", nullable = false)
    private Long continenteId;

    @ManyToMany( cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable( name ="icon_pais",
                joinColumns = @JoinColumn(name = "icon_id"),
                inverseJoinColumns = @JoinColumn(name = "icon_pais"))
    private Set <IconEntity> icons = new HashSet<>();
}




