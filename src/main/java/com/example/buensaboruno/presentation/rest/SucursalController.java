package com.example.buensaboruno.presentation.rest;




import com.example.buensaboruno.business.service.Imp.SucursalServiceImpl;
import com.example.buensaboruno.domain.entities.Sucursal;
import com.example.buensaboruno.presentation.rest.Base.BaseController;
import com.example.buensaboruno.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/sucursal")
@CrossOrigin(origins="*")
public class SucursalController extends BaseControllerImp<Sucursal, SucursalServiceImpl> {
    public SucursalController(SucursalServiceImpl servicio) {
        super(servicio);
    }
}
