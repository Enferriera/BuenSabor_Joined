package com.example.buensaboruno.repositories;

import com.example.buensaboruno.domain.entities.Articulo;
import com.example.buensaboruno.domain.entities.Base;
import com.example.buensaboruno.domain.entities.Promocion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface ArticuloRepository  extends BaseRepository<Articulo, Long> {
    @Query("SELECT a FROM Articulo a WHERE LOWER(a.denominacion) LIKE LOWER(CONCAT('%', :denominacion, '%'))")
    List<Articulo> findByDenominacionContaining(@Param("denominacion") String denominacion);

}
