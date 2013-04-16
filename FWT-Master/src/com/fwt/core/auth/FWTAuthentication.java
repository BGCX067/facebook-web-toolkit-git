package com.fwt.core.auth;

import com.fwt.core.FWTContext;
import com.fwt.core.obj.FWTOAuthProject;
import com.fwt.util.GuiceModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;


/*
 * Package Protected Class:: Dependency To Be Injected Using Guice
 * */


class FWTAuthentication implements OAuthModule{

	
	//@Inject
	//private FWTContext context;
	
	private FWTOAuthProject oAuthProject = new FWTOAuthProject();
	
	@Override
	public void loadUp() {
		
		Injector injector = Guice.createInjector();
		
		FWTContext context = injector.getInstance(FWTContext.class);
		
		//Load Of POJO Done:: For FWTOAuthProject Loaded on FWTContextServlet Loading
		System.out.println("Hello");
		System.out.println(context.getOAuthObject());
		//System.out.println(oAuthProject.getAppId());		
	}

	
	

	
	
	
}
