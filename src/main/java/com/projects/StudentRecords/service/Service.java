package com.projects.StudentRecords.service;

import com.projects.StudentRecords.entity.Student;
import com.projects.StudentRecords.entity.StudentExamRecords;
import com.projects.StudentRecords.repository.ExamRepository;
import com.projects.StudentRecords.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service implements ServiceInterface {

    @Autowired
    private Repository repository;
    @Autowired
    private ExamRepository examRepository;
    public List<Student> getStudents() {
        return repository.findAll();
    }

    @Override
    public void updateStudentName(Student student, Long id) {
        Student dataToChange=repository.getById(id);
        dataToChange.setName(student.getName());
        repository.save(dataToChange);
    }

    @Override
    public void removeRecord(long id) {
        repository.deleteById(id);
    }

    @Override
    public void addStudentIntoJoinedTable(Student student) {
        repository.save(student);
    }

    @Override
    public StudentExamRecords addStudentRecords(Long id) {
        return repository.getById(id).getExamRecords();
    }
}
