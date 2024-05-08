package com.example.buensaboruno.repositories;

import com.example.buensaboruno.domain.entities.Promocion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PromocionRepository extends BaseRepository<Promocion,Long>{
    @Query("SELECT p FROM Promocion p LEFT JOIN FETCH p.sucursales WHERE p.id = :id")
    Promocion findAllWithSucursales(@Param("id") Long id);

    @Query("SELECT p FROM Promocion p LEFT JOIN FETCH p.articulos WHERE p.id = :id")
    Promocion findAllWithArticulos(@Param("id") Long id);

}
