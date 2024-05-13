package com.example.buensaboruno.presentation.rest.Base;



import com.example.buensaboruno.business.service.Base.BaseServiceImp;
import com.example.buensaboruno.domain.entities.Base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@Controller
public abstract class BaseControllerImp <E extends Base, S extends BaseServiceImp<E, Long>> implements BaseController<E, Long> {

    protected S servicio;

    public BaseControllerImp(S servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){

        return ResponseEntity.ok(servicio.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<?>> getAll() {

        return ResponseEntity.ok(servicio.getAll());
    }

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody E entity){

        return ResponseEntity.ok(servicio.create(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> edit(@RequestBody E entity, @PathVariable Long id){
        return ResponseEntity.ok(servicio.update(entity, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){

        servicio.deleteById(id);
        return ResponseEntity.ok(null);
    }
}
