package com.entities;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int todoId;
	private String todoTitle;
	private String todoContent;
	private Date todoDate;
	
	
	public ToDo(String todoTitle, String todoContent, Date todoDate) {
		super();
		this.todoTitle = todoTitle;
		this.todoContent = todoContent;
		this.todoDate = todoDate;
	}

	

	public ToDo() {
		super();
		// TODO Auto-generated constructor stub
	}

	



	public String getTodoTitle() {
		return todoTitle;
	}



	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}



	public String getTodoContent() {
		return todoContent;
	}



	public void setTodoContent(String todoContent) {
		this.todoContent = todoContent;
	}



	public Date getTodoDate() {
		return todoDate;
	}



	public void setTodoDate(Date date) {
		this.todoDate = date;
	}



	@Override
	public String toString() {
		return "ToDo [todoTitle=" + todoTitle + ", todoContent=" + todoContent + ", todoDate=" + todoDate + "]";
	}
	
	
	
}
