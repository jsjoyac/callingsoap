package com.co.callingserviceSoap.dto;

import java.io.Serializable;

public class FonedeDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5700896954968153778L;
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
