package com.student.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.student.entity.Student;
import com.student.extractor.StudentResultExtractor;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insertStudent(Student student) {

		String sql = "INSERT INTO STUDENT VALUES (?,?,?,?)";

		Object args[] = { student.getId(), student.getName(), student.getMobile(), student.getCountry() };

		jdbcTemplate.update(sql, args);

	}

	@Override
	public List<Student> findByName(String name) {
		String sql = "select * from student where name = ?";

		List<Student> studentList = jdbcTemplate.query(sql, new StudentResultExtractor(), name);

		return studentList;
	}

	@Override
	public void updateStudent(Student student) {
		String sql = "update student set name=? where id=?";

		Object args[] = { student.getName(), student.getId() };

		jdbcTemplate.update(sql, args);

	}

	@Override
	public void deleteStudent(Student student) {
		String sql = "delete from student where id=?";

		Object args[] = { student.getId() };

		jdbcTemplate.update(sql, args);

	}

}
