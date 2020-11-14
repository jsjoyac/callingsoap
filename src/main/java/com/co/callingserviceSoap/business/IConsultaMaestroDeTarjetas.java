package com.co.callingserviceSoap.business;

import com.co.callingserviceSoap.dto.ConsultaMaestroDeTarjetasDTO;
import com.co.callingserviceSoap.dto.ConsultaMaestroDeTarjetasResponseDTO;

public interface IConsultaMaestroDeTarjetas {

	public ConsultaMaestroDeTarjetasResponseDTO doConsultaMaestroDeTarjetas(ConsultaMaestroDeTarjetasDTO dto);
	
}
