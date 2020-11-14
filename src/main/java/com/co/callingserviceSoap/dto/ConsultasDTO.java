package com.co.callingserviceSoap.dto;

import java.io.Serializable;

public class ConsultasDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3433241477519843700L;
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
