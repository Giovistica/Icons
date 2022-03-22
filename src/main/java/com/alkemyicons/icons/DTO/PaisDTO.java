package com.alkemyicons.icons.DTO;

import com.alkemyicons.icons.entity.ContinentEntity;
import com.alkemyicons.icons.entity.IconEntity;
import lombok.Getter;
import lombok.Setter;


import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class PaisDTO {

    private Long id;
    private String imagen;
    private String denominacion;
    private Long cantidadHabitantes;
    private Long superficie;
    private ContinentEntity continente;
    private Long continenteId;
    private Set<IconEntity> icons = new HashSet<>();
}
