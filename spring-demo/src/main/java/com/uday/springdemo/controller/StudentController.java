package com.uday.springdemo.controller;

import com.uday.springdemo.model.StudentModel;
import com.uday.springdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/demo")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public List<StudentModel> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/{studentId}")
    public StudentModel getStudentById(@PathVariable Integer studentId){
        return  studentService.getStudentById(studentId);
    }

    @PostMapping("/")
    public String addStudent(@RequestBody StudentModel studentModel){
        studentService.addStudent(studentModel);
        return "Student successfully added!";
    }

    @DeleteMapping("/{studentId}")
    public String deleteStudent(@PathVariable Integer studentId){
        studentService.deleteStudent(studentId);
        return "student deleted successfully";
    }

    @PutMapping("/{studentId}")
    public StudentModel updateStudent(@RequestBody StudentModel studentModel){
        return studentService.updateStudent(studentModel);
    }
}
