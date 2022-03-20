package com.alkemyicons.icons.controller;

import com.alkemyicons.icons.DTO.ContinentDTO;
import com.alkemyicons.icons.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("continentes")
public class ContinentController {

    @Autowired
    ContinentService continentService;

    @PostMapping
    public ResponseEntity<ContinentDTO> save(@RequestBody ContinentDTO continente){
        ContinentDTO continenteGuardado = continentService.save(continente);
        return ResponseEntity.status(HttpStatus.CREATED).body(continenteGuardado);
    }
}
