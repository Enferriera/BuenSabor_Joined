package com.example.buensaboruno.business.mapper;


import com.example.buensaboruno.domain.dto.SucursalDto;
import com.example.buensaboruno.domain.entities.Sucursal;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = DomicilioMapper.class )
public interface SucursalMapper extends BaseMapper<Sucursal, SucursalDto>{

    SucursalDto toDTO(Sucursal source);

    Sucursal toEntity(SucursalDto source);

}
