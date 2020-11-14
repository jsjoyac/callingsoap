package com.co.callingserviceSoap.business;

import com.co.callingserviceSoap.dto.MultiAfiliadoDTO;
import com.co.callingserviceSoap.dto.MultiAfiliadoResponseDTO;

public interface IMultiAfiliado {

	public MultiAfiliadoResponseDTO doMultiAfiliado(MultiAfiliadoDTO dto);
	
}
