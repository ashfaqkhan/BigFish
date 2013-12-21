package com.tcs.bigfish.action;

import com.opensymphony.xwork2.ActionSupport;

public class LinkAction extends ActionSupport {

	private static final long serialVersionUID = -2613425890762568273L;
	
	public String userhome() { 
	    System.out.println("********************Successfully Athenticated**************");
		return "userhome";        
	}
	
	public String welcome() { 
	    System.out.println("********************In Link Action**************");
		return "welcome";        
	}
	
	
	

}
