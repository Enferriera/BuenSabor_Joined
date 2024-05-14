package com.example.buensaboruno.business.service.Imp;


import com.example.buensaboruno.business.service.Base.BaseServiceImp;
import com.example.buensaboruno.business.service.LocalidadService;
import com.example.buensaboruno.domain.entities.Localidad;
import com.example.buensaboruno.repositories.BaseRepository;
import com.example.buensaboruno.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImp extends BaseServiceImp<Localidad,Long> implements LocalidadService {


    @Autowired
    LocalidadRepository localidadRepository;

    @Override
    public List<Localidad> findByProvinciaId(Long id) {
        return localidadRepository.findByProvinciaId(id);
    }
}
