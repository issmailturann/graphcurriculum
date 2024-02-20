package com.curriculumgraph.graphcurriculum.repository;

import com.curriculumgraph.graphcurriculum.model.Curriculum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculumRepository extends JpaRepository<Curriculum, Long> {
}
