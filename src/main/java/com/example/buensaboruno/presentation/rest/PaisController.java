package com.example.buensaboruno.presentation.rest;




import com.example.buensaboruno.business.service.Imp.PaisServiceImp;
import com.example.buensaboruno.domain.entities.Pais;
import com.example.buensaboruno.presentation.rest.Base.BaseController;
import com.example.buensaboruno.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/pais")
@CrossOrigin(origins="*")
public class PaisController extends BaseControllerImp<Pais, PaisServiceImp> {
    public PaisController(PaisServiceImp servicio) {
        super(servicio);
    }
}
