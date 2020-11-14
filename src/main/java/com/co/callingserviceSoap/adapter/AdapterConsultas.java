package com.co.callingserviceSoap.adapter;

import com.co.callingserviceSoap.dto.ConsultasDTO;

import wcompensar.caf.Consultas;

public class AdapterConsultas {

	public ConsultasDTO entityToDto(Consultas ent) {
		
		ConsultasDTO rta = new ConsultasDTO();
		rta.setsParametros(ent.getSParametros());
		
		return rta;
	}
	
	public Consultas dtoToEntity(ConsultasDTO dto) {
		
		Consultas rta = new Consultas();
		rta.setSParametros(dto.getsParametros());
		
		return rta;
	}
	
	public ConsultasDTO entityToDtoResponse(Consultas ent) {
		
		ConsultasDTO rta = new ConsultasDTO();
		rta.setsParametros(ent.getSParametros());
		
		return rta;
	}
	
	public Consultas dtoToEntityResponse(ConsultasDTO dto) {
		
		Consultas rta = new Consultas();
		rta.setSParametros(dto.getsParametros());
		
		return rta;
	}
	
}
