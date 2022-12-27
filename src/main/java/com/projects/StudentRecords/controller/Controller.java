package com.projects.StudentRecords.controller;

import com.projects.StudentRecords.entity.Student;
import com.projects.StudentRecords.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class Controller {

    @Autowired
    private Service service;

    @GetMapping("/getStudentList")
    public ResponseEntity<List<Student>> fetchList(){
        return new ResponseEntity<>(service.getStudents(), HttpStatus.OK);
    }

    @PutMapping("/updateStudentById/{id}")
    public void updateStudent(@RequestBody Student student,@PathVariable("id") Long id){
        service.updateStudentName(student,id);
    }
}
