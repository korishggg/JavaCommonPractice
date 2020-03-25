package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "groups")
@Data
@NoArgsConstructor
public class Group {
    @Id
    @Column(name = "group_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String groupName;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "department_id" )
    private Department department;

    @OneToMany(mappedBy = "group")
    private List<Student> students;
}
