package com.example.buensaboruno.business.service.Imp;

import com.example.buensaboruno.business.service.ArticuloManufacturadoService;
import com.example.buensaboruno.business.service.Base.BaseServiceImp;
import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import com.example.buensaboruno.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoServiceImpl extends BaseServiceImp<ArticuloManufacturado, Long> implements ArticuloManufacturadoService {
    public ArticuloManufacturadoServiceImpl(BaseRepository<ArticuloManufacturado, Long> baseRepository) {
        super(baseRepository);
    }
}
