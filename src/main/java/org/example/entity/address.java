package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "address")
//@Getter
//@Setter
@Data
public class address {


    @Id
    @Column(name = "id_address")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    Column(name = "calle")
    private String calle;

    Column(name = "ciudad")
    private String ciudad;

    Column(name = "pais")
    private String pais;

    Column(name = "id_estudiante")
    private int id_estudiante;

}
