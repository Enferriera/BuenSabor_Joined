package com.example.buensaboruno.presentation.rest;


import com.example.buensaboruno.business.facade.Imp.DomicilioFacadeImp;
import com.example.buensaboruno.domain.dto.DomicilioDto;
import com.example.buensaboruno.domain.entities.Domicilio;
import com.example.buensaboruno.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domicilio")
@CrossOrigin("*")
public class DomicilioController extends BaseControllerImp<Domicilio, DomicilioDto,Long, DomicilioFacadeImp> {
    public DomicilioController(DomicilioFacadeImp facade) {
        super(facade);
    }
}
