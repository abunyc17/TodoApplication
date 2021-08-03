package com.abunyc.springboot.Todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Abu
 */

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String loginMessage() {
		
		return "login";
	}

}


