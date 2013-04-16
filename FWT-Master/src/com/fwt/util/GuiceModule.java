package com.fwt.util;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceModule<T> {

	
	public T createAndGetInjector(Class<T> classObject){
		
		Injector injector = Guice.createInjector();
		
		T returnObject = injector.getInstance(classObject);
		
		return returnObject;
	}
	
}
