package com.tcs.bigfish.service.user;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import com.tcs.bigfish.bo.impl.ApplicationBOImpl;

public class CustomUserJDBCService extends JdbcDaoImpl  {
	
	private static final Log log = LogFactory.getLog(ApplicationBOImpl.class);
	
	public CustomUserJDBCService() {  
		super(); 
		log.debug(" CustomUserJDBCService is created ...");
    }  
	
	
}
