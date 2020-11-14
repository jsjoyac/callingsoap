package com.co.callingserviceSoap.business;

import com.co.callingserviceSoap.dto.EmpresaDTO;
import com.co.callingserviceSoap.dto.EmpresaResponseDTO;

public interface IEmpresa {

	public EmpresaResponseDTO doEmpresa(EmpresaDTO dto);
	
}
