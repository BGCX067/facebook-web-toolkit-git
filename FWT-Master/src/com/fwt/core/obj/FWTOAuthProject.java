package com.fwt.core.obj;

import java.util.List;

/**
 * @author Maneshwar Singh
 *	
 */

/*
 * Loaded From FBAuth.xml File During Loading the FWTContextServlet
 * */
public class FWTOAuthProject {

	
	private String appId;
	private String appName;
	private List<String> permissions;
	private String redirectUrl;
	
	/*
	 * This is to prevent Cross Site Request Fogery
	 * */
	private String state;
	
	
	private String responseType;
	private String display;
	
	
	
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public List<String> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}
	public String getRedirectUrl() {
		return redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getResponseType() {
		return responseType;
	}
	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	
	
	
	
}
