package com.example.buensaboruno.business.facade;



import com.example.buensaboruno.business.facade.Base.BaseFacade;
import com.example.buensaboruno.domain.dto.LocalidadDto;

import java.util.List;

public interface LocalidadFacade extends BaseFacade<LocalidadDto, Long> {

    List<LocalidadDto> findByProvinciaId(Long id);
}
