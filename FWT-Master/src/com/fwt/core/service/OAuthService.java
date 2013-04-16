package com.fwt.core.service;


import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

import com.fwt.core.obj.Context;
import com.fwt.core.obj.FWTOAuthProject;
import com.fwt.core.obj.OAuthPermissions;
import com.fwt.exception.NameMismatchException;
import com.fwt.exception.NoValueException;

public class OAuthService implements Service<FWTOAuthProject>{

	private String missingParam;
	
	private enum MANDATORY_VALUES{
		client_id,
		redirect_url
	}
	
	
	
	
	private FWTOAuthProject projectEntity;
	public FWTOAuthProject getPOJO(){
		return this.projectEntity;
	}
	
	private Map<String,String> contextMap = new HashMap<String, String>(); 
	

	/*
	 * For OAuth Current Mandatory Values Are client_id and redirect_uri 
	 * */
	
	@Override
	public boolean checkMandatoryValues() {
		// TODO Auto-generated method stub
		
		if(!contextMap.containsKey(MANDATORY_VALUES.client_id)){
			missingParam =MANDATORY_VALUES.client_id.toString()+" ";
			return false;
		}else if(!contextMap.containsKey(MANDATORY_VALUES.redirect_url)){
			missingParam =MANDATORY_VALUES.redirect_url.toString()+" ";
			return false;
		}else{
			return true;
		}
			
		
	}


	private String fetchValues(String input){
		
		return this.contextMap.get(input);
		
	}

	
	
	
	private List<String> fetchPermissions(String input){
		
		List<String> list = new ArrayList<String>();
		
		String[] array = input.split(",");
		
		for(int i=0;i<array.length;i++){
			
			if(array[i] != "" || array[i] != null){
			
				if(OAuthPermissions.permissionsMap.containsKey(array[i])){
				
					list.add(array[i]);
							
				}else{
				
					System.out.println("This Permission Does Not Exist!::::"+array[i]);
					System.out.println(new NameMismatchException(array[i]).getMessage());
			
				}
			}
			
		}
		
		return list;
	}
	
	@Override
	public void loadValues(Map<String, String> valuesFromContext) {
		// TODO Auto-generated method stub
		
		this.contextMap = valuesFromContext;
		
		if(checkMandatoryValues()){
			//Mandatory Values Check Done Now Proceed
			projectEntity.setAppId(valuesFromContext.get(Context.PARAM_TYPES.client_id));
			projectEntity.setRedirectUrl(valuesFromContext.get(Context.PARAM_TYPES.redirect_uri));
			
			String value = "";
			 value = this.fetchValues(Context.PARAM_TYPES.display.toString());
			if(value != "" || value != null){
				
				projectEntity.setDisplay(value);
			}
			value = "";
			value = this.fetchValues(Context.PARAM_TYPES.response_type.toString());
			if(value != null || value != ""){
				projectEntity.setResponseType(value);
				
			}
			value = "";
			value = this.fetchValues(Context.PARAM_TYPES.state.toString());
			if(value != null || value != ""){
				projectEntity.setState(value);
			}
			value = "";
			value = this.fetchValues(Context.PARAM_TYPES.scope.toString());
			if(value != null || value != ""){
				
				projectEntity.setPermissions(this.fetchPermissions(value));
			}
			
			
			
		}else{
			//Mandatory Values Are Missing Here::
			new NoValueException(missingParam);
			
		}
		
		
	}
	
	
	
	
	

}
