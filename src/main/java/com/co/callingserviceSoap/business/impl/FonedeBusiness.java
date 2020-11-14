package com.co.callingserviceSoap.business.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.co.callingserviceSoap.CallingservicesSoapImpls;
import com.co.callingserviceSoap.adapter.AdapterFonede;
import com.co.callingserviceSoap.business.IFonede;
import com.co.callingserviceSoap.dto.FonedeDTO;
import com.co.callingserviceSoap.dto.FonedeResponseDTO;
import wcompensar.caf.Fonede;
import wcompensar.caf.FonedeResponse;

@Service
public class FonedeBusiness implements IFonede {

	@Value("${WSDL.SOAPClient}")
	private String clientEndPoint;

	@Override
	public FonedeResponseDTO doFonede(FonedeDTO dto) {
		// 
		FonedeResponseDTO rta = new FonedeResponseDTO();
		AdapterFonede adap = new AdapterFonede();
		Fonede request = null;
		FonedeResponse response = null;
		try {
			request =  adap.dtoToEntity(dto);
		
			System.out.println("clientEndpoint: "+clientEndPoint);
		
			CallingservicesSoapImpls call = new CallingservicesSoapImpls();
			response = call.doFonede(request, clientEndPoint);  
			rta.setTable(response.getFonedeResult());
			
		}catch(Exception e) {
			e.getMessage();
		}
		
		return rta;
	}

	
}
