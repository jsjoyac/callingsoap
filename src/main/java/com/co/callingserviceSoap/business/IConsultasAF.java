package com.co.callingserviceSoap.business;

import com.co.callingserviceSoap.dto.ConsultasAFDTO;
import com.co.callingserviceSoap.dto.ConsultasAFResponseDTO;

public interface IConsultasAF {

	public ConsultasAFResponseDTO doConsultasAF(
			ConsultasAFDTO dto);
	
}
