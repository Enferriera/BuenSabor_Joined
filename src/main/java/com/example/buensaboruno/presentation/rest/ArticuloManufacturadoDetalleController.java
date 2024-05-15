package com.example.buensaboruno.presentation.rest;

import com.example.buensaboruno.business.service.Imp.ArticuloManufacturadoDetalleServiceImpl;
import com.example.buensaboruno.business.service.Imp.ArticuloManufacturadoServiceImpl;
import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import com.example.buensaboruno.domain.entities.ArticuloManufacturadoDetalle;
import com.example.buensaboruno.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("articulos/detalles")
public class ArticuloManufacturadoDetalleController extends BaseControllerImp<ArticuloManufacturadoDetalle, ArticuloManufacturadoDetalleServiceImpl> {
    public ArticuloManufacturadoDetalleController(ArticuloManufacturadoDetalleServiceImpl servicio) {
        super(servicio);
    }
}
