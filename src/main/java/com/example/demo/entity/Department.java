package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity(name = "departments")
@Data
@NoArgsConstructor
public class Department {

    @Id
    @Column(name = "department_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(generator = "sequence-generator")
//    @GenericGenerator(
//            name = "sequence-generator",
//            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
//            parameters ={
//                    @Parameter(name = "sequence_name", value = "department_sequence"),
//                    @Parameter(name = "initial_value", value = "1"),
//                    @Parameter(name = "increment_size", value = "1"),
//            })
    private Long id;

    private String departmentName;

    @ManyToOne
    @JoinColumn(name = "university_id", referencedColumnName = "university_id")
    private University university;

    @OneToMany(mappedBy = "department")
    private List<Group> groups;

    @ManyToMany
    @JoinTable(
            name = "department_subject",
            joinColumns = @JoinColumn(name = "department_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id"))
    private List<Subject> subjects;

    @OneToMany(mappedBy = "department")
    private List<Teacher> teachers;
}
