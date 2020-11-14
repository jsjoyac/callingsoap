package com.co.callingserviceSoap.adapter;

import com.co.callingserviceSoap.dto.ConsultaDeCambioDeIdentificacionDTO;

import wcompensar.caf.ConsultaDeCambioDeIdentificacion;

public class AdapterConsultaDeCambioDeIdentificacion {

	public ConsultaDeCambioDeIdentificacionDTO entityToDto(ConsultaDeCambioDeIdentificacion ent) {
		
		ConsultaDeCambioDeIdentificacionDTO rta = new ConsultaDeCambioDeIdentificacionDTO();
		rta.setdIdentificacion(ent.getDIdentificacion());
		rta.setiTipo(ent.getITipo());
		rta.setsApl(ent.getSApl());
		
		return rta;
	}
	
	public ConsultaDeCambioDeIdentificacion dtoToEntity(ConsultaDeCambioDeIdentificacionDTO dto) {
		
		ConsultaDeCambioDeIdentificacion rta = new ConsultaDeCambioDeIdentificacion();
		rta.setDIdentificacion(dto.getdIdentificacion());
		rta.setITipo(dto.getiTipo());
		rta.setSApl(dto.getsApl());
		
		return rta;
	}
	
	public ConsultaDeCambioDeIdentificacionDTO entityToDtoResponse(ConsultaDeCambioDeIdentificacion ent) {
		
		ConsultaDeCambioDeIdentificacionDTO rta = new ConsultaDeCambioDeIdentificacionDTO();
		rta.setdIdentificacion(ent.getDIdentificacion());
		rta.setiTipo(ent.getITipo());
		rta.setsApl(ent.getSApl());
		
		return rta;
	}
	
	public ConsultaDeCambioDeIdentificacion dtoToEntityResponse(ConsultaDeCambioDeIdentificacionDTO dto) {
		
		ConsultaDeCambioDeIdentificacion rta = new ConsultaDeCambioDeIdentificacion();
		rta.setDIdentificacion(dto.getdIdentificacion());
		rta.setITipo(dto.getiTipo());
		rta.setSApl(dto.getsApl());
		
		return rta;
	}
	
}
