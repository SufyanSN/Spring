package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;
//import org.springframework.transaction.annotation.Transactional;

import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.mysql.cj.Session;
import com.spring.orm.entities.Student;

public class SpringDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	@Transactional
	public int insert(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		
		return i;
	}
	
	@Transactional
	public void getData(int id) {
		Student student = (Student) this.hibernateTemplate.load(Student.class, id); // The proxy will be created
	
		System.out.println(student); //Select statement will be executed
		
		System.out.println("Id-"+student.getStudentId()); //Select statement will be executed
		System.out.println("Name-"+student.getStudentName()); //Select statement will be executed
		System.out.println("City"+student.getStudentCity()); //Select statement will be executed
	}
	
	@Transactional
	public void getAllData() {
		
		List<Student> entities= this.hibernateTemplate.loadAll(Student.class);
		
		for(Student entity:entities) {
			System.out.println(entity);
		}
	}
	
	@Transactional
	public void updateData(Student student) {
		/*
		Student student = (Student) this.hibernateTemplate.load(Student.class, id);
		
		student.setStudentName("Syed Sufyan Ahmed");
		*/
		
		this.hibernateTemplate.saveOrUpdate(student);
		
		System.out.println("Update performed");
	}
	
	@Transactional
	public void deleteEntry(Student student) {
		this.hibernateTemplate.delete(student);
		
		System.out.println("Deletion performed");
	}
}
