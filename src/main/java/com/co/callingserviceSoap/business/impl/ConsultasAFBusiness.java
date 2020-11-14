package com.co.callingserviceSoap.business.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.co.callingserviceSoap.CallingservicesSoapImpls;
import com.co.callingserviceSoap.adapter.AdapterConsultasAF;
import com.co.callingserviceSoap.business.IConsultasAF;
import com.co.callingserviceSoap.dto.ConsultasAFDTO;
import com.co.callingserviceSoap.dto.ConsultasAFResponseDTO;
import wcompensar.caf.ConsultasAF;
import wcompensar.caf.ConsultasAFResponse;

@Service
public class ConsultasAFBusiness implements IConsultasAF {

	@Value("${WSDL.SOAPClient}")
	private String clientEndPoint;
	
	@Override
	public ConsultasAFResponseDTO doConsultasAF(ConsultasAFDTO dto) {
		// 
		ConsultasAFResponseDTO rta = new ConsultasAFResponseDTO();
		AdapterConsultasAF adap = new AdapterConsultasAF();
		ConsultasAF request = null;
		ConsultasAFResponse response = null;
		try {
			request =  adap.dtoToEntity(dto);
		
			System.out.println("clientEndpoint: "+clientEndPoint);
		
			CallingservicesSoapImpls call = new CallingservicesSoapImpls();
			response = call.doConsultasAF(request, clientEndPoint);  
			rta.setTable(response.getConsultasAFResult());
			
		}catch(Exception e) {
			e.getMessage();
		}
		
		return rta;
	}

	
}
