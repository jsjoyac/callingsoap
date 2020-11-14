package com.co.callingserviceSoap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.callingserviceSoap.business.IAfiliado;
import com.co.callingserviceSoap.business.ICiudad;
import com.co.callingserviceSoap.business.IConsultaDatosBasicos;
import com.co.callingserviceSoap.business.IConsultaDeCambioDeIdentificacion;
import com.co.callingserviceSoap.business.IConsultaMaestroDeTarjetas;
import com.co.callingserviceSoap.business.IConsultas;
import com.co.callingserviceSoap.business.IConsultasAF;
import com.co.callingserviceSoap.business.IDatosBasicos;
import com.co.callingserviceSoap.business.IEmpresa;
import com.co.callingserviceSoap.business.IEmpresaAlfa;
import com.co.callingserviceSoap.business.IFonede;
import com.co.callingserviceSoap.business.IMultiAfiliado;
import com.co.callingserviceSoap.business.ISMLV;
import com.co.callingserviceSoap.dto.AfiliadoDTO;
import com.co.callingserviceSoap.dto.AfiliadoResponseDTO;
import com.co.callingserviceSoap.dto.CiudadDTO;
import com.co.callingserviceSoap.dto.CiudadResponseDTO;
import com.co.callingserviceSoap.dto.ConsultaDatosBasicosDTO;
import com.co.callingserviceSoap.dto.ConsultaDatosBasicosResponseDTO;
import com.co.callingserviceSoap.dto.ConsultaDeCambioDeIdentificacionDTO;
import com.co.callingserviceSoap.dto.ConsultaDeCambioDeIdentificacionResponseDTO;
import com.co.callingserviceSoap.dto.ConsultaMaestroDeTarjetasDTO;
import com.co.callingserviceSoap.dto.ConsultaMaestroDeTarjetasResponseDTO;
import com.co.callingserviceSoap.dto.ConsultasAFDTO;
import com.co.callingserviceSoap.dto.ConsultasAFResponseDTO;
import com.co.callingserviceSoap.dto.ConsultasDTO;
import com.co.callingserviceSoap.dto.ConsultasResponseDTO;
import com.co.callingserviceSoap.dto.DatosBasicosDTO;
import com.co.callingserviceSoap.dto.DatosBasicosResponseDTO;
import com.co.callingserviceSoap.dto.EmpresaAlfaDTO;
import com.co.callingserviceSoap.dto.EmpresaAlfaResponseDTO;
import com.co.callingserviceSoap.dto.EmpresaDTO;
import com.co.callingserviceSoap.dto.EmpresaResponseDTO;
import com.co.callingserviceSoap.dto.FonedeDTO;
import com.co.callingserviceSoap.dto.FonedeResponseDTO;
import com.co.callingserviceSoap.dto.MultiAfiliadoDTO;
import com.co.callingserviceSoap.dto.MultiAfiliadoResponseDTO;
import com.co.callingserviceSoap.dto.SMLVDTO;
import com.co.callingserviceSoap.dto.SMLVResponseDTO;


@CrossOrigin("*")
@RestController
@RequestMapping(value="/tibco-services")
public class CompensarController {
	
	private IAfiliado iAfiliado; 
	private IEmpresa iEmpresa;
	private ICiudad iCiudad;
	private IConsultasAF iConsultasAF;
	private IConsultaDatosBasicos iConsultaDatosBasicos;
	private IConsultaDeCambioDeIdentificacion iConsultaCambioIdentificacion;
	private IConsultaMaestroDeTarjetas iConsultaMaestroDeTarjetas;
	private IDatosBasicos iDatosBasicos;
	private IEmpresaAlfa iEmpresaAlfa;
	private IFonede iFonede;
	private IMultiAfiliado iMultiAfiliado;
	private ISMLV iSMLV;
	private IConsultas iConsultas;
	
