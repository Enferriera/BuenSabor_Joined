package com.example.buensaboruno.business.service.Imp;

import com.example.buensaboruno.business.service.ArticuloManufacturadoDetalleService;
import com.example.buensaboruno.business.service.Base.BaseServiceImp;
import com.example.buensaboruno.domain.entities.ArticuloManufacturadoDetalle;
import com.example.buensaboruno.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoDetalleServiceImpl extends BaseServiceImp<ArticuloManufacturadoDetalle, Long> implements ArticuloManufacturadoDetalleService {
    public ArticuloManufacturadoDetalleServiceImpl(BaseRepository<ArticuloManufacturadoDetalle, Long> baseRepository) {
        super(baseRepository);
    }
}
