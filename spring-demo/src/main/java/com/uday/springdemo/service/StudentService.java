package com.uday.springdemo.service;

import com.uday.springdemo.model.StudentModel;

import java.util.List;

public interface StudentService {
    List<StudentModel> getStudents();

    void addStudent(StudentModel studentModel);

    StudentModel getStudentById(Integer studentId);

    void deleteStudent(Integer studentId);

    StudentModel updateStudent(StudentModel studentModel);
}
