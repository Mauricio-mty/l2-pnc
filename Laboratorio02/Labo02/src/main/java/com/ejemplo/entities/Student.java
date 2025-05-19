package com.ejemplo.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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

public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre")
    private String nombre;

    @Column(name="correo")
    private String correo;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "direccion_id")
    @JsonManagedReference
    private Direccion direccion;

    @OneToMany(mappedBy = "estudiante",
            cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Curso> cursos = new ArrayList<>();

    // Setter manual para sincronizar uno-a-uno
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
