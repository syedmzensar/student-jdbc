package com.student.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.student.entity.Student;

public class StudentResultExtractor implements ResultSetExtractor<List<Student>> {

	@Override
	public List<Student> extractData(ResultSet res) throws SQLException, DataAccessException {
		List<Student> studentList = new ArrayList<Student>();
		
		while(res.next()) {
			Student student = new Student();
			student.setId(res.getInt("id"));
			student.setName(res.getString("name"));
			student.setMobile(res.getInt("mobile"));
			student.setCountry(res.getString("country"));
			
			studentList.add(student);
		}
		return studentList;
	}

}
