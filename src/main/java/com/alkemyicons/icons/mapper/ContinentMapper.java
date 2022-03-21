package com.alkemyicons.icons.mapper;

import com.alkemyicons.icons.DTO.ContinentDTO;
import com.alkemyicons.icons.entity.ContinentEntity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContinentMapper {

    public ContinentEntity continentDTOToEntity(ContinentDTO dto){

        ContinentEntity continentEntity = new ContinentEntity();
        continentEntity.setImagen(dto.getImagen());
        continentEntity.setDenominacion(dto.getDenominacion());
        return continentEntity;
    }

   public ContinentDTO continentEntityToDTO(ContinentEntity entity){

        ContinentDTO continentDTO = new ContinentDTO();
        continentDTO.setId(entity.getId());
        continentDTO.setImagen(entity.getImagen());
        continentDTO.setDenominacion(entity.getDenominacion());
        return continentDTO;
    }

    public List<ContinentDTO> continentEntityToDTOList(List<ContinentEntity> entities) {
        List <ContinentDTO> dtos = new ArrayList<>();
        for(ContinentEntity entity : entities){
            dtos.add(this.continentEntityToDTO(entity));
        }
        return dtos;
    }
}
