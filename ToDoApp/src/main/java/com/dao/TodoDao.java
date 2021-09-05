package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.entities.ToDo;

@Component
public class TodoDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	

	@Transactional
	public int saveTodo(ToDo t) {
		
	Integer i=	(Integer) hibernateTemplate.save(t);
		return i;
	}
	
	public List<ToDo> getAllTodo(){
		
		List<ToDo> list= hibernateTemplate.loadAll(ToDo.class);
		
		return list;
		
	}
}
