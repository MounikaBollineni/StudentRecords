CREATE TABLE student_exam_records(
     id Int NOT NULL PRIMARY KEY,
    subject_name varchar(50),
    marks Double precision,
    grade varchar(2),

       FOREIGN KEY (id) REFERENCES student (id) ON DELETE CASCADE
    );