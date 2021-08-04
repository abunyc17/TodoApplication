package com.abunyc.springboot.Todo.service;

import org.springframework.stereotype.Service;

/**
 * @author Abu
 */

@Service
public class LoginService {
	
	public boolean validateDetails(String userId, String password) {
		/*
		 * if(userId.equalsIgnoreCase("Abunyc") && password.equalsIgnoreCase("dummy")) {
		 * 		return true; 
		 * }
		 * else
		 * { 
		 *  	return false; 
		 * }
		 */
		
		return userId.equals("Abunyc") && password.equals("dummy");
	}

}


