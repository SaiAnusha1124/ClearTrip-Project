package com.cleartrip.utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogReports {

	Logger log = null;

	public LogReports() {
		getlogger();
		log = Logger.getLogger(LogReports.class.getName());
	}

	public void getlogger() {
		PropertyConfigurator.configure(
				"C:\\Users\\saianusha.podichervu\\eclipse-workspace\\OnewayClearTrip\\Resources\\log4j\\log4j.properties");
	}

	public void info(String message) {
		log.info(message);
	}

}
