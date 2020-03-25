package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "teachers")
@Data
@NoArgsConstructor
public class Teacher {

    @Id
    @Column(name = "teacher_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private double salary;
    @Column(name = "is_trainee")
    private boolean isTrainee;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "department_id" )
    private Department department;


}
