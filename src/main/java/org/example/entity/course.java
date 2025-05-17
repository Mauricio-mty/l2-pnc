package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "course")
//@Getter
//@Setter
@Data
public class course {
    @Id
    @Column(name = "id_course")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    Column(name = "name_course")
    private String name_course;

    Column(name = "description")
    private String description;

    Column(name = "id_estudiante")
    private int id_estudiante;
}
