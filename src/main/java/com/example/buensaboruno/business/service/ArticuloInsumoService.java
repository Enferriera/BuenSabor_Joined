package com.example.buensaboruno.business.service;

import com.example.buensaboruno.business.service.Base.BaseService;
import com.example.buensaboruno.domain.entities.ArticuloInsumo;
import com.example.buensaboruno.domain.entities.ArticuloManufacturado;

import java.util.List;

public interface ArticuloInsumoService extends BaseService<ArticuloInsumo, Long> {
    List<ArticuloInsumo> obtenerArticulosPorDenominacion(String denominacion);
    ArticuloInsumo obtenerArticulosPorCodigo(String codigo);
}
