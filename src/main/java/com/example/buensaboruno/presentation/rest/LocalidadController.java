package com.example.buensaboruno.presentation.rest;



import com.example.buensaboruno.business.service.Imp.LocalidadServiceImp;
import com.example.buensaboruno.business.service.LocalidadService;
import com.example.buensaboruno.domain.entities.Localidad;
import com.example.buensaboruno.presentation.rest.Base.BaseControllerImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localidad")
@CrossOrigin("*")
public class LocalidadController extends BaseControllerImp<Localidad, LocalidadServiceImp> {
    public LocalidadController(LocalidadServiceImp servicio) {
        super(servicio);
    }
}
