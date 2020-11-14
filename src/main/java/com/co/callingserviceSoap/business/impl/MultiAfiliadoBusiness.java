package com.co.callingserviceSoap.business.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.co.callingserviceSoap.CallingservicesSoapImpls;
import com.co.callingserviceSoap.adapter.AdapterMultiAfiliado;
import com.co.callingserviceSoap.business.IMultiAfiliado;
import com.co.callingserviceSoap.dto.MultiAfiliadoDTO;
import com.co.callingserviceSoap.dto.MultiAfiliadoResponseDTO;

import wcompensar.caf.MultiAfiliado;
import wcompensar.caf.MultiAfiliadoResponse;

@Service
public class MultiAfiliadoBusiness implements IMultiAfiliado {

	@Value("${WSDL.SOAPClient}")
	private String clientEndPoint;
	
	@Override
	public MultiAfiliadoResponseDTO doMultiAfiliado(MultiAfiliadoDTO dto) {
		// 
		MultiAfiliadoResponseDTO rta = new MultiAfiliadoResponseDTO();
		AdapterMultiAfiliado adap = new AdapterMultiAfiliado();
		MultiAfiliado request = null;
		MultiAfiliadoResponse response = null;
		try {
			request =  adap.dtoToEntity(dto);
		
			System.out.println("clientEndpoint: "+clientEndPoint);
		
			CallingservicesSoapImpls call = new CallingservicesSoapImpls();
			response = call.doMultiAfiliado(request, clientEndPoint);  
			rta.setTable(response.getMultiAfiliadoResult());
			
		}catch(Exception e) {
			e.getMessage();
		}
		
		return rta;
	}

	
}
