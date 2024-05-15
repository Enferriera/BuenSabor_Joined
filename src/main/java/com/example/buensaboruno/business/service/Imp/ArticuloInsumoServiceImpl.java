package com.example.buensaboruno.business.service.Imp;

import com.example.buensaboruno.business.service.ArticuloInsumoService;
import com.example.buensaboruno.business.service.Base.BaseServiceImp;
import com.example.buensaboruno.domain.entities.ArticuloInsumo;
import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import com.example.buensaboruno.repositories.ArticuloInsumoRepository;
import com.example.buensaboruno.repositories.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloInsumoServiceImpl extends BaseServiceImp<ArticuloInsumo, Long> implements ArticuloInsumoService {
@Autowired
private ArticuloInsumoRepository articuloInsumoRepository;


    @Override
    @Transactional
    public List<ArticuloInsumo> obtenerArticulosPorDenominacion(String denominacion) {
        return articuloInsumoRepository.findByDenominacionContaining(denominacion);
    }

    @Override
    @Transactional
    public ArticuloInsumo obtenerArticulosPorCodigo(String codigo) {
        return articuloInsumoRepository.findByCodigoContaining(codigo);
    }

}
