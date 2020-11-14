package com.co.callingserviceSoap.dto;

import java.io.Serializable;

public class EmpresaAlfaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7922861113679564412L;
	private String sParametros;

	/// getter's && setter's
	
	/**
	 * @return the sParametros
	 */
	public String getsParametros() {
		return sParametros;
	}

	/**
	 * @param sParametros the sParametros to set
	 */
	public void setsParametros(String sParametros) {
		this.sParametros = sParametros;
	}
	
}
