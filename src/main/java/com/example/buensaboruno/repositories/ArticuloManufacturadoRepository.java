package com.example.buensaboruno.repositories;

import com.example.buensaboruno.domain.entities.Articulo;
import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import com.example.buensaboruno.domain.entities.Base;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloManufacturadoRepository extends BaseRepository<ArticuloManufacturado,Long> {
    @Query("SELECT a FROM Articulo a WHERE LOWER(a.denominacion) LIKE LOWER(CONCAT('%', :denominacion, '%'))")
    List<ArticuloManufacturado> findByDenominacionContaining(@Param("denominacion") String denominacion);

    @Query("SELECT a FROM Articulo a WHERE   a.codigo =:codigo ")
    ArticuloManufacturado findByCodigoContaining(@Param("codigo") String codigo);

}
