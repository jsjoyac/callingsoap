package com.co.callingserviceSoap.adapter;

import com.co.callingserviceSoap.dto.SMLVDTO;

import wcompensar.caf.SMLV;

public class AdapterSMLV {

	public SMLVDTO entityToDto(SMLV ent) {
		
		SMLVDTO rta = new SMLVDTO();
		rta.setsApl(ent.getSApl());
		
		return rta;
	}
	
	public SMLV dtoToEntity(SMLVDTO dto) {
		
		SMLV rta = new SMLV();
		rta.setSApl(dto.getsApl());
		
		return rta;
	}
	
	public SMLVDTO entityToDtoResponse(SMLV ent) {
		
		SMLVDTO rta = new SMLVDTO();
		rta.setsApl(ent.getSApl());
		
		return rta;
	}
	
	public SMLV dtoToEntityResponse(SMLVDTO dto) {
		
		SMLV rta = new SMLV();
		rta.setSApl(dto.getsApl());
		
		return rta;
	}
	
}
