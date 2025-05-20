package com.ejemplo.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "estudiantes")
@Getter
@NoArgsConstructor
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre")
    private String nombre;

    @Column(name="correo")
    private String correo;

    @OneToOne(mappedBy = "estudiante",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY)
    private Direccion direccion;

    @OneToMany(mappedBy = "estudiante",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY)
    private List<Curso> cursos = new ArrayList<>();

    public void setDireccion(Direccion direccion) {
        if (this.direccion != null) {
            this.direccion.setEstudiante(null);
        }
        this.direccion = direccion;
        if (direccion != null) {
            direccion.setEstudiante(this);
        }
    }
}
