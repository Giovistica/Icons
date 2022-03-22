package com.alkemyicons.icons.controller;

import com.alkemyicons.icons.DTO.IconDTO;
import com.alkemyicons.icons.DTO.PaisDTO;
import com.alkemyicons.icons.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("icons")
public class IconController {

    @Autowired
    IconService iconService;

    @PostMapping
    public ResponseEntity<IconDTO> save(@RequestBody IconDTO icon){
        IconDTO iconGuardado = iconService.save(icon);
        return ResponseEntity.status(HttpStatus.CREATED).body(iconGuardado);
    }
    @GetMapping
    public ResponseEntity<List<IconDTO>> getAll(){
        List<IconDTO> icons = iconService.getAllIcons();
        return ResponseEntity.ok().body(icons);
    }
}
