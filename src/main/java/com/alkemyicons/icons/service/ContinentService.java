package com.alkemyicons.icons.service;

import com.alkemyicons.icons.DTO.ContinentDTO;


import java.util.List;

public interface ContinentService {

 ContinentDTO save(ContinentDTO dto);
 List<ContinentDTO> getAllContinentes();

}
