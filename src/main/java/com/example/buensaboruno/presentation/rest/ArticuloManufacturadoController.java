package com.example.buensaboruno.presentation.rest;

import com.example.buensaboruno.business.service.Imp.ArticuloManufacturadoServiceImpl;
import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import com.example.buensaboruno.presentation.rest.Base.BaseControllerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("articulos/manufacturados")
public class ArticuloManufacturadoController extends BaseControllerImp<ArticuloManufacturado, ArticuloManufacturadoServiceImpl> {

    @Autowired
    private ArticuloManufacturadoServiceImpl servicio;
    public ArticuloManufacturadoController(ArticuloManufacturadoServiceImpl servicio) {
        super(servicio);
    }

    @GetMapping("/buscar/denominacion")
    public ResponseEntity<List<ArticuloManufacturado>> buscarDenominacion(@RequestParam String denominacion) {
        return  ResponseEntity.ok().body(servicio.obtenerArticulosPorDenominacion(denominacion));
    }

    @GetMapping("/buscar/codigo")
    public ResponseEntity<ArticuloManufacturado> buscarCodigo(@RequestParam String codigo) {
        return  ResponseEntity.ok().body(servicio.obtenerArticulosPorCodigo(codigo));
    }

}
