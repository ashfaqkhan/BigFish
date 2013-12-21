package com.tcs.bigfish.servlets;

import java.io.File;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;

public class Log4jInit extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Log4JInit Servlet is initializing log4j");
		String log4jLocation = config.getInitParameter("log4j-xmlfile-location");

		ServletContext sc = config.getServletContext();

		if (log4jLocation == null) {
			System.err.println("*** No log4j-xmlfile-location init param, so initializing log4j with BasicConfigurator");
			BasicConfigurator.configure();
		} else {
			String webAppPath = sc.getRealPath("/");
			String log4jXMLFile = webAppPath + log4jLocation;
			File logFile = new File(log4jXMLFile);
			if (logFile.exists()) {
				System.out.println("Initializing log4j with: " + log4jXMLFile);
				PropertyConfigurator.configure(log4jXMLFile);
			} else {
				System.err.println("*** " + log4jXMLFile + " file not found, so initializing log4j with BasicConfigurator");
				BasicConfigurator.configure();
			}
		}
		super.init(config);
	}
}
