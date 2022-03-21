package com.alkemyicons.icons.controller;

import com.alkemyicons.icons.DTO.ContinentDTO;
import com.alkemyicons.icons.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("continentes")
public class ContinentController {

    @Autowired
    ContinentService continentService;

    @GetMapping
    public ResponseEntity<List<ContinentDTO>> getAll(){
        List<ContinentDTO> continentes = continentService.getAllContinentes();
        return ResponseEntity.ok().body(continentes);
    }
    @PostMapping
    public ResponseEntity<ContinentDTO> save(@RequestBody ContinentDTO continente){
        ContinentDTO continenteGuardado = continentService.save(continente);
        return ResponseEntity.status(HttpStatus.CREATED).body(continenteGuardado);
    }
}
