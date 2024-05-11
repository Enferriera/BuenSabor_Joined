package com.example.buensaboruno.business.mapper;


import com.example.buensaboruno.domain.dto.ProvinciaDto;
import com.example.buensaboruno.domain.entities.Provincia;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProvinciaMapper extends BaseMapper<Provincia, ProvinciaDto>{
    ProvinciaDto toDTO(Provincia source);
    public Provincia toEntity(ProvinciaDto source);
    List<ProvinciaDto> toDTOsList(List<Provincia> source);
}
