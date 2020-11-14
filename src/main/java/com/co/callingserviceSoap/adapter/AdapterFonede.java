package com.co.callingserviceSoap.adapter;

import com.co.callingserviceSoap.dto.FonedeDTO;

import wcompensar.caf.Fonede;

public class AdapterFonede {

	public FonedeDTO entityToDto(Fonede ent) {
		
		FonedeDTO rta = new FonedeDTO();
		rta.setsParametros(ent.getSParametros());
		
		return rta;
	}
	
	public Fonede dtoToEntity(FonedeDTO dto) {
		
		Fonede rta = new Fonede();
		rta.setSParametros(dto.getsParametros());
		
		return rta;
	}
	
	public FonedeDTO entityToDtoResponse(Fonede ent) {
		
		FonedeDTO rta = new FonedeDTO();
		rta.setsParametros(ent.getSParametros());
		
		return rta;
	}
	
	public Fonede dtoToEntityResponse(FonedeDTO dto) {
		
		Fonede rta = new Fonede();
		rta.setSParametros(dto.getsParametros());
		
		return rta;
	}
	
}
