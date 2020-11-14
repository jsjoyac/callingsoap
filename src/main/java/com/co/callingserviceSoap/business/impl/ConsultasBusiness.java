package com.co.callingserviceSoap.business.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.co.callingserviceSoap.CallingservicesSoapImpls;
import com.co.callingserviceSoap.adapter.AdapterConsultas;
import com.co.callingserviceSoap.business.IConsultas;
import com.co.callingserviceSoap.dto.ConsultasDTO;
import com.co.callingserviceSoap.dto.ConsultasResponseDTO;
import wcompensar.caf.Consultas;
import wcompensar.caf.ConsultasResponse;

@Service
public class ConsultasBusiness implements IConsultas {

	@Value("${WSDL.SOAPClient}")
	private String clientEndPoint;
	
	@Override
	public ConsultasResponseDTO doConsultas(ConsultasDTO dto) {
		// 
		ConsultasResponseDTO rta = new ConsultasResponseDTO();
		AdapterConsultas adap = new AdapterConsultas();
		Consultas request = null;
		ConsultasResponse response = null;
		try {
			request =  adap.dtoToEntity(dto);
		
			System.out.println("clientEndpoint: "+clientEndPoint);
		
			CallingservicesSoapImpls call = new CallingservicesSoapImpls();
			response = call.doConsultas(request, clientEndPoint);  
			rta.setTable(response.getConsultasResult());
			
		}catch(Exception e) {
			e.getMessage();
		}
		
		return rta;
	}

	
}
