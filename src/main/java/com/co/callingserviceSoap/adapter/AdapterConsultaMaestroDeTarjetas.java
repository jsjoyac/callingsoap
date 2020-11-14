package com.co.callingserviceSoap.adapter;

import com.co.callingserviceSoap.dto.ConsultaMaestroDeTarjetasDTO;

import wcompensar.caf.ConsultaMaestroDeTarjetas;

public class AdapterConsultaMaestroDeTarjetas {

	public ConsultaMaestroDeTarjetasDTO entityToDto(ConsultaMaestroDeTarjetas ent) {
		
		ConsultaMaestroDeTarjetasDTO rta = new ConsultaMaestroDeTarjetasDTO();
		rta.setdIdentificacion(ent.getDIdentificacion());
		rta.setiOpc(ent.getIOpc());
		rta.setiTipo(ent.getITipo());
		rta.setsApl(ent.getSApl());
		
		return rta;
	}
	
	public ConsultaMaestroDeTarjetas dtoToEntity(ConsultaMaestroDeTarjetasDTO dto) {
		
		ConsultaMaestroDeTarjetas rta = new ConsultaMaestroDeTarjetas();
		rta.setDIdentificacion(dto.getdIdentificacion());
		rta.setIOpc(dto.getiOpc());
		rta.setITipo(dto.getiTipo());
		rta.setSApl(dto.getsApl());
		
		return rta;
	}
	
	public ConsultaMaestroDeTarjetasDTO entityToDtoResponse(ConsultaMaestroDeTarjetas ent) {
		
		ConsultaMaestroDeTarjetasDTO rta = new ConsultaMaestroDeTarjetasDTO();
		rta.setdIdentificacion(ent.getDIdentificacion());
		rta.setiOpc(ent.getIOpc());
		rta.setiTipo(ent.getITipo());
		rta.setsApl(ent.getSApl());
		
		return rta;
	}
	
	public ConsultaMaestroDeTarjetas dtoToEntityResponse(ConsultaMaestroDeTarjetasDTO dto) {
		
		ConsultaMaestroDeTarjetas rta = new ConsultaMaestroDeTarjetas();
		rta.setDIdentificacion(dto.getdIdentificacion());
		rta.setIOpc(dto.getiOpc());
		rta.setITipo(dto.getiTipo());
		rta.setSApl(dto.getsApl());
		
		return rta;
	}
	
}
