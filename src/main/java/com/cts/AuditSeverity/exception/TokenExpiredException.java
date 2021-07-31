package com.cts.AuditSeverity.exception;

public class TokenExpiredException extends Exception{
	/**
	 * 
	 * Handles the token expiration exception
	 *          
	 *
	 */
	
	private static final long serialVersionUID = 1L;
    public TokenExpiredException(String message)
    {
    	super(message);
    }
}
