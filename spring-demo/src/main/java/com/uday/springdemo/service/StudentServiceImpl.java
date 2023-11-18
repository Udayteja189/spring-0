package com.uday.springdemo.service;

import com.uday.springdemo.model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    public StudentServiceImpl(List<StudentModel> list) {
        this.list = list;
        list.add(new StudentModel(1,"uday","cse",21));
        list.add(new StudentModel(2,"ajay","it",22));
    }

    List<StudentModel> list = new ArrayList<>();
    @Override
    public List<StudentModel> getStudents() {
        return list;
    }

    @Override
    public void addStudent(StudentModel studentModel) {
        int id = studentModel.getId();
        String name = studentModel.getName();
        String dept = studentModel.getDepartment();
        int age = studentModel.getAge();
        list.add(new StudentModel(id,name,dept,age));
    }

    @Override
    public StudentModel getStudentById(Integer studentId) {
        for(StudentModel sm:list){
            if(sm.getId() == studentId){
                return sm;
            }
        }
        return null;
    }

    @Override
    public void deleteStudent(Integer studentId) {
        list.removeIf(sm -> sm.getId() == studentId);
    }

    @Override
    public StudentModel updateStudent(StudentModel studentModel) {
        StudentModel updated = null;
        for(StudentModel sm:list){
            if(studentModel.getId()==sm.getId()){
                updated = sm;
                sm.setName(studentModel.getName());
                sm.setDepartment(studentModel.getDepartment());
                sm.setAge(studentModel.getAge());
            }
        }
        return updated;
    }

}
