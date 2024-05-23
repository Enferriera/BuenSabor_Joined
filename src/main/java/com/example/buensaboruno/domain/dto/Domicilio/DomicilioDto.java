package com.example.buensaboruno.domain.dto.Domicilio;

import com.example.buensaboruno.domain.dto.Localidad.LocalidadDto;
import com.example.buensaboruno.domain.entities.Localidad;
import jakarta.persistence.ManyToOne;
import org.hibernate.envers.NotAudited;

public class DomicilioDto {
    private String calle;
    private Integer numero;
    private Integer cp;
    private Integer piso;
    private Integer nroDpto;


    private LocalidadDto localidad;
}
