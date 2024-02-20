package com.curriculumgraph.graphcurriculum.repository;

import com.curriculumgraph.graphcurriculum.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, Long> {
}
