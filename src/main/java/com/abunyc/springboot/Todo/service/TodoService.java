package com.abunyc.springboot.Todo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.abunyc.springboot.Todo.model.Todo;

/**
 * @author Abu
 */

public class TodoService {
	
	private static  List<Todo> todos = new ArrayList<>();
	private static int todoCount = 3;
	
	static {
		todos.add(new Todo(1, "Abunyc", "Learn Java", new Date(), false));
		todos.add(new Todo(2, "Abunyc", "Learn Hibernate", new Date(), false));
		todos.add(new Todo(3, "Abunyc", "Learn Spring boot", new Date(), false));
	}
	
	public List<Todo> retrieveTodo(String user){
		
		List<Todo> filteredTodo = new ArrayList<>();
		for(Todo todo: todos) {
			if(todo.getUser().equals(user)) {
				filteredTodo.add(todo);
			}
		}
		return filteredTodo;
	}
	
	public void addTodo(String user, String desc, Date targetDate, boolean isDone) {
		todos.add(new Todo(++todoCount, user, desc, targetDate, isDone));
	}
	
	public void deleteTodo(int id) {
		Iterator<Todo> iterator = todos.iterator();
		while(iterator.hasNext()) {
			Todo todo = iterator.next();
			if(todo.getId() == id) {
				iterator.remove();
			}
		}
	}

}


