package com.co.callingserviceSoap.adapter;

import com.co.callingserviceSoap.dto.ConsultaDatosBasicosDTO;

import wcompensar.caf.ConsultaDatosBasicos;

public class AdapterConsultaDatosBasicos {

	public ConsultaDatosBasicosDTO entityToDto(ConsultaDatosBasicos ent) {
		
		ConsultaDatosBasicosDTO rta = new ConsultaDatosBasicosDTO();
		rta.setiOpc(ent.getIOpc());
		rta.setsApl(ent.getSApl());
		
		return rta;
	}
	
	public ConsultaDatosBasicos dtoToEntity(ConsultaDatosBasicosDTO dto) {
		
		ConsultaDatosBasicos rta = new ConsultaDatosBasicos();
		rta.setIOpc(dto.getiOpc());
		rta.setSApl(dto.getsApl());
		
		return rta;
	}
	
	public ConsultaDatosBasicosDTO entityToDtoResponse(ConsultaDatosBasicos ent) {
		
		ConsultaDatosBasicosDTO rta = new ConsultaDatosBasicosDTO();
		rta.setiOpc(ent.getIOpc());
		rta.setsApl(ent.getSApl());
		
		return rta;
	}
	
	public ConsultaDatosBasicos dtoToEntityResponse(ConsultaDatosBasicosDTO dto) {
		
		ConsultaDatosBasicos rta = new ConsultaDatosBasicos();
		rta.setIOpc(dto.getiOpc());
		rta.setSApl(dto.getsApl());
		
		return rta;
	}
	
}
