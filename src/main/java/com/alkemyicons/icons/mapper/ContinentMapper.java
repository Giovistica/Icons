package com.alkemyicons.icons.mapper;

import com.alkemyicons.icons.DTO.ContinentDTO;
import com.alkemyicons.icons.entity.ContinentEntity;

import org.springframework.stereotype.Component;

@Component
public class ContinentMapper {

    public ContinentEntity continentDTOToEntity(ContinentDTO dto){

        ContinentEntity continentEntity = new ContinentEntity();
        continentEntity.setImagen(dto.getImagen());
        continentEntity.setDenominacion(dto.getDenominacion());
        return continentEntity;
    }

   public ContinentDTO continentEntityTODTO(ContinentEntity entity){

        ContinentDTO continentDTO = new ContinentDTO();
        continentDTO.setId(entity.getId());
        continentDTO.setImagen(entity.getImagen());
        continentDTO.setDenominacion(entity.getDenominacion());
        return continentDTO;
    }

}
