package com.greatlearning.service;
import java.util.List;

import com.greatlearning.model.Student;
public interface StudentService {

	List<Student> getAllStudents();
	 Student getStudentById(int id);
	 void save(Student student);
	 void delete(int id);
	
}
