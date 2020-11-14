package com.co.callingserviceSoap;

import org.junit.Before;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import wcompensar.caf.Afiliado;
import wcompensar.caf.AfiliadoResponse;
import wcompensar.caf.Ciudades;
import wcompensar.caf.CiudadesResponse;
import wcompensar.caf.ConsultaDatosBasicos;
import wcompensar.caf.ConsultaDatosBasicosResponse;
import wcompensar.caf.ConsultaDeCambioDeIdentificacion;
import wcompensar.caf.ConsultaDeCambioDeIdentificacionResponse;
import wcompensar.caf.ConsultaMaestroDeTarjetas;
import wcompensar.caf.ConsultaMaestroDeTarjetasResponse;
import wcompensar.caf.Consultas;
import wcompensar.caf.ConsultasAF;
import wcompensar.caf.ConsultasAFResponse;
import wcompensar.caf.ConsultasResponse;
import wcompensar.caf.DatosBasicos;
import wcompensar.caf.DatosBasicosResponse;
import wcompensar.caf.Empresa;
import wcompensar.caf.EmpresaAlfa;
import wcompensar.caf.EmpresaAlfaResponse;
import wcompensar.caf.EmpresaResponse;
import wcompensar.caf.Fonede;
import wcompensar.caf.FonedeResponse;
import wcompensar.caf.MultiAfiliado;
import wcompensar.caf.MultiAfiliadoResponse;
import wcompensar.caf.SMLV;
import wcompensar.caf.SMLVResponse;


public class CallingservicesSoapImpls extends ConfigurationHello{
	
	SOAPConnectClient client = new SOAPConnectClient();
	
	private Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

	public CallingservicesSoapImpls(){
		super(); 
		marshaller = this.marshaller();
		client = this.soapconnector(marshaller);
	}
	
	@Before
	public void init() throws Exception {								
		marshaller.setPackagesToScan("wcompensar.caf");
		marshaller.afterPropertiesSet();
	}
	
	/**
	 * doAfiliado
	 */
	public AfiliadoResponse doAfiliado(Afiliado request, String clientEndPoint) {
		
		AfiliadoResponse response = null;
		try {
			response = (AfiliadoResponse) client.
					callWebServices(clientEndPoint, request);
			System.out.println("response: "+response);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return response;
	}

	/**
	 * doEmpresa
	 */
	public EmpresaResponse doEmpresa(Empresa request, String clientEndPoint) {
		
		EmpresaResponse response = null;
		try {
			response = (EmpresaResponse) client.
					callWebServices(clientEndPoint, request);
			System.out.println("response: "+response);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return response;
	}
	
	/**
	 * doCiudades
	 */
	public CiudadesResponse doCiudades(Ciudades request, String clientEndPoint) {
		
		CiudadesResponse response = null;
		try {
			response = (CiudadesResponse) client.
					callWebServices(clientEndPoint, request);
			System.out.println("response: "+response);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return response;
	}
	
	/**
	 * doConsultasAF
	*/
	public ConsultasAFResponse doConsultasAF(
			ConsultasAF request, String clientEndPoint) {
		
		ConsultasAFResponse response = null;
		try {
			response = (ConsultasAFResponse) client.
					callWebServices(clientEndPoint, request);
			System.out.println("response: "+response);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return response;
	}

	/**
	 * doConsultaDatosBasicos
	*/
	public ConsultaDatosBasicosResponse doConsultaDatosBasicos(
			ConsultaDatosBasicos request, String clientEndPoint) {
		
		ConsultaDatosBasicosResponse response = null;
		try {
			response = (ConsultaDatosBasicosResponse) client.
					callWebServices(clientEndPoint, request);
			System.out.println("response: "+response);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return response;
	}

	/**
	 * doConsultaDeCambioDeIdentificacion
	*/
	public ConsultaDeCambioDeIdentificacionResponse doConsultaDeCambioDeIdentificacion(
			ConsultaDeCambioDeIdentificacion request, String clientEndPoint) {
		
		ConsultaDeCambioDeIdentificacionResponse response = null;
		try {
			response = (ConsultaDeCambioDeIdentificacionResponse) client.
					callWebServices(clientEndPoint, request);
			System.out.println("response: "+response);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return response;
	}

	/**
	 * doConsultaMaestroDeTarjetas
	*/
	public ConsultaMaestroDeTarjetasResponse doConsultaMaestroDeTarjetas(
			ConsultaMaestroDeTarjetas request, String clientEndPoint) {
		
		ConsultaMaestroDeTarjetasResponse response = null;
		try {
			response = (ConsultaMaestroDeTarjetasResponse) client.
					callWebServices(clientEndPoint, request);
			System.out.println("response: "+response);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return response;
	}

	/**
	 * doDatosBasicos
	*/
	public DatosBasicosResponse doDatosBasicos(
			DatosBasicos request, String clientEndPoint) {
		
		DatosBasicosResponse response = null;
		try {
			response = (DatosBasicosResponse) client.
					callWebServices(clientEndPoint, request);
			System.out.println("response: "+response);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return response;
	}
	
	/**
	 * doEmpresaAlfa
	*/
	public EmpresaAlfaResponse doEmpresaAlfa(
			EmpresaAlfa request, String clientEndPoint) {
		
		EmpresaAlfaResponse response = null;
		try {
			response = (EmpresaAlfaResponse) client.
					callWebServices(clientEndPoint, request);
			System.out.println("response: "+response);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return response;
	}
	
	/**
	 * doFonede
	*/
	public FonedeResponse doFonede(
			Fonede request, String clientEndPoint) {
		
		FonedeResponse response = null;
		try {
			response = (FonedeResponse) client.
					callWebServices(clientEndPoint, request);
			System.out.println("response: "+response);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return response;
	}
	
	/**
	 * doMultiAfiliado
	*/
	public MultiAfiliadoResponse doMultiAfiliado(
			MultiAfiliado request, String clientEndPoint) {
		
		MultiAfiliadoResponse response = null;
		try {
			response = (MultiAfiliadoResponse) client.
					callWebServices(clientEndPoint, request);
			System.out.println("response: "+response);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return response;
	}
	
	/**
	 * doSMLV
	*/
	public SMLVResponse doSMLV(
			SMLV request, String clientEndPoint) {
		
		SMLVResponse response = null;
		try {
			response = (SMLVResponse) client.
					callWebServices(clientEndPoint, request);
			System.out.println("response: "+response);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return response;
	}
	
	/**
	 * doConsultas
	*/
	public ConsultasResponse doConsultas(
			Consultas request, String clientEndPoint) {
		
		ConsultasResponse response = null;
		try {
			response = (ConsultasResponse) client.
					callWebServices(clientEndPoint, request);
			System.out.println("response: "+response);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return response;
	}
	
	
}
