package com.example.buensaboruno.business.service.Imp;

import com.example.buensaboruno.business.service.ArticuloManufacturadoService;
import com.example.buensaboruno.business.service.Base.BaseServiceImp;
import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import com.example.buensaboruno.domain.entities.ArticuloManufacturadoDetalle;
import com.example.buensaboruno.domain.entities.ImagenArticulo;
import com.example.buensaboruno.repositories.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ArticuloManufacturadoServiceImpl extends BaseServiceImp<ArticuloManufacturado, Long> implements ArticuloManufacturadoService {
    @Autowired
    private ArticuloManufacturadoRepository articuloManufacturadoRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ImagenArticuloRepository imagenArticuloRepository;

    @Autowired
    private ArticuloRepository articuloRepository;
    @Autowired
    private ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository;

    @Override
    @Transactional
    public void deleteById(Long id) {
        var manufacturadoBorrar=articuloManufacturadoRepository.findById(id);
        if(manufacturadoBorrar.isEmpty()){
            throw new RuntimeException("Articulo Manufacturado no encontrado");
        }
        Set<ArticuloManufacturadoDetalle>  detallesBorrar=manufacturadoBorrar.get().getArticuloManufacturadoDetalles();
        for (ArticuloManufacturadoDetalle elemento : detallesBorrar) {
            articuloManufacturadoDetalleRepository.delete(elemento);
        }
        Set<ImagenArticulo> imagenesBorrar=manufacturadoBorrar.get().getImagenes();
        for (ImagenArticulo elemento : imagenesBorrar) {
            imagenArticuloRepository.delete(elemento);
        }
        articuloManufacturadoRepository.delete(manufacturadoBorrar.get());
    }

    @Override
    @Transactional
    public List<ArticuloManufacturado> obtenerArticulosPorDenominacion(String denominacion) {
        return articuloManufacturadoRepository.findByDenominacionContaining(denominacion);
    }

    @Override
    @Transactional
    public ArticuloManufacturado obtenerArticulosPorCodigo(String codigo) {
        return articuloManufacturadoRepository.findByCodigoContaining(codigo);
    }


}
