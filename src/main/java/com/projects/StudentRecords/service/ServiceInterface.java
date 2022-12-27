package com.projects.StudentRecords.service;

import com.projects.StudentRecords.entity.Student;

import java.util.List;

public interface ServiceInterface {
    List<Student> getStudents();

    void updateStudentName(Student student, Long id);

    void removeRecord(long id);
}
