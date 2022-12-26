package com.projects.StudentRecords.service;

import com.projects.StudentRecords.entity.Student;

import java.util.List;

public interface ServiceInterface {
    List<Student> getAllDetails();

    void saveStudent(Student student);

    void updateStudentName(Student student,Long id);
}
