package com.cts.AuditSeverity.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import lombok.extern.slf4j.Slf4j;
/**
 * 
 * This class handles the FeignProxy exception
 *
 */
@Slf4j
public class FeignProxyException extends Exception{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	Environment environment;

	public FeignProxyException() {
		super();
		log.info(environment.getProperty("string.start"));

	}

}
