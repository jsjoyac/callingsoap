package com.co.callingserviceSoap.business.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.co.callingserviceSoap.CallingservicesSoapImpls;
import com.co.callingserviceSoap.adapter.AdapterCiudad;
import com.co.callingserviceSoap.business.ICiudad;
import com.co.callingserviceSoap.dto.CiudadResponseDTO;
import com.co.callingserviceSoap.dto.CiudadDTO;

import wcompensar.caf.Ciudades;
import wcompensar.caf.CiudadesResponse;

@Service
public class CiudadBusiness implements ICiudad {

	@Value("${WSDL.SOAPClient}")
	private String clientEndPoint;

	@Override
	public CiudadResponseDTO doCiudades(CiudadDTO dto) {
		
		CiudadResponseDTO rta = new CiudadResponseDTO();
		AdapterCiudad adap = new AdapterCiudad();
		Ciudades request = null;
		CiudadesResponse response = null;
		try {
			request =  adap.dtoToEntity(dto);		
		
			CallingservicesSoapImpls call = new CallingservicesSoapImpls();
			response = call.doCiudades(request, clientEndPoint);  
			rta.setTable(response.getCiudadesResult());
			
		}catch(Exception e) {
			e.getMessage();
		}
		
		return rta;
	}

	
}
