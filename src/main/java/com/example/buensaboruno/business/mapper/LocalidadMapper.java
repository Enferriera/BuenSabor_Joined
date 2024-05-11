package com.example.buensaboruno.business.mapper;


import com.example.buensaboruno.domain.dto.LocalidadDto;
import com.example.buensaboruno.domain.entities.Localidad;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LocalidadMapper extends BaseMapper<Localidad, LocalidadDto>{

    LocalidadDto toDTO(Localidad source);
    public Localidad toEntity(LocalidadDto source);
    List<LocalidadDto> toDTOsList(List<Localidad> source);
}
