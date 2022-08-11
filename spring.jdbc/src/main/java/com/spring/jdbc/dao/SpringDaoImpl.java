package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("StudentDao")
public class SpringDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	public int insert(Student student) {
		
		String query = "insert into student(id,name,city) values(?,?,?)";
		// TODO Auto-generated method stub
		int res = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		
		return res;
	}

	public int change(Student student) {
		// TODO Auto-generated method stub
		String query = "update student set name=?, city=? where id =?";
		
		int res = this.jdbcTemplate.update(query, student.getName(), student.getCity(),  student.getId());
		
		return res;
	}

	public int delete(int studentId) {
		// TODO Auto-generated method stub
		String query = "delete from student where id=?";
		
		int res = this.jdbcTemplate.update(query, studentId);
		
		return res;
	}

	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		
		String query = "select * from student where id=?";
		
		RowMapperImpl rowMapper = new RowMapperImpl();
		
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		String query = "select * from student";
		
		List<Student> student = this.jdbcTemplate.query(query, new RowMapperImpl());
		return student;
	}
	
	
	
}
