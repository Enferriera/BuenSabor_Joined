package com.example.buensaboruno.domain.dto.Sucursal;

import com.example.buensaboruno.domain.dto.Domicilio.DomicilioDto;
import com.example.buensaboruno.domain.dto.Empresa.EmpresaDto;

import java.time.LocalTime;

public class SucursalDto {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private boolean esCasaMatriz;
    private DomicilioDto domicilio;
    private EmpresaDto empresa;
}
