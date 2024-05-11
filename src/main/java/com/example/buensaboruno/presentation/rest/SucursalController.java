package com.example.buensaboruno.presentation.rest;



import com.example.buensaboruno.business.facade.Imp.SucursalFacadeImp;
import com.example.buensaboruno.domain.dto.SucursalDto;
import com.example.buensaboruno.domain.entities.Sucursal;
import com.example.buensaboruno.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sucursal")
@CrossOrigin("*")
public class SucursalController extends BaseControllerImp<Sucursal, SucursalDto,Long, SucursalFacadeImp> {
    public SucursalController(SucursalFacadeImp facade) {
        super(facade);
    }
}
