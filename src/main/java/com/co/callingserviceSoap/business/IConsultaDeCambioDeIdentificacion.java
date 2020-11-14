package com.co.callingserviceSoap.business;

import com.co.callingserviceSoap.dto.ConsultaDeCambioDeIdentificacionDTO;
import com.co.callingserviceSoap.dto.ConsultaDeCambioDeIdentificacionResponseDTO;

public interface IConsultaDeCambioDeIdentificacion {

	public ConsultaDeCambioDeIdentificacionResponseDTO doConsultaDeCambioDeIdentificacion(
			ConsultaDeCambioDeIdentificacionDTO dto);
	
}
