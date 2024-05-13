package com.example.buensaboruno.business.service.Imp;


import com.example.buensaboruno.business.service.Base.BaseServiceImp;
import com.example.buensaboruno.business.service.PaisService;
import com.example.buensaboruno.domain.entities.Pais;
import com.example.buensaboruno.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class PaisServiceImp extends BaseServiceImp<Pais, Long> implements PaisService {
    public PaisServiceImp(BaseRepository<Pais, Long> baseRepository) {

        super(baseRepository);
    }
}
