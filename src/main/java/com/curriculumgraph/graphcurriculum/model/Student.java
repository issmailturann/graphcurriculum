package com.curriculumgraph.graphcurriculum.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String grade;
    private String email;
    private String phoneNumber;
    private String city;
    private String country;

    @OneToMany(mappedBy = "student")
    private List<Curriculum> curriculums;

    // Getters and setters





}
