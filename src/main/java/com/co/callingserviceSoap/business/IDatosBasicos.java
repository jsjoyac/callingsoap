package com.co.callingserviceSoap.business;

import com.co.callingserviceSoap.dto.DatosBasicosDTO;
import com.co.callingserviceSoap.dto.DatosBasicosResponseDTO;

public interface IDatosBasicos {

	public DatosBasicosResponseDTO doDatosBasicos(DatosBasicosDTO dto);
	
}
