package com.curriculumgraph.graphcurriculum.resolvers;

import com.curriculumgraph.graphcurriculum.model.Curriculum;
import com.curriculumgraph.graphcurriculum.model.Student;
import com.curriculumgraph.graphcurriculum.repository.CurriculumRepository;
import com.curriculumgraph.graphcurriculum.repository.StudentRepository;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.kickstart.annotations.GraphQLQueryResolver;
import java.lang.annotation.Annotation;

@DgsComponent
public class Query implements GraphQLQueryResolver {

    private final StudentRepository studentRepository;
    private final CurriculumRepository curriculumRepository;


    // Constructor ile repository'lerin enjekte edilmesi
    public Query(StudentRepository studentRepository, CurriculumRepository curriculumRepository) {
        this.studentRepository = studentRepository;
        this.curriculumRepository = curriculumRepository;
    }

    @DgsQuery
    // Tüm öğrencileri döndüren sorgu
    public Iterable<Student> students() {
        return studentRepository.findAll();
    }

    @DgsQuery
    // ID'ye göre tek bir öğrenci döndüren sorgu
    public Student student(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
    @DgsQuery
    // Tüm müfredatları döndüren sorgu
    public Iterable<Curriculum> curriculums() {
        return curriculumRepository.findAll();
    }
    @Override
    public Class<? extends Annotation> annotationType() {

        return null;
    }
}