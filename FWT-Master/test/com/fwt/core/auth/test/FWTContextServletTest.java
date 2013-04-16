package com.fwt.core.auth.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.xml.sax.SAXException;

import com.fwt.core.FWTContext;
import com.fwt.core.auth.OAuthModule;
import com.fwt.core.obj.FWTOAuthProject;
import com.google.inject.Guice;
import com.google.inject.Injector;




public class FWTContextServletTest {

	private OAuthModule module;
	
	public static void main(String args[]) throws IOException, SAXException{
		
		FWTContextServletTest test = new FWTContextServletTest();
		test.servletLoadingTest();
	}
	
	public void servletLoadingTest() throws IOException, SAXException{
		
       /* Injector injector = Guice.createInjector();
		
		OAuthModule returnObject = injector.getInstance(OAuthModule.class);
		
		returnObject.loadUp();
		*/
		Injector injector = Guice.createInjector();
		
		FWTContext context = injector.getInstance(FWTContext.class);
		
		//Load Of POJO Done:: For FWTOAuthProject Loaded on FWTContextServlet Loading
		System.out.println("Hello");
		System.out.println(context.getOAuthObject());
		
		
	}
	
	
}
