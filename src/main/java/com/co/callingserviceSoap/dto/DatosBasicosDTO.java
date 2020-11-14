package com.co.callingserviceSoap.dto;

import java.io.Serializable;

public class DatosBasicosDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -264455575525970042L;
	private String sApl;
	private String sCodigo;  
	
	/// getter's && setter's
	
	/**
	 * @return the sApl
	 */
	public String getsApl() {
		return sApl;
	}
	/**
	 * @param sApl the sApl to set
	 */
	public void setsApl(String sApl) {
		this.sApl = sApl;
	}
	/**
	 * @return the sCodigo
	 */
	public String getsCodigo() {
		return sCodigo;
	}
	/**
	 * @param sCodigo the sCodigo to set
	 */
	public void setsCodigo(String sCodigo) {
		this.sCodigo = sCodigo;
	}
	
}
