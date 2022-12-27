package com.projects.StudentRecords.repository;

import com.projects.StudentRecords.entity.StudentExamRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<StudentExamRecords, Long> {
}
