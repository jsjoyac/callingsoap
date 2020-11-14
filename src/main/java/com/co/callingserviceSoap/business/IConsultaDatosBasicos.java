package com.co.callingserviceSoap.business;

import com.co.callingserviceSoap.dto.ConsultaDatosBasicosDTO;
import com.co.callingserviceSoap.dto.ConsultaDatosBasicosResponseDTO;

public interface IConsultaDatosBasicos {

	public ConsultaDatosBasicosResponseDTO doConsultaDatosBasicos(
			ConsultaDatosBasicosDTO dto);
	
}
