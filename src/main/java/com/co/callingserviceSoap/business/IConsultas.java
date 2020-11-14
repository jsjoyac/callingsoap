package com.co.callingserviceSoap.business;

import com.co.callingserviceSoap.dto.ConsultasDTO;
import com.co.callingserviceSoap.dto.ConsultasResponseDTO;

public interface IConsultas {

	public ConsultasResponseDTO doConsultas(
			ConsultasDTO dto);
	
}