	@Autowired
	public CompensarController(
			IAfiliado iAfiliado, IEmpresa iEmpresa, ICiudad iCiudad, 
			IConsultasAF iConsultasAF, IConsultaDatosBasicos iConsultaDatosBasicos,
			IConsultaDeCambioDeIdentificacion iConsultaCambioIdentificacion,
			IConsultaMaestroDeTarjetas iConsultaMaestroDeTarjetas,
			IDatosBasicos iDatosBasicos, IEmpresaAlfa iEmpresaAlfa,
			IFonede iFonede, IMultiAfiliado iMultiAfiliado, 
			ISMLV iSMLV, IConsultas iConsultas) {
		super();
		this.iAfiliado = iAfiliado;		
		this.iEmpresa = iEmpresa;
		this.iCiudad = iCiudad;
		this.iConsultasAF = iConsultasAF;
		this.iConsultaDatosBasicos = iConsultaDatosBasicos;
		this.iConsultaCambioIdentificacion = iConsultaCambioIdentificacion;
		this.iConsultaMaestroDeTarjetas = iConsultaMaestroDeTarjetas;
		this.iDatosBasicos = iDatosBasicos;
		this.iEmpresaAlfa = iEmpresaAlfa;
		this.iFonede = iFonede;
		this.iMultiAfiliado = iMultiAfiliado;
		this.iSMLV = iSMLV;
		this.iConsultas = iConsultas;
	}
	
	@GetMapping(value="/ping")
	public String ping() {
		String rta = "hola mundo";
		return rta;
	}
	
	@PostMapping(value="/afiliado")
	public AfiliadoResponseDTO afiliado(
			@RequestBody AfiliadoDTO afiliadoDto) {
		
		return iAfiliado.doAfiliado(afiliadoDto);
	}

	@PostMapping(value="/empresa")
	public EmpresaResponseDTO empresa(
			@RequestBody EmpresaDTO dto) {
		
		return iEmpresa.doEmpresa(dto);
	}

	@PostMapping(value="/ciudades")
	public CiudadResponseDTO ciudades(
			@RequestBody CiudadDTO dto) {
		
		return iCiudad.doCiudades(dto);
	}

	@PostMapping(value="/consultasAF")
	public ConsultasAFResponseDTO consultasAF(
			@RequestBody ConsultasAFDTO dto) {
		
		return iConsultasAF.doConsultasAF(dto);
	}

	@PostMapping(value="/consultaDatosBasicos")
	public ConsultaDatosBasicosResponseDTO consultaDatosBasicos(
			@RequestBody ConsultaDatosBasicosDTO dto) {
		
		return iConsultaDatosBasicos.doConsultaDatosBasicos(dto);
	}

	@PostMapping(value="/consultaCambioIdentificacion")
	public ConsultaDeCambioDeIdentificacionResponseDTO consultaCambioIdentificacion(
			@RequestBody ConsultaDeCambioDeIdentificacionDTO dto) {
		
		return iConsultaCambioIdentificacion.doConsultaDeCambioDeIdentificacion(dto);
	}
	
	@PostMapping(value="/consultaMaestroDeTarjetas")
	public ConsultaMaestroDeTarjetasResponseDTO consultaMaestroDeTarjetas(
			@RequestBody ConsultaMaestroDeTarjetasDTO dto) {
		
		return iConsultaMaestroDeTarjetas.doConsultaMaestroDeTarjetas(dto);
	}
	
	@PostMapping(value="/datosBasicos")
	public DatosBasicosResponseDTO datosBasicos(
			@RequestBody DatosBasicosDTO dto) {
		
		return iDatosBasicos.doDatosBasicos(dto);
	}
	
	@PostMapping(value="/empresaAlfa")
	public EmpresaAlfaResponseDTO empresaAlfa(
			@RequestBody EmpresaAlfaDTO dto) {
		
		return iEmpresaAlfa.doEmpresaAlfa(dto);
	}
	
	@PostMapping(value="/fonede")
	public FonedeResponseDTO fonede(
			@RequestBody FonedeDTO dto) {
		
		return iFonede.doFonede(dto);
	}
	
	@PostMapping(value="/multiAfiliado")
	public MultiAfiliadoResponseDTO multiAfiliado(
			@RequestBody MultiAfiliadoDTO dto) {
		
		return iMultiAfiliado.doMultiAfiliado(dto);
	}
	
	@PostMapping(value="/smlv")
	public SMLVResponseDTO smlv(
			@RequestBody SMLVDTO dto) {
		
		return iSMLV.doSMLV(dto);
	}
	
	@PostMapping(value="/consultas")
	public ConsultasResponseDTO consultas(
			@RequestBody ConsultasDTO dto) {
		
		return iConsultas.doConsultas(dto);
	}
	
}
