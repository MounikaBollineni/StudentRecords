package com.projects.StudentRecords.controller;

import com.projects.StudentRecords.entity.Student;
import com.projects.StudentRecords.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
