package com.co.callingserviceSoap.adapter;

import com.co.callingserviceSoap.dto.MultiAfiliadoDTO;

import wcompensar.caf.MultiAfiliado;

public class AdapterMultiAfiliado {

	public MultiAfiliadoDTO entityToDto(MultiAfiliado ent) {
		
		MultiAfiliadoDTO rta = new MultiAfiliadoDTO();
		rta.setdIdentificacion(ent.getDIdentificacion());
		rta.setiOpc(ent.getIOpc());
		rta.setiTipo(ent.getITipo());
		rta.setsApl(ent.getSApl());
		
		return rta;
	}
	
	public MultiAfiliado dtoToEntity(MultiAfiliadoDTO dto) {
		
		MultiAfiliado rta = new MultiAfiliado();
		rta.setDIdentificacion(dto.getdIdentificacion());
		rta.setIOpc(dto.getiOpc());
		rta.setITipo(dto.getiTipo());
		rta.setSApl(dto.getsApl());
		
		return rta;
	}
	
	public MultiAfiliadoDTO entityToDtoResponse(MultiAfiliado ent) {
		
		MultiAfiliadoDTO rta = new MultiAfiliadoDTO();
		rta.setdIdentificacion(ent.getDIdentificacion());
		rta.setiOpc(ent.getIOpc());
		rta.setiTipo(ent.getITipo());
		rta.setsApl(ent.getSApl());
		
		return rta;
	}
	
	public MultiAfiliado dtoToEntityResponse(MultiAfiliadoDTO dto) {
		
		MultiAfiliado rta = new MultiAfiliado();
		rta.setDIdentificacion(dto.getdIdentificacion());
		rta.setIOpc(dto.getiOpc());
		rta.setITipo(dto.getiTipo());
		rta.setSApl(dto.getsApl());
		
		return rta;
	}
	
}
