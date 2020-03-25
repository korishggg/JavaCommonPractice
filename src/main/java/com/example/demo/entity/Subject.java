package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "subjects")
@Data
@NoArgsConstructor
public class Subject {

    @Id
    @Column(name = "subject_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subjectName;
    private int studyDuration;

    @ManyToMany(mappedBy = "subjects")
    private List<Department> departments;

}
