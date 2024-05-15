package com.example.buensaboruno.presentation.rest;

import com.example.buensaboruno.business.service.Imp.ArticuloInsumoServiceImpl;
import com.example.buensaboruno.domain.entities.ArticuloInsumo;
import com.example.buensaboruno.presentation.rest.Base.BaseControllerImp;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path = "articulos/insumos")
public class ArticuloInsumoController extends BaseControllerImp<ArticuloInsumo, ArticuloInsumoServiceImpl> {

    public ArticuloInsumoController(ArticuloInsumoServiceImpl servicio) {
        super(servicio);
    }
}
