package com.example.buensaboruno.presentation.rest;

import com.example.buensaboruno.business.service.Imp.ArticuloInsumoServiceImpl;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("articulos/insumos")
public class ArticuloInsumoController {
    @Autowired
    private ArticuloInsumoServiceImpl insumoService;

    @GetMapping("")
    public ResponseEntity<List<?>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(insumoService.getAll());

    }
}
