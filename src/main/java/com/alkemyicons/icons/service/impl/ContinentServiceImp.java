package com.alkemyicons.icons.service.impl;

import com.alkemyicons.icons.DTO.ContinentDTO;
import com.alkemyicons.icons.entity.ContinentEntity;
import com.alkemyicons.icons.mapper.ContinentMapper;
import com.alkemyicons.icons.repository.ContinentRepository;
import com.alkemyicons.icons.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContinentServiceImp implements ContinentService {

    @Autowired
    private ContinentMapper continentMapper;

    @Autowired
    private ContinentRepository continentRepository;

    public ContinentDTO save(ContinentDTO dto){

        //lo convierto a entity
        ContinentEntity entity = continentMapper.continentDTOToEntity(dto);
        //la guardo
        ContinentEntity entitySaved = continentRepository.save(entity);
        //        //la entidad guardada la convierto en dto
        ContinentDTO result = continentMapper.continentEntityTODTO(entitySaved);

        return result;
    }

}
