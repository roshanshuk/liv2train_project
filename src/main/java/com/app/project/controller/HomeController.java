package com.app.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.project.model.Student;
import com.app.project.serviceimplementation.StudentServiceImpl;

@RestController

@CrossOrigin("*")
public class HomeController {

	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	@PostMapping(value = "saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		System.out.println("Student save work properly!!!");
		studentServiceImpl.saveStudent(student);
		return student;
	}
	
	@GetMapping(value = "getAllStudents")
	public List<Student> findAllStudent(){
		return studentServiceImpl.findAllStudent();
	}
}
