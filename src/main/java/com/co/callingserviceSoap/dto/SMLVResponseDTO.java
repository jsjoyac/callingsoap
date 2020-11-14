package com.co.callingserviceSoap.dto;

import java.io.Serializable;

public class SMLVResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4389835037512788521L;
	private Object Table;


	/// getter's && setter's
	
	/**
	 * @return the table
	 */
	public Object getTable() {
		return Table;
	}

	/**
	 * @param table the table to set
	 */
	public void setTable(Object table) {
		Table = table;
	}
	
}
