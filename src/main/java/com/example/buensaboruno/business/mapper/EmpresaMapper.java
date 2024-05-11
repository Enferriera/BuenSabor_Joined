package com.example.buensaboruno.business.mapper;



import com.example.buensaboruno.domain.dto.EmpresaDto;
import com.example.buensaboruno.domain.dto.EmpresaLargeDto;
import com.example.buensaboruno.domain.entities.Empresa;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmpresaMapper extends BaseMapper<Empresa, EmpresaDto> {
    EmpresaDto toDTO(Empresa source);

    EmpresaLargeDto toLargeDto(Empresa empresa);

    Empresa toEntity(EmpresaDto source);

    List<EmpresaDto> toDTOsList(List<Empresa> source);
}
