package com.vn.dao;

import java.util.List;
import com.vn.entities.Student;

public interface StudentDao {

	public List<Student> getAllStudents();

	public Student getStudent(int rollNo);

	public void updateStudent(Student student);

	public void deleteStudent(Student student);

	void deleteStudent1(Student student);
}