package com.example.buensaboruno.presentation.rest;


import com.example.buensaboruno.business.facade.Imp.PaisFacadeImp;
import com.example.buensaboruno.domain.dto.PaisDto;
import com.example.buensaboruno.domain.entities.Pais;
import com.example.buensaboruno.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pais")
@CrossOrigin("*")
public class PaisController extends BaseControllerImp<Pais, PaisDto,Long, PaisFacadeImp> {

    public PaisController(PaisFacadeImp facade) {
        super(facade);
    }
}
