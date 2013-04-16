package com.fwt.core.auth;

import com.google.inject.ImplementedBy;

@ImplementedBy(FWTAuthentication.class)
public interface  OAuthModule {

	
	/*
	 * Load Up The OAuthModule On FWTAuthentication
	 * */
	public void loadUp();
	
	
	
}
