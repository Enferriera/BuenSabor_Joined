package com.example.buensaboruno.presentation.rest;



import com.example.buensaboruno.business.service.Imp.DomicilioServiceImp;
import com.example.buensaboruno.domain.entities.Domicilio;
import com.example.buensaboruno.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domicilio")
@CrossOrigin(origins="*")
public class DomicilioController extends BaseControllerImp<Domicilio, DomicilioServiceImp> {

    public DomicilioController(DomicilioServiceImp servicio) {
        super(servicio);
    }
}
