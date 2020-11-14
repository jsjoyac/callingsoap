package com.co.callingserviceSoap.business;

import com.co.callingserviceSoap.dto.AfiliadoDTO;
import com.co.callingserviceSoap.dto.AfiliadoResponseDTO;

public interface IAfiliado {

	public AfiliadoResponseDTO doAfiliado(AfiliadoDTO dto);
	
}
