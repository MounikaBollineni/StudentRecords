package com.projects.StudentRecords.service;

import com.projects.StudentRecords.entity.Student;
import com.projects.StudentRecords.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service implements ServiceInterface {

    @Autowired
    private Repository repository;
    public List<Student> getStudents() {
        return repository.findAll();
    }
}
