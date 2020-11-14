package com.co.callingserviceSoap.business.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.co.callingserviceSoap.CallingservicesSoapImpls;
import com.co.callingserviceSoap.adapter.AdapterEmpresa;
import com.co.callingserviceSoap.business.IEmpresa;
import com.co.callingserviceSoap.dto.EmpresaDTO;
import com.co.callingserviceSoap.dto.EmpresaResponseDTO;
import wcompensar.caf.Empresa;
import wcompensar.caf.EmpresaResponse;

@Service
public class EmpresaBusiness implements IEmpresa {

	@Value("${WSDL.SOAPClient}")
	private String clientEndPoint;

	@Override
	public EmpresaResponseDTO doEmpresa(EmpresaDTO dto) {
		// 
		EmpresaResponseDTO rta = new EmpresaResponseDTO();
		AdapterEmpresa adap = new AdapterEmpresa();
		Empresa request = null;
		EmpresaResponse response = null;
		try {
			request =  adap.dtoToEntity(dto);
		
			System.out.println("clientEndpoint: "+clientEndPoint);
		
			CallingservicesSoapImpls call = new CallingservicesSoapImpls();
			response = call.doEmpresa(request, clientEndPoint);  
			rta.setTable(response.getEmpresaResult());
			
		}catch(Exception e) {
			e.getMessage();
		}
		
		return rta;
	}

	
}
