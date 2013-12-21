package com.tcs.bigfish.action.login;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = -2113425890762568273L;
	
	public String login() { 
	    System.out.println("********************In Login Action**************");
	    HttpServletRequest request = ServletActionContext.getRequest();
	    String command = null;
	    String message = request.getParameter("message");
	    System.out.println("**message :::  "+message);
	    if ( message != null && message.equals("invalid") )
	    	command = "invalid";  
	    else if  ( message != null && message.equals("login") )
	    	command = "login";
	    else if  ( message != null && message.equals("success") )
	    	command = "success";
	    else if  ( message != null && message.equals("logout") )
	    	command = "logout";
	    
	   return command; 
	}
}	
	