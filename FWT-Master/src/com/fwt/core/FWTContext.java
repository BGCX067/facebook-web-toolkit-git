package com.fwt.core;

import com.fwt.core.obj.FWTOAuthProject;
import com.google.inject.ImplementedBy;

@ImplementedBy(FWTContextServlet.class)
public interface FWTContext {

	public static final String FWTOAuthLink =
	
	"https://www.facebook.com/dialog/oauth?client_id=YOUR_APP_ID&redirect_uri=YOUR_REDIRECT_URI&scope=COMMA_SEPARATED_LIST_OF_PERMISSION_NAMES&state=SOME_ARBITRARY_BUT_UNIQUE_STRING";
	
	public enum oAuthUrlStates{
		
		YOUR_APP_ID,
		YOUR_REDIRECT_URI,
		COMMA_SEPARATED_LIST_OF_PERMISSION_NAMES,
		SOME_ARBITRARY_BUT_UNIQUE_STRING
	}
	
	
	public  FWTOAuthProject getOAuthObject();
	
}
