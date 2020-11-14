package com.co.callingserviceSoap.adapter;

import com.co.callingserviceSoap.dto.CiudadDTO;

import wcompensar.caf.Ciudades;

public class AdapterCiudad {

	public CiudadDTO entityToDto(Ciudades ent) {
		
		CiudadDTO rta = new CiudadDTO();
		rta.setiOpc(ent.getIOpc());
		rta.setsApl(ent.getSApl());
		
		return rta;
	}
	
	public Ciudades dtoToEntity(CiudadDTO dto) {
		
		Ciudades rta = new Ciudades();
		rta.setIOpc(dto.getiOpc());
		rta.setSApl(dto.getsApl());
		
		return rta;
	}
	
	public CiudadDTO entityToDtoResponse(Ciudades ent) {
		
		CiudadDTO rta = new CiudadDTO();
		rta.setiOpc(ent.getIOpc());
		rta.setsApl(ent.getSApl());
		
		return rta;
	}
	
	public Ciudades dtoToEntityResponse(CiudadDTO dto) {
		
		Ciudades rta = new Ciudades();
		rta.setIOpc(dto.getiOpc());
		rta.setSApl(dto.getsApl());
		
		return rta;
	}
	
}
