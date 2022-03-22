package com.alkemyicons.icons.service;

import com.alkemyicons.icons.DTO.IconDTO;

import java.util.List;

public interface IconService {

    IconDTO save(IconDTO icon);
    List<IconDTO> getAllIcons();
}
