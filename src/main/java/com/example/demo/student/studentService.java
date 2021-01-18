package com.example.demo.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {
	
	@Autowired
	private StudentRepository  studentRepository;
	
	public List<Student> getAllStudents(){
		
		List<Student> students = new ArrayList<>();
		
		studentRepository.findAll()
		.forEach(students::add);
		
		return students;
		
	}
	
}
