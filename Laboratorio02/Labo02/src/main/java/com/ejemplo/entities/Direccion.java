package com.ejemplo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "direcciones")
@Getter @Setter @NoArgsConstructor
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)

public class Direccion {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="calle")
    private String calle;

    @Column(name="ciudad")
    private String ciudad;

    @Column(name="pais")
    private String pais;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_id")
    private Student estudiante;
}
