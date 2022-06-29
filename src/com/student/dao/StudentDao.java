package com.student.dao;

import java.util.List;

import com.student.entity.Student;

public interface StudentDao {

	void insertStudent(Student student);
	
	void updateStudent(Student student);
	
	void deleteStudent(Student student);
	
	List<Student> findByName (String name);
	
	

}
