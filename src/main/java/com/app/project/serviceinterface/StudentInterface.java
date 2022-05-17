package com.app.project.serviceinterface;

import java.util.List;

import com.app.project.model.Student;

public interface StudentInterface {
     public Student saveStudent(Student student);
     public List<Student> findAllStudent();
}
