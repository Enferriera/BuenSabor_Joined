package com.example.buensaboruno.repositories;

import com.example.buensaboruno.domain.entities.Categoria;
import com.example.buensaboruno.domain.entities.Promocion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria,Long>{
    @Query("SELECT p FROM Categoria p LEFT JOIN FETCH p.sucursales WHERE p.id = :id")
    Categoria findAllWithSucursales(@Param("id") Long id);
}
