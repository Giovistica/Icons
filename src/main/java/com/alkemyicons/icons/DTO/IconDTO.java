package com.alkemyicons.icons.DTO;

import com.alkemyicons.icons.entity.PaisEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class IconDTO {

    private Long id;
    private String imagen;
    private String denominacion;

    private LocalDate fechaCreacion;
    private Long altura;
    private String historia;
    private Boolean deleted = Boolean.FALSE;
    private List<PaisEntity> paises = new ArrayList<>();


}
