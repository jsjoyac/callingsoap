package com.co.callingserviceSoap.business.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.co.callingserviceSoap.CallingservicesSoapImpls;
import com.co.callingserviceSoap.adapter.AdapterAfiliado;
import com.co.callingserviceSoap.business.IAfiliado;
import com.co.callingserviceSoap.dto.AfiliadoDTO;
import com.co.callingserviceSoap.dto.AfiliadoResponseDTO;
import wcompensar.caf.Afiliado;
import wcompensar.caf.AfiliadoResponse;

@Service
public class AfiliadoBusiness implements IAfiliado {

	@Value("${WSDL.SOAPClient}")
	private String clientEndPoint;
	
	@Override
	public AfiliadoResponseDTO doAfiliado(AfiliadoDTO dto) {
		// 
		AfiliadoResponseDTO rta = new AfiliadoResponseDTO();
		AdapterAfiliado adap = new AdapterAfiliado();
		Afiliado request = null;
		AfiliadoResponse response = null;
		try {
			request =  adap.dtoToEntity(dto);
		
			System.out.println("clientEndpoint: "+clientEndPoint);
		
			CallingservicesSoapImpls call = new CallingservicesSoapImpls();
			response = call.doAfiliado(request, clientEndPoint);  
			rta.setTable(response.getAfiliadoResult());
			
		}catch(Exception e) {
			e.getMessage();
		}
		
		return rta;
	}

	
}
