package com.fwt.core;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.fwt.core.obj.Context;
import com.fwt.core.obj.FWTOAuthProject;
import com.fwt.core.service.OAuthService;
import com.fwt.core.service.Service;
import com.fwt.exception.NoValueException;



public class FWTContextServlet extends HttpServlet implements FWTContext{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private FWTContext context;
	
	private Map<String,String> contextMap = new HashMap<String, String>();
	private static FWTOAuthProject projectOAuthProperty;
	
	
	public void init() throws ServletException{
		
		Service<FWTOAuthProject> service = new OAuthService();
		System.out.println("Loading Context Properties");
		this.setContextMap();
		System.out.println("Context Property Loading Completed");
		
		System.out.println("Loading Values To OAuth Service");
		service.loadValues(contextMap);
		System.out.println("Load Complete");
		
		System.out.println("Get OAuth POJO");
		projectOAuthProperty = service.getPOJO();
		System.out.println("GET OAuth POJO is set");
		
	}
	
	
	private void setContextMap(){
		
		String clientId = getServletConfig().getInitParameter(Context.PARAM_TYPES.client_id.toString()).toString();
		String redirectUri = getServletConfig().getInitParameter(Context.PARAM_TYPES.redirect_uri.toString()).toString();
		String scope = getServletConfig().getInitParameter(Context.PARAM_TYPES.scope.toString());
		String state = getServletConfig().getInitParameter(Context.PARAM_TYPES.state.toString());
		String responseType = getServletConfig().getInitParameter(Context.PARAM_TYPES.response_type.toString());
		String display = getServletConfig().getInitParameter(Context.PARAM_TYPES.display.toString());
		
		if(clientId == "" || clientId == null){
			System.out.println(new NoValueException(Context.PARAM_TYPES.client_id.toString()).getMessage());
		}else if(redirectUri == "" || redirectUri == null){
			System.out.println(new NoValueException(Context.PARAM_TYPES.redirect_uri.toString()).getMessage());
		}else if(scope == "" || scope == null){
			System.out.println(new NoValueException(Context.PARAM_TYPES.scope.toString()).getMessage());
			
		}else if(state == "" || state == null){
			System.out.println(new NoValueException(Context.PARAM_TYPES.state.toString()).getMessage());
			
		}else if(responseType == "" || responseType == null){
			System.out.println(new NoValueException(Context.PARAM_TYPES.response_type.toString()).getMessage());
			
		}else if(display == "" || display == null){
			System.out.println(new NoValueException(Context.PARAM_TYPES.display.toString()).getMessage());
			
		}else{
			//Good
			contextMap.put(Context.PARAM_TYPES.client_id.toString(),clientId);
			contextMap.put(Context.PARAM_TYPES.redirect_uri.toString(),redirectUri);
			contextMap.put(Context.PARAM_TYPES.scope.toString(),scope);
			contextMap.put(Context.PARAM_TYPES.state.toString(),state);
			contextMap.put(Context.PARAM_TYPES.response_type.toString(),responseType);
			contextMap.put(Context.PARAM_TYPES.display.toString(),display);
		}
		
		
	}
	
	
	
	public void destroy(){
		
	}
	
	
	public FWTOAuthProject getOAuthObject(){
		
		FWTOAuthProject project = new FWTOAuthProject();
		project.setAppId("ABCD");
		try {
			this.init();
			
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return projectOAuthProperty;
	}
	
	
	
}
