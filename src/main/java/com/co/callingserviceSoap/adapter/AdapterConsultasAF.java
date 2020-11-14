package com.co.callingserviceSoap.adapter;

import com.co.callingserviceSoap.dto.ConsultasAFDTO;

import wcompensar.caf.ConsultasAF;

public class AdapterConsultasAF {

	public ConsultasAFDTO entityToDto(ConsultasAF ent) {
		
		ConsultasAFDTO rta = new ConsultasAFDTO();
		rta.setiOpc(ent.getIOpc());
		rta.setsApl(ent.getSApl());
		rta.setsParametros(ent.getSParametros());
		
		return rta;
	}
	
	public ConsultasAF dtoToEntity(ConsultasAFDTO dto) {
		
		ConsultasAF rta = new ConsultasAF();
		rta.setIOpc(dto.getiOpc());
		rta.setSApl(dto.getsApl());
		rta.setSParametros(dto.getsParametros());
		
		return rta;
	}
	
	public ConsultasAFDTO entityToDtoResponse(ConsultasAF ent) {
		
		ConsultasAFDTO rta = new ConsultasAFDTO();
		rta.setiOpc(ent.getIOpc());
		rta.setsApl(ent.getSApl());
		rta.setsParametros(ent.getSParametros());
		
		return rta;
	}
	
	public ConsultasAF dtoToEntityResponse(ConsultasAFDTO dto) {
		
		ConsultasAF rta = new ConsultasAF();
		rta.setIOpc(dto.getiOpc());
		rta.setSApl(dto.getsApl());
		rta.setSParametros(dto.getsParametros());
		
		return rta;
	}
	
}
