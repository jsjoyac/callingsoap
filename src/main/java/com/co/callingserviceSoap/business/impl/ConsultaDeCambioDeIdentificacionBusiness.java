package com.co.callingserviceSoap.business.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.co.callingserviceSoap.CallingservicesSoapImpls;
import com.co.callingserviceSoap.adapter.AdapterConsultaDeCambioDeIdentificacion;
import com.co.callingserviceSoap.business.IConsultaDeCambioDeIdentificacion;
import com.co.callingserviceSoap.dto.ConsultaDeCambioDeIdentificacionDTO;
import com.co.callingserviceSoap.dto.ConsultaDeCambioDeIdentificacionResponseDTO;
import wcompensar.caf.ConsultaDeCambioDeIdentificacion;
import wcompensar.caf.ConsultaDeCambioDeIdentificacionResponse;

@Service
public class ConsultaDeCambioDeIdentificacionBusiness implements IConsultaDeCambioDeIdentificacion {

	@Value("${WSDL.SOAPClient}")
	private String clientEndPoint;
	
	@Override
	public ConsultaDeCambioDeIdentificacionResponseDTO doConsultaDeCambioDeIdentificacion(ConsultaDeCambioDeIdentificacionDTO dto) {
		// 
		ConsultaDeCambioDeIdentificacionResponseDTO rta = new ConsultaDeCambioDeIdentificacionResponseDTO();
		AdapterConsultaDeCambioDeIdentificacion adap = new AdapterConsultaDeCambioDeIdentificacion();
		ConsultaDeCambioDeIdentificacion request = null;
		ConsultaDeCambioDeIdentificacionResponse response = null;
		try {
			request =  adap.dtoToEntity(dto);
		
			System.out.println("clientEndpoint: "+clientEndPoint);
		
			CallingservicesSoapImpls call = new CallingservicesSoapImpls();
			response = call.doConsultaDeCambioDeIdentificacion(request, clientEndPoint);
			rta.setTable(response.getConsultaDeCambioDeIdentificacionResult());
			
		}catch(Exception e) {
			e.getMessage();
		}
		
		return rta;
	}

	
}
