package com.co.callingserviceSoap.dto;

import java.io.Serializable;

public class ConsultasResponseDTO implements Serializable {

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
