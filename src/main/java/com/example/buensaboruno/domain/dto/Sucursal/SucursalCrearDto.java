package com.example.buensaboruno.domain.dto.Sucursal;

import com.example.buensaboruno.domain.dto.Domicilio.DomicilioDto;
import com.example.buensaboruno.domain.entities.Domicilio;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.OneToOne;

import java.time.LocalTime;

public class SucursalCrearDto {
    private String nombre;

    private LocalTime horarioApertura;

    private LocalTime horarioCierre;
    private boolean esCasaMatriz;


    private DomicilioDto domicilio;
}
