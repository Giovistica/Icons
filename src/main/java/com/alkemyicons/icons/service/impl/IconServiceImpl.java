package com.alkemyicons.icons.service.impl;

import com.alkemyicons.icons.DTO.IconDTO;
import com.alkemyicons.icons.entity.IconEntity;
import com.alkemyicons.icons.mapper.IconMapper;
import com.alkemyicons.icons.repository.IconRepository;
import com.alkemyicons.icons.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IconServiceImpl implements IconService {

    @Autowired
    IconMapper iconMapper;
    @Autowired
    IconRepository iconRepository;

    public IconDTO save(IconDTO dto) {

        IconEntity entity = iconMapper.iconDTOToEntity(dto);
        IconEntity entitySaved = iconRepository.save(entity);
        IconDTO result = iconMapper.iconEntityToDTO(entitySaved);
        return result;
    }


    public List<IconDTO> getAllIcons() {
        List<IconEntity> entities = iconRepository.findAll();
        List<IconDTO>result = iconMapper.iconEntityToDTOList(entities);
        return result;
    }
}
