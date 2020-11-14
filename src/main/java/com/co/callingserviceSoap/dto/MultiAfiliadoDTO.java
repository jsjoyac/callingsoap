package com.co.callingserviceSoap.dto;

import java.io.Serializable;

public class MultiAfiliadoDTO implements Serializable{

	/**
	 * 
	*/
	private static final long serialVersionUID = 4398037346037829345L;
	private String sApl;
	private String dIdentificacion;
	private Integer iTipo;
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
	 * @return the dIdentificacion
	 */
	public String getdIdentificacion() {
		return dIdentificacion;
	}
	/**
	 * @param dIdentificacion the dIdentificacion to set
	 */
	public void setdIdentificacion(String dIdentificacion) {
		this.dIdentificacion = dIdentificacion;
	}
	/**
	 * @return the iTipo
	 */
	public Integer getiTipo() {
		return iTipo;
	}
	/**
	 * @param iTipo the iTipo to set
	 */
	public void setiTipo(Integer iTipo) {
		this.iTipo = iTipo;
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
