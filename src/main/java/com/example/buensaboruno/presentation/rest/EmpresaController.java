package com.example.buensaboruno.presentation.rest;



import com.example.buensaboruno.business.service.Imp.EmpresaServiceImpl;
import com.example.buensaboruno.domain.entities.Empresa;
import com.example.buensaboruno.presentation.rest.Base.BaseControllerImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
@CrossOrigin("*")
public class EmpresaController extends BaseControllerImp<Empresa, EmpresaServiceImpl> {

    public EmpresaController(EmpresaServiceImpl servicio) {
        super(servicio);
    }
}
