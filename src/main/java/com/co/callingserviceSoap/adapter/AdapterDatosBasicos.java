package com.co.callingserviceSoap.adapter;

import com.co.callingserviceSoap.dto.DatosBasicosDTO;

import wcompensar.caf.DatosBasicos;

public class AdapterDatosBasicos {

	public DatosBasicosDTO entityToDto(DatosBasicos ent) {
		
		DatosBasicosDTO rta = new DatosBasicosDTO();
		rta.setsCodigo(ent.getSCodigo());
		rta.setsApl(ent.getSApl());
		
		return rta;
	}
	
	public DatosBasicos dtoToEntity(DatosBasicosDTO dto) {
		
		DatosBasicos rta = new DatosBasicos();
		rta.setSCodigo(dto.getsCodigo());
		rta.setSApl(dto.getsApl());
		
		return rta;
	}
	
	public DatosBasicosDTO entityToDtoResponse(DatosBasicos ent) {
		
		DatosBasicosDTO rta = new DatosBasicosDTO();
		rta.setsCodigo(ent.getSCodigo());
		rta.setsApl(ent.getSApl());
		
		return rta;
	}
	
	public DatosBasicos dtoToEntityResponse(DatosBasicosDTO dto) {
		
		DatosBasicos rta = new DatosBasicos();
		rta.setSCodigo(dto.getsCodigo());
		rta.setSApl(dto.getsApl());
		
		return rta;
	}
	
}
