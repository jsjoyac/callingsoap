package com.co.callingserviceSoap.business;

import com.co.callingserviceSoap.dto.SMLVDTO;
import com.co.callingserviceSoap.dto.SMLVResponseDTO;

public interface ISMLV {

	public SMLVResponseDTO doSMLV(SMLVDTO dto);
	
}
