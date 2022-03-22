package com.alkemyicons.icons.mapper;

import com.alkemyicons.icons.DTO.IconDTO;
import com.alkemyicons.icons.DTO.PaisDTO;
import com.alkemyicons.icons.entity.IconEntity;
import com.alkemyicons.icons.entity.PaisEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IconMapper {

    public List<IconDTO> iconEntityToDTOList(List<IconEntity> entities) {

        List <IconDTO> dtos = new ArrayList<>();
        for(IconEntity entity : entities){
            dtos.add(this.iconEntityToDTO(entity));
        }
        return dtos;

    }

    public IconDTO iconEntityToDTO(IconEntity entity) {

        IconDTO iconDTO = new IconDTO();
        iconDTO.setId(entity.getId());
        iconDTO.setImagen(entity.getImagen());
        iconDTO.setDenominacion(entity.getDenominacion());
        iconDTO.setFechaCreacion(entity.getFechaCreacion());
        iconDTO.setAltura(entity.getAltura());
        iconDTO.setHistoria(entity.getHistoria());
        iconDTO.setDeleted(entity.getDeleted());

        return iconDTO;
    }

    public IconEntity iconDTOToEntity(IconDTO dto) {

        IconEntity iconEntity = new IconEntity();
        iconEntity.setImagen(dto.getImagen());
        iconEntity.setDenominacion(dto.getDenominacion());
        iconEntity.setFechaCreacion(dto.getFechaCreacion());
        iconEntity.setAltura(dto.getAltura());
        iconEntity.setHistoria(dto.getHistoria());
        iconEntity.setDeleted(dto.getDeleted());

        return iconEntity;
    }
}
