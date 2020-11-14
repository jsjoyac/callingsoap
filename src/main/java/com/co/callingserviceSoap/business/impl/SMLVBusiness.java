package com.co.callingserviceSoap.business.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.co.callingserviceSoap.CallingservicesSoapImpls;
import com.co.callingserviceSoap.adapter.AdapterSMLV;
import com.co.callingserviceSoap.business.ISMLV;
import com.co.callingserviceSoap.dto.SMLVDTO;
import com.co.callingserviceSoap.dto.SMLVResponseDTO;
import wcompensar.caf.SMLV;
import wcompensar.caf.SMLVResponse;

@Service
public class SMLVBusiness implements ISMLV {

	@Value("${WSDL.SOAPClient}")
	private String clientEndPoint;
	
	@Override
	public SMLVResponseDTO doSMLV(SMLVDTO dto) {
		// 
		SMLVResponseDTO rta = new SMLVResponseDTO();
		AdapterSMLV adap = new AdapterSMLV();
		SMLV request = null;
		SMLVResponse response = null;
		try {
			request =  adap.dtoToEntity(dto);
		
			System.out.println("clientEndpoint: "+clientEndPoint);
		
			CallingservicesSoapImpls call = new CallingservicesSoapImpls();
			response = call.doSMLV(request, clientEndPoint);  
			rta.setTable(response.getSMLVResult());
			
		}catch(Exception e) {
			e.getMessage();
		}
		
		return rta;
	}

	
}
