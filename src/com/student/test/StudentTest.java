package com.student.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.dao.StudentDaoImpl;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		StudentDaoImpl studentImpl = context.getBean("studentDao", StudentDaoImpl.class);
		
		/*
		 * Student student = new Student(); student.setId(3); student.setName("Laxman");
		 * student.setMobile(1234); student.setCountry("India");
		 */

		/* Basic crud operations performed */
		
//		studentImpl.insertStudent(student);

//		studentImpl.updateStudent(student);
		
//		studentImpl.deleteStudent(student);
		
//		List<Student> findByName = studentImpl.findByName("Ram");
//		System.out.println(findByName);
//		System.out.println(student);
		
	}

}
