package com.co.callingserviceSoap.business.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.co.callingserviceSoap.CallingservicesSoapImpls;
import com.co.callingserviceSoap.adapter.AdapterDatosBasicos;
import com.co.callingserviceSoap.business.IDatosBasicos;
import com.co.callingserviceSoap.dto.DatosBasicosDTO;
import com.co.callingserviceSoap.dto.DatosBasicosResponseDTO;
import wcompensar.caf.DatosBasicos;
import wcompensar.caf.DatosBasicosResponse;

@Service
public class DatosBasicosBusiness implements IDatosBasicos {

	@Value("${WSDL.SOAPClient}")
	private String clientEndPoint;
	
	@Override
	public DatosBasicosResponseDTO doDatosBasicos(DatosBasicosDTO dto) {
		// 
		DatosBasicosResponseDTO rta = new DatosBasicosResponseDTO();
		AdapterDatosBasicos adap = new AdapterDatosBasicos();
		DatosBasicos request = null;
		DatosBasicosResponse response = null;
		try {
			request =  adap.dtoToEntity(dto);
		
			System.out.println("clientEndpoint: "+clientEndPoint);
		
			CallingservicesSoapImpls call = new CallingservicesSoapImpls();
			response = call.doDatosBasicos(request, clientEndPoint);  
			rta.setTable(response.getDatosBasicosResult());
			
		}catch(Exception e) {
			e.getMessage();
		}
		
		return rta;
	}

	
}
