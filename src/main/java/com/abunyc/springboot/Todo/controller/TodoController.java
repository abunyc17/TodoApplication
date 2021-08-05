package com.abunyc.springboot.Todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.abunyc.springboot.Todo.service.LoginService;
import com.abunyc.springboot.Todo.service.TodoService;

/**
 * @author Abu
 */

@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@RequestMapping(value= "/todo-list", method= RequestMethod.GET)
	public String showTodo(ModelMap model) {
		
		String userId = (String)model.get("name");
		model.put("todo", todoService.retrieveTodo(userId));
		
		return "todo-list";
	}
	

}


