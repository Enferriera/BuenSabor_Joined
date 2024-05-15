package com.example.buensaboruno.repositories;

import com.example.buensaboruno.domain.entities.ArticuloInsumo;
import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloInsumoRepository extends BaseRepository<ArticuloInsumo,Long> {
    @Query("SELECT a FROM Articulo a WHERE LOWER(a.denominacion) LIKE LOWER(CONCAT('%', :denominacion, '%'))")
    List<ArticuloInsumo> findByDenominacionContaining(@Param("denominacion") String denominacion);

    @Query("SELECT a FROM Articulo a WHERE   a.codigo =:codigo ")
    ArticuloInsumo findByCodigoContaining(@Param("codigo") String codigo);

}
