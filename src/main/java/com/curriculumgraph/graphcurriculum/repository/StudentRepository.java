package com.curriculumgraph.graphcurriculum.repository;

import com.curriculumgraph.graphcurriculum.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
