package com.co.callingserviceSoap.dto;

import java.io.Serializable;

public class SMLVDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4117555666899341337L;
	private String sApl;

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
	
}
