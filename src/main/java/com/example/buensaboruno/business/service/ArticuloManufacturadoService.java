package com.example.buensaboruno.business.service;

import com.example.buensaboruno.business.service.Base.BaseService;
import com.example.buensaboruno.domain.entities.ArticuloManufacturado;

import java.util.List;

public interface ArticuloManufacturadoService extends BaseService<ArticuloManufacturado, Long> {
    List<ArticuloManufacturado> obtenerArticulosPorDenominacion(String denominacion);
    ArticuloManufacturado obtenerArticulosPorCodigo(String codigo);
}
