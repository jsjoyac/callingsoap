package com.co.callingserviceSoap.adapter;

import com.co.callingserviceSoap.dto.EmpresaAlfaDTO;

import wcompensar.caf.EmpresaAlfa;

public class AdapterEmpresaAlfa {

	public EmpresaAlfaDTO entityToDto(EmpresaAlfa ent) {
		
		EmpresaAlfaDTO rta = new EmpresaAlfaDTO();
		rta.setsParametros(ent.getSParametros());
		
		return rta;
	}
	
	public EmpresaAlfa dtoToEntity(EmpresaAlfaDTO dto) {
		
		EmpresaAlfa rta = new EmpresaAlfa();
		rta.setSParametros(dto.getsParametros());
		
		return rta;
	}
	
	public EmpresaAlfaDTO entityToDtoResponse(EmpresaAlfa ent) {
		
		EmpresaAlfaDTO rta = new EmpresaAlfaDTO();
		rta.setsParametros(ent.getSParametros());
		
		return rta;
	}
	
	public EmpresaAlfa dtoToEntityResponse(EmpresaAlfaDTO dto) {
		
		EmpresaAlfa rta = new EmpresaAlfa();
		rta.setSParametros(dto.getsParametros());
		
		return rta;
	}
	
}
