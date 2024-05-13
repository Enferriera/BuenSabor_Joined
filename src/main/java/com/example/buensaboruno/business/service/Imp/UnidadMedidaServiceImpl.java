package com.example.buensaboruno.business.service.Imp;

import com.example.buensaboruno.business.service.Base.BaseServiceImp;
import com.example.buensaboruno.business.service.UnidadMedidaService;
import com.example.buensaboruno.domain.entities.UnidadMedida;
import com.example.buensaboruno.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaServiceImpl extends BaseServiceImp<UnidadMedida, Long> implements UnidadMedidaService {
    public UnidadMedidaServiceImpl(BaseRepository<UnidadMedida, Long> baseRepository) {
        super(baseRepository);
    }
}
