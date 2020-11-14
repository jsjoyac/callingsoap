package com.co.callingserviceSoap.dto;

import java.io.Serializable;

public class CiudadDTO implements Serializable{

	private static final long serialVersionUID = -5360019124008176954L;
	
	private String sApl;
	private Integer iOpc;
	
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
	 * @return the iOpc
	 */
	public Integer getiOpc() {
		return iOpc;
	}
	/**
	 * @param iOpc the iOpc to set
	 */
	public void setiOpc(Integer iOpc) {
		this.iOpc = iOpc;
	}
	
}
