package com.example.buensaboruno.presentation.rest;


import com.example.buensaboruno.business.facade.Imp.EmpresaFacadeImpl;
import com.example.buensaboruno.domain.dto.EmpresaDto;
import com.example.buensaboruno.domain.dto.EmpresaLargeDto;
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
public class EmpresaController extends BaseControllerImp<Empresa, EmpresaDto, Long, EmpresaFacadeImpl> {
    public EmpresaController(EmpresaFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/addSucursal/{idEmpresa}/{idSucursal}")
    public ResponseEntity<EmpresaLargeDto> addSucursal(Long idEmpresa, Long idSucursal){
        return ResponseEntity.ok(facade.addSucursal(idEmpresa,idSucursal));
    }
}
