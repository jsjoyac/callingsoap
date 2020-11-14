package com.co.callingserviceSoap.business;

import com.co.callingserviceSoap.dto.FonedeDTO;
import com.co.callingserviceSoap.dto.FonedeResponseDTO;

public interface IFonede {

	public FonedeResponseDTO doFonede(FonedeDTO dto);
	
}
