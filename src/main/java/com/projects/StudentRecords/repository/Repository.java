package com.projects.StudentRecords.repository;

import com.projects.StudentRecords.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Student,Long> {
}
