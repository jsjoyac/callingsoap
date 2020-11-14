package com.co.callingserviceSoap.adapter;

import com.co.callingserviceSoap.dto.EmpresaDTO;

import wcompensar.caf.Empresa;

public class AdapterEmpresa {

	public EmpresaDTO entityToDto(Empresa ent) {
		
		EmpresaDTO rta = new EmpresaDTO();
		rta.setdIdentificacion(ent.getDIdentificacion());
		rta.setiOpc(ent.getIOpc());
		rta.setiTipo(ent.getITipo());
		rta.setsApl(ent.getSApl());
		rta.setsPrograma(ent.getSPrograma());
		rta.setiDep(ent.getIDep());
		
		return rta;
	}
	
	public Empresa dtoToEntity(EmpresaDTO dto) {
		
		Empresa rta = new Empresa();
		rta.setDIdentificacion(dto.getdIdentificacion());
		rta.setIOpc(dto.getiOpc());
		rta.setITipo(dto.getiTipo());
		rta.setSApl(dto.getsApl());
		rta.setSPrograma(dto.getsPrograma());
		
		return rta;
	}
	
	public EmpresaDTO entityToDtoResponse(Empresa ent) {
		
		EmpresaDTO rta = new EmpresaDTO();
		rta.setdIdentificacion(ent.getDIdentificacion());
		rta.setiOpc(ent.getIOpc());
		rta.setiTipo(ent.getITipo());
		rta.setsApl(ent.getSApl());
		rta.setsPrograma(ent.getSPrograma());
		
		return rta;
	}
	
	public Empresa dtoToEntityResponse(EmpresaDTO dto) {
		
		Empresa rta = new Empresa();
		rta.setDIdentificacion(dto.getdIdentificacion());
		rta.setIOpc(dto.getiOpc());
		rta.setITipo(dto.getiTipo());
		rta.setSApl(dto.getsApl());
		rta.setSPrograma(dto.getsPrograma());
		
		return rta;
	}
	
}
