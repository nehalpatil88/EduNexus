package com.hexagon.student_service.controller;

import com.hexagon.student_service.entity.student;
import com.hexagon.student_service.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/student")
public class studentController {
@Autowired
    private studentService studentService;

    @GetMapping("/{id}")
    public ResponseEntity<?> fetchStudentById(@PathVariable String id){
        return studentService.fetchStudentById(id);
    }
    @GetMapping
    public ResponseEntity<?> fetchStudents(){
        return studentService.fetchstudents();
    }
    @PostMapping
    public ResponseEntity<?> createStudent(@RequestBody student student){
        return studentService.createStudent(student);
    }
}
