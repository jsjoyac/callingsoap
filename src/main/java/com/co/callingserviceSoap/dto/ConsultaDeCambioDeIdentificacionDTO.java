package com.co.callingserviceSoap.dto;

import java.io.Serializable;

public class ConsultaDeCambioDeIdentificacionDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5836717815902952704L;
	private String sApl;
	private String dIdentificacion;
	private Integer iTipo;
    
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

	
}
