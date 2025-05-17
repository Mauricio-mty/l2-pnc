package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "student")
//@Getter
//@Setter
@Data

public class student {

    @Id
    @Column(name = "id_student")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    Column(name = "name")
    private String name;

    Column(name = "email")
    private String mail;




}
