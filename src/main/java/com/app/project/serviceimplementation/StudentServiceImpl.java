package com.app.project.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.project.dao.StudentRepository;
import com.app.project.model.Student;
import com.app.project.serviceinterface.StudentInterface;

@Service
public class StudentServiceImpl implements StudentInterface {
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return (List<Student>) studentRepo.findAll();
	}

}
