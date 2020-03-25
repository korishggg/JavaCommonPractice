package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "universities")
@Data
@NoArgsConstructor
public class University {

    @Id
    @Column(name = "university_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String universityName;
    private String city;
    private String country;
    private String zip;

    @OneToMany(mappedBy ="university" )
    private List<Department> departments;

}
