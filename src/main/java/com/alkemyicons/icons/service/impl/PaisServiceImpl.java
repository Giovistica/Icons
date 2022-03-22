package com.alkemyicons.icons.service.impl;

import com.alkemyicons.icons.DTO.ContinentDTO;
import com.alkemyicons.icons.DTO.PaisDTO;
import com.alkemyicons.icons.entity.ContinentEntity;
import com.alkemyicons.icons.entity.PaisEntity;
import com.alkemyicons.icons.mapper.ContinentMapper;
import com.alkemyicons.icons.mapper.PaisMapper;
import com.alkemyicons.icons.repository.ContinentRepository;
import com.alkemyicons.icons.repository.PaisRepository;
import com.alkemyicons.icons.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServiceImpl implements PaisService {
    @Autowired
    private PaisMapper paisMapper;

    @Autowired
    private PaisRepository paisRepository;

    public List<PaisDTO> getAllPaises(){
        List<PaisEntity> entities = paisRepository.findAll();
        List<PaisDTO>result = paisMapper.paisEntityToDTOList(entities);
        return result;
    }
    public PaisDTO save(PaisDTO dto){

        //lo convierto a entity
        PaisEntity entity = paisMapper.paisDTOToEntity(dto);
        //la guardo
        PaisEntity entitySaved = paisRepository.save(entity);
        //        //la entidad guardada la convierto en dto
        PaisDTO result = paisMapper.paisEntityToDTO(entitySaved);

        return result;
    }
}
