package com.abunyc.springboot.Todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abunyc.springboot.Todo.service.LoginService;

/**
 * @author Abu
 */

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value= "/login", method= RequestMethod.GET)
	public String showLogin(ModelMap model) {
		
		//model.put("name", name);
		
		return "login";
	}
	
	@RequestMapping(value= "/login", method= RequestMethod.POST)
	public String showWelcome(ModelMap model, @RequestParam String name, @RequestParam String password) {
		
		boolean isValidCredentials = loginService.validateDetails(name, password);
		
		if(!isValidCredentials) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		
		model.put("name", name);
		model.put("pword", password);
		
		return "welcome";
	}

}


