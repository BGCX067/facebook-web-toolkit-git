package com.fwt.core.service;

import java.util.Map;

public interface Service<T> {
	
	
	public boolean checkMandatoryValues();
	public void loadValues(Map<String,String> valuesFromContext);
	public T getPOJO();
	
}
