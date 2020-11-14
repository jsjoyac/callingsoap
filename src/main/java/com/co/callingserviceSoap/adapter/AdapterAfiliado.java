package com.co.callingserviceSoap.adapter;

import com.co.callingserviceSoap.dto.AfiliadoDTO;

import wcompensar.caf.Afiliado;

public class AdapterAfiliado {

	public AfiliadoDTO entityToDto(Afiliado ent) {
		
		AfiliadoDTO rta = new AfiliadoDTO();
		rta.setdIdentificacion(ent.getDIdentificacion());
		rta.setiOpc(ent.getIOpc());
		rta.setiTipo(ent.getITipo());
		rta.setsApl(ent.getSApl());
		rta.setsPrograma(ent.getSPrograma());
		
		return rta;
	}
	
	public Afiliado dtoToEntity(AfiliadoDTO dto) {
		
		Afiliado rta = new Afiliado();
		rta.setDIdentificacion(dto.getdIdentificacion());
		rta.setIOpc(dto.getiOpc());
		rta.setITipo(dto.getiTipo());
		rta.setSApl(dto.getsApl());
		rta.setSPrograma(dto.getsPrograma());
		
		return rta;
	}
	
	public AfiliadoDTO entityToDtoResponse(Afiliado ent) {
		
		AfiliadoDTO rta = new AfiliadoDTO();
		rta.setdIdentificacion(ent.getDIdentificacion());
		rta.setiOpc(ent.getIOpc());
		rta.setiTipo(ent.getITipo());
		rta.setsApl(ent.getSApl());
		rta.setsPrograma(ent.getSPrograma());
		
		return rta;
	}
	
	public Afiliado dtoToEntityResponse(AfiliadoDTO dto) {
		
		Afiliado rta = new Afiliado();
		rta.setDIdentificacion(dto.getdIdentificacion());
		rta.setIOpc(dto.getiOpc());
		rta.setITipo(dto.getiTipo());
		rta.setSApl(dto.getsApl());
		rta.setSPrograma(dto.getsPrograma());
		
		return rta;
	}
	
}
