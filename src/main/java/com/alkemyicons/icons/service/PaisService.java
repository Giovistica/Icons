package com.alkemyicons.icons.service;

import com.alkemyicons.icons.DTO.PaisDTO;

import java.util.List;

public interface PaisService {

    PaisDTO save(PaisDTO dto);
    List<PaisDTO> getAllPaises();

}
