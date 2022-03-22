package com.alkemyicons.icons.controller;


import com.alkemyicons.icons.DTO.PaisDTO;
import com.alkemyicons.icons.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("paises")
public class PaisController {

    @Autowired
    PaisService paisService;

    @GetMapping
    public ResponseEntity<List<PaisDTO>> getAll(){
        List<PaisDTO> paises = paisService.getAllPaises();
        return ResponseEntity.ok().body(paises);
    }
    @PostMapping
    public ResponseEntity<PaisDTO> save(@RequestBody PaisDTO pais){
        PaisDTO paisGuardado = paisService.save(pais);
        return ResponseEntity.status(HttpStatus.CREATED).body(paisGuardado);
    }
}
