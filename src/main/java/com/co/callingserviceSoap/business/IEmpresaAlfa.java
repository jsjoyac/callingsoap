package com.co.callingserviceSoap.business;

import com.co.callingserviceSoap.dto.EmpresaAlfaDTO;
import com.co.callingserviceSoap.dto.EmpresaAlfaResponseDTO;

public interface IEmpresaAlfa {

	public EmpresaAlfaResponseDTO doEmpresaAlfa(EmpresaAlfaDTO dto);
	
}
