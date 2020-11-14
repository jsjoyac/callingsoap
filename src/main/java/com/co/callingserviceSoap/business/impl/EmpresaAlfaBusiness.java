package com.co.callingserviceSoap.business.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.co.callingserviceSoap.CallingservicesSoapImpls;
import com.co.callingserviceSoap.adapter.AdapterEmpresaAlfa;
import com.co.callingserviceSoap.business.IEmpresaAlfa;
import com.co.callingserviceSoap.dto.EmpresaAlfaDTO;
import com.co.callingserviceSoap.dto.EmpresaAlfaResponseDTO;
import wcompensar.caf.EmpresaAlfa;
import wcompensar.caf.EmpresaAlfaResponse;

@Service
public class EmpresaAlfaBusiness implements IEmpresaAlfa {

	@Value("${WSDL.SOAPClient}")
	private String clientEndPoint;

	@Override
	public EmpresaAlfaResponseDTO doEmpresaAlfa(EmpresaAlfaDTO dto) {
		// 
		EmpresaAlfaResponseDTO rta = new EmpresaAlfaResponseDTO();
		AdapterEmpresaAlfa adap = new AdapterEmpresaAlfa();
		EmpresaAlfa request = null;
		EmpresaAlfaResponse response = null;
		try {
			request =  adap.dtoToEntity(dto);
		
			System.out.println("clientEndpoint: "+clientEndPoint);
		
			CallingservicesSoapImpls call = new CallingservicesSoapImpls();
			response = call.doEmpresaAlfa(request, clientEndPoint);  
			rta.setTable(response.getEmpresaAlfaResult());
			
		}catch(Exception e) {
			e.getMessage();
		}
		
		return rta;
	}

	
}
