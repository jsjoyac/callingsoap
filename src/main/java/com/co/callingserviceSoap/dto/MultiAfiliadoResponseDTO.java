package com.co.callingserviceSoap.dto;

import java.io.Serializable;

public class MultiAfiliadoResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3642406391651448868L;
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
