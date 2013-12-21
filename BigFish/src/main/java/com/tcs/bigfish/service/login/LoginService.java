package com.tcs.bigfish.service.login;

import org.springframework.security.authentication.AuthenticationManager; 
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.rememberme.TokenBasedRememberMeServices;
import com.tcs.bigfish.service.user.CustomUserJDBCService;

public class LoginService {
	
	private AuthenticationManager authenticationManager;
	
	private TokenBasedRememberMeServices rememberMeServices;
	
	private CustomUserJDBCService userDetailsService;
	
	
	public void setAuthenticationManager(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}
	
	public void setTokenBasedRememberMeServices(TokenBasedRememberMeServices rememberMeServices) {
		this.rememberMeServices = rememberMeServices;
	}
	
	public void setCustomUserJDBCService(CustomUserJDBCService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}
	
	public AuthenticationManager getAuthenticationManager() {
		return authenticationManager;
	}
	
	public TokenBasedRememberMeServices getTokenBasedRememberMeServices() {
		return rememberMeServices;
	}
	
	public CustomUserJDBCService getCustomUserJDBCService() {
		return userDetailsService;
	}
	
	public  UserDetails getUserdetails(String username) {
		UserDetails ud = userDetailsService.loadUserByUsername(username);
		return ud;
	}
	
	//userDetailsService.loadUserByUsername("sdfs");

	
}
