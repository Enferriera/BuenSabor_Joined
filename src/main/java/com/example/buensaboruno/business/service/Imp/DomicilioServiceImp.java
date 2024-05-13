package com.example.buensaboruno.business.service.Imp;


import com.example.buensaboruno.business.service.Base.BaseServiceImp;
import com.example.buensaboruno.business.service.DomicilioService;
import com.example.buensaboruno.domain.entities.Domicilio;
import com.example.buensaboruno.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImp extends BaseServiceImp<Domicilio,Long> implements DomicilioService {
    public DomicilioServiceImp(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}
