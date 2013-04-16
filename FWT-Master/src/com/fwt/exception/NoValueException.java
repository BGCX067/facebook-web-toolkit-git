package com.fwt.exception;

public class NoValueException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message;
	public NoValueException(String param){
		super("No Values For "+param+" is defined in the web.xml.");
		message = "No Values For "+param+" is defined in the web.xml.";
	}
	
	public String getMessage(){
		return message;
	}
	
	
}
