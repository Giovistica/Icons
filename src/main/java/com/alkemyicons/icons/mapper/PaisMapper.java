package com.alkemyicons.icons.mapper;

import com.alkemyicons.icons.DTO.PaisDTO;
import com.alkemyicons.icons.entity.PaisEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PaisMapper {

    public List<PaisDTO> paisEntityToDTOList(List<PaisEntity> entities) {

        List <PaisDTO> dtos = new ArrayList<>();
        for(PaisEntity entity : entities){
            dtos.add(this.paisEntityToDTO(entity));
        }
        return dtos;

    }

    public PaisEntity paisDTOToEntity(PaisDTO dto) {

        PaisEntity paisEntity = new PaisEntity();
        paisEntity.setImagen(dto.getImagen());
        paisEntity.setDenominacion(dto.getDenominacion());
        paisEntity.setCantidadHabitantes(dto.getCantidadHabitantes());
        paisEntity.setSuperficie(dto.getSuperficie());
        paisEntity.setContinenteId(dto.getContinenteId());

        return paisEntity;
    }

    public PaisDTO paisEntityToDTO(PaisEntity entity) {

        PaisDTO paisDTO = new PaisDTO();
        paisDTO.setId(entity.getId());
        paisDTO.setImagen(entity.getImagen());
        paisDTO.setDenominacion(entity.getDenominacion());
        paisDTO.setCantidadHabitantes(entity.getCantidadHabitantes());
        paisDTO.setSuperficie(entity.getSuperficie());
        paisDTO.setContinenteId(entity.getContinenteId());

        return paisDTO;
    }
}
