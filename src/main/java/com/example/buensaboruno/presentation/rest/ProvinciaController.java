package com.example.buensaboruno.presentation.rest;


import com.example.buensaboruno.business.service.Imp.ProvinciaServiceImp;
import com.example.buensaboruno.business.service.ProvinciaService;
import com.example.buensaboruno.domain.entities.Provincia;
import com.example.buensaboruno.presentation.rest.Base.BaseController;
import com.example.buensaboruno.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/provincia")
@CrossOrigin("*")
public class ProvinciaController extends BaseControllerImp<Provincia, ProvinciaServiceImp> {
    public ProvinciaController(ProvinciaServiceImp servicio) {
        super(servicio);
    }
}
