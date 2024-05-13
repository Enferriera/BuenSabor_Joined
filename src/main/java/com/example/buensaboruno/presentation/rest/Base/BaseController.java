package com.example.buensaboruno.presentation.rest.Base;



import com.example.buensaboruno.domain.entities.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.List;

public interface BaseController <D extends Base, ID extends Serializable> {
    ResponseEntity<?> getById(@PathVariable ID id);

    ResponseEntity<?> getAll();

    ResponseEntity<?> create(@RequestBody D entity);

    ResponseEntity<?> edit(@RequestBody D entity, @PathVariable ID id);

    ResponseEntity<?> deleteById(@PathVariable ID id);
}