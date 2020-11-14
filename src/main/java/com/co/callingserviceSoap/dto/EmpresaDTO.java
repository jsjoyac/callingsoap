package com.co.callingserviceSoap.dto;

import java.io.Serializable;

public class EmpresaDTO implements Serializable{

	private static final long serialVersionUID = 7387965082167857538L;

	private String sApl;
	private String dIdentificacion;
	private Integer iTipo;
	private Integer iDep;
	private String sPrograma;
	private Integer iOpc;
	
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
	 * @return the iDep
	 */
	public Integer getiDep() {
		return iDep;
	}
	/**
	 * @param iDep the iDep to set
	 */
	public void setiDep(Integer iDep) {
		this.iDep = iDep;
	}
	/**
	 * @return the sPrograma
	 */
	public String getsPrograma() {
		return sPrograma;
	}
	/**
	 * @param sPrograma the sPrograma to set
	 */
	public void setsPrograma(String sPrograma) {
		this.sPrograma = sPrograma;
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
