package com.co.callingserviceSoap.business;

import com.co.callingserviceSoap.dto.CiudadDTO;
import com.co.callingserviceSoap.dto.CiudadResponseDTO;

public interface ICiudad {

	public CiudadResponseDTO doCiudades(CiudadDTO dto);
	
}
