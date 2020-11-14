package com.co.callingserviceSoap.business.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.co.callingserviceSoap.CallingservicesSoapImpls;
import com.co.callingserviceSoap.adapter.AdapterConsultaDatosBasicos;
import com.co.callingserviceSoap.business.IConsultaDatosBasicos;
import com.co.callingserviceSoap.dto.ConsultaDatosBasicosDTO;
import com.co.callingserviceSoap.dto.ConsultaDatosBasicosResponseDTO;
import wcompensar.caf.ConsultaDatosBasicos;
import wcompensar.caf.ConsultaDatosBasicosResponse;

@Service
public class ConsultaDatosBasicosBusiness implements IConsultaDatosBasicos {

	@Value("${WSDL.SOAPClient}")
	private String clientEndPoint;
	
	@Override
	public ConsultaDatosBasicosResponseDTO doConsultaDatosBasicos(ConsultaDatosBasicosDTO dto) {
		// 
		ConsultaDatosBasicosResponseDTO rta = new ConsultaDatosBasicosResponseDTO();
		AdapterConsultaDatosBasicos adap = new AdapterConsultaDatosBasicos();
		ConsultaDatosBasicos request = null;
		ConsultaDatosBasicosResponse response = null;
		try {
			request =  adap.dtoToEntity(dto);
		
			System.out.println("clientEndpoint: "+clientEndPoint);
		
			CallingservicesSoapImpls call = new CallingservicesSoapImpls();
			response = call.doConsultaDatosBasicos(request, clientEndPoint);  
			rta.setTable(response.getConsultaDatosBasicosResult());
			
		}catch(Exception e) {
			e.getMessage();
		}
		
		return rta;
	}

	
}
