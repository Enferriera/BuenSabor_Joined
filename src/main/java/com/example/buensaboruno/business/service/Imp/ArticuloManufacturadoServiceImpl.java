package com.example.buensaboruno.business.service.Imp;

import com.example.buensaboruno.business.service.ArticuloManufacturadoService;
import com.example.buensaboruno.business.service.Base.BaseServiceImp;
import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import com.example.buensaboruno.domain.entities.ArticuloManufacturadoDetalle;
import com.example.buensaboruno.repositories.ArticuloManufacturadoDetalleRepository;
import com.example.buensaboruno.repositories.ArticuloManufacturadoRepository;
import com.example.buensaboruno.repositories.ArticuloRepository;
import com.example.buensaboruno.repositories.CategoriaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ArticuloManufacturadoServiceImpl extends BaseServiceImp<ArticuloManufacturado, Long> implements ArticuloManufacturadoService {
    @Autowired
    private ArticuloManufacturadoRepository articuloManufacturadoRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ArticuloManufacturadoDetalleRepository articuloRepository;
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
        articuloManufacturadoRepository.delete(manufacturadoBorrar.get());
    }


}
