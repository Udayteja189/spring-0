package com.uday.springdemo.service;

import com.uday.springdemo.model.StudentModel;
import com.uday.springdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentModel> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void addStudent(StudentModel studentModel) {
        studentRepository.save(studentModel);
    }

    @Override
    public StudentModel getStudentById(Integer studentId) {
        List<StudentModel> students = getStudents();
        for(StudentModel sm:students){
            if(sm.getId()==studentId){
                return sm;
            }
        }
        return null;
    }

    @Override
    public void deleteStudent(Integer studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public StudentModel updateStudent(StudentModel studentModel) {
        return studentRepository.save(studentModel);
    }

}
