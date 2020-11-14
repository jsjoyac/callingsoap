package com.co.callingserviceSoap.business.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.co.callingserviceSoap.CallingservicesSoapImpls;
import com.co.callingserviceSoap.adapter.AdapterConsultaMaestroDeTarjetas;
import com.co.callingserviceSoap.business.IConsultaMaestroDeTarjetas;
import com.co.callingserviceSoap.dto.ConsultaMaestroDeTarjetasDTO;
import com.co.callingserviceSoap.dto.ConsultaMaestroDeTarjetasResponseDTO;
import wcompensar.caf.ConsultaMaestroDeTarjetas;
import wcompensar.caf.ConsultaMaestroDeTarjetasResponse;

@Service
public class ConsultaMaestroDeTarjetasBusiness implements IConsultaMaestroDeTarjetas {

	@Value("${WSDL.SOAPClient}")
	private String clientEndPoint;
	
	@Override
	public ConsultaMaestroDeTarjetasResponseDTO doConsultaMaestroDeTarjetas(ConsultaMaestroDeTarjetasDTO dto) {
		// 
		ConsultaMaestroDeTarjetasResponseDTO rta = new ConsultaMaestroDeTarjetasResponseDTO();
		AdapterConsultaMaestroDeTarjetas adap = new AdapterConsultaMaestroDeTarjetas();
		ConsultaMaestroDeTarjetas request = null;
		ConsultaMaestroDeTarjetasResponse response = null;
		try {
			request =  adap.dtoToEntity(dto);
		
			System.out.println("clientEndpoint: "+clientEndPoint);
		
			CallingservicesSoapImpls call = new CallingservicesSoapImpls();
			response = call.doConsultaMaestroDeTarjetas(request, clientEndPoint);  
			rta.setTable(response.getConsultaMaestroDeTarjetasResult());
			
		}catch(Exception e) {
			e.getMessage();
		}
		
		return rta;
	}

	
}
