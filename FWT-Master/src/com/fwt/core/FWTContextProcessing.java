package com.fwt.core;

import com.fwt.entity.FWTOAuth;

public class FWTContextProcessing implements FWTContext {

	
	private FWTOAuth fwtOAuth= new FWTOAuth();
	
	private void processXML(){
		
		
		
	}
	
	@Override
	public FWTOAuth getOAuthObject() {
		
		
		
		
		return this.fwtOAuth;
	}

}
