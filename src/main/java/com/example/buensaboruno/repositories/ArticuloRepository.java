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
@Repository
public interface ArticuloRepository  extends BaseRepository<Articulo, Long> {

}
