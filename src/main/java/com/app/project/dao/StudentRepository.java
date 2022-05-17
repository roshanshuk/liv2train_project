package com.app.project.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.project.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
