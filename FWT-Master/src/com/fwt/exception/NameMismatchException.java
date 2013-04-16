package com.fwt.exception;



public class NameMismatchException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static String message = "Name Configured in web.xml does not match the set property";
	private String finalMessage;
	
	public NameMismatchException(String errorParam){	
		
		super(message+". "+"Parameter Name: "+errorParam+" Is mismatched.");
		this.finalMessage = message+". "+"Parameter Name: "+errorParam+" Is mismatched.";
	}
	
	
	public String getMessage(){
		return this.finalMessage;
	}
}
