package com.example.buensaboruno.presentation.rest;

import com.example.buensaboruno.business.service.Base.BaseService;
import com.example.buensaboruno.business.service.Imp.CategoriaServiceImpl;
import com.example.buensaboruno.domain.entities.Categoria;
import com.example.buensaboruno.presentation.rest.Base.BaseControllerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("categorias")
public class CategoriaController extends BaseControllerImp<Categoria, CategoriaServiceImpl> {
    public CategoriaController(CategoriaServiceImpl servicio) {
        super(servicio);
    }
}
