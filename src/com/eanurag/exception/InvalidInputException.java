package com.eanurag.exception;

public class InvalidInputException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorDetails;

	public InvalidInputException(String reason, String errorDetails) {
		// TODO Auto-generated constructor stub
		super(reason);
		this.errorDetails = errorDetails;
	}

	public String getFaultInfo() {
		return errorDetails;
	}

}
